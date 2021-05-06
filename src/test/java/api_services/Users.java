package api_services;

import static io.restassured.RestAssured.*;

import api_services.bodies.UserBody;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.junit.Assert.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

import org.apache.http.client.HttpResponseException;
import utilities.ConfigurationReader;

public class Users {

    UserBody userBody = new UserBody();


    Response response;

    public void getUserList(String endPoint) {

        response = given().
                contentType(ContentType.JSON).log().all().
                when().
                get(endPoint).prettyPeek();

    }


    public void verifyResponseWithHeadersAndStatusCode(int statusCode, int userListSize){
        response.then().assertThat().

                statusCode(statusCode).
                and()
                .body("[0].name",is("Leanne Graham"))
                .body("[9].name",is("Clementina DuBuque")).
                body("id",hasSize(userListSize)).
                and()
                .header("Connection","keep-alive")
                .header("Etag","W/\"160d-1eMSsxeJRfnVLRBmYJSbCiJZ1qQ\"");
    }


    public void verifyInvalidEndpointWithStatusCode(int statusCode){

        assertEquals(statusCode,response.statusCode());


    }


    public UserBody createSampleBody(){

        userBody.setName("Ali");
        userBody.setUsername("rootUser");
        userBody.setEmail("rootuser@gmail.com");
        userBody.setAddress("first Street","Apt-4",
                "London","SE2 3AD","-15.345","-36.432");
        userBody.setPhone("02198373551");
        userBody.setWebsite("mywebsite.com");
        userBody.setCompany("MyCompany","web/client-server","workspace");


        return userBody;
    }


    public void sendPostRequestWithValidUserBody(String endpoint){
        response =given()
                        .contentType(ContentType.JSON).
                and()
                        .body(createSampleBody()).log().all().
                when()
                        .post(endpoint).prettyPeek();
    }

    public void verifyPostResponseWithStatusCodeAndBody(int statusCode){
        assertEquals(statusCode,response.statusCode());

        response.then()
                .statusCode(statusCode).
                and()
                .body("name",is("Ali"))
                .body("id",is(11)).
                and()
                .header("Location","http://jsonplaceholder.typicode.com/users/11")
                .header("Content-Length","439");

    }



    public void verifyCreatedUserwith_Id_And_StatusCode(int id, int statusCode){

        response.then()
                .assertThat().
                and()
                .statusCode(statusCode).
                and()
                .body("id",is(id));

    }

    public void validateTheFirstUserJsonBodyWithSchemaValidator(){

        response.then()
                .body(matchesJsonSchemaInClasspath("userBody.json"));
    }


    public void createUserWithNotJsonFormatBody(String endpoint){
        response =given()
                    .contentType(ContentType.JSON).
                and()
                    .body(createSampleBody()+"string to make it non json body").log().all().
                when()
                .post(endpoint).prettyPeek();
    }

    public void verifyErrorWithStatusCode(int statusCode){
        assertEquals(statusCode,response.statusCode());
    }
}
