package api_services;

import api_services.bodies.CommentsBody;
import api_services.bodies.PostBody;
import api_services.bodies.UserBody;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class Posts {

    Response response;
    String title;
    String body;

    public void getPostsList(String endPoint) {

        response = given().
                contentType(ContentType.JSON).log().all().
                when().
                get(endPoint).prettyPeek();

    }


    public void verifyResponseWithHeadersAndStatusCode(int statusCode, int postListSize){
        response.then().assertThat().

                statusCode(statusCode).
                and()
                .body("[0].title",is("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
                .body("[99].body",is("cupiditate quo est a modi nesciunt soluta\nipsa voluptas error" +
                        " itaque dicta in\nautem qui minus magnam et distinctio eum\naccusamus ratione error aut")).
                body("id",hasSize(postListSize)).
                and()
                .header("Connection","keep-alive")
                .header("Etag","W/\"6b80-Ybsq/K6GwwqrYkAsFxqDXGC7DoM\"")
                .header("Content-Type","application/json; charset=utf-8");
    }

    public void sendValidPostBodyRequest(String endpoint){
        Faker faker = new Faker();
        title= faker.job().title()+"\n"+faker.book().title();
        body = faker.book().author()+" \n "+faker.book().title();
        Map<String,Object> payload = PostBody.postBody(title,body);


        response= given()
                .contentType(ContentType.JSON).
                        and()
                .body(payload).
                        when()
                .post(endpoint).prettyPeek();
    }

    public void verifyCreatedCommentWithStatusCodeAndBody(int statusCode){
        response.then().
                assertThat()
                .statusCode(statusCode).
                and()
                .body("title",is(title))
                .body("body",is(body)).
                and()
                .header("Content-Type","application/json; charset=utf-8")
                .header("Date",notNullValue())
                .header("Server","cloudflare");


    }

    public void validateTheFirstUserJsonBodyWithSchemaValidator(){

        response.then()
                .body(matchesJsonSchemaInClasspath("postBody.json"));
    }





}
