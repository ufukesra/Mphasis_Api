package api_services;

import api_services.bodies.CommentsBody;
import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Comments {

    Response response;
    String name;
    String email;
    String body;

    public void getCommentsList(String endPoint) {

        response = given().
                contentType(ContentType.JSON).log().all().
                when().
                get(endPoint).prettyPeek();

    }


    public void verifyResponseWithHeadersAndStatusCode(int statusCode, int userListSize){
        response.then().assertThat().

                statusCode(statusCode).
                and()
                .body("[0].name",is("id labore ex et quam laborum"))
                .body("[499].email",is("Emma@joanny.ca")).
                body("id",hasSize(userListSize)).
                and()
                .header("Connection","keep-alive")
                .header("etag","W/\"26831-8L/dCHuriTuxj+1OR5biYTSa5Yo\"")
                .header("Content-Type","application/json; charset=utf-8");
    }

    public void sendValidCommentBodyRequest(String endpoint){
        Faker faker = new Faker();
         name = faker.name().firstName();
         email = faker.internet().emailAddress();
         body = faker.book().author()+" \n "+faker.book().title();
      Map<String,Object> payload = CommentsBody.commentBody(name,email,body);


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
                .body("name",is(name))
                .body("email",is(email))
                .body("body",is(body)).
                and()
                .header("Content-Type","application/json; charset=utf-8")
                .header("Date",notNullValue())
                .header("Server","cloudflare");


    }

    public void validateTheFirstUserJsonBodyWithSchemaValidator(){

        response.then()
                .body(matchesJsonSchemaInClasspath("commentBody.json"));
    }
}
