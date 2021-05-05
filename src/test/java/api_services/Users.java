package api_services;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.junit.Assert.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

import org.apache.http.client.HttpResponseException;
import utilities.ConfigurationReader;

public class Users {

   // String userEndpoint= ConfigurationReader.get("users");

    Response response;

    public void getUserList(String endPoint) {

        response = given().
                contentType(ContentType.JSON).log().all().
                when().
                get(endPoint).prettyPeek();

    }


    public void verifyResponseWithHeadersAndStatusCode(int statusCode){
        response.then().assertThat().

                statusCode(statusCode).
                and()
                .body(matchesJsonSchemaInClasspath("userBody.json"))
                .body("[0].name",is("Leanne Graham")).
                and()
                .header("Connection","keep-alive")
                .header("Etag","W/\"160d-1eMSsxeJRfnVLRBmYJSbCiJZ1qQ\"");
    }


    public void verifyInvalidEndpointWithStatusCode(int statusCode){

        assertEquals(statusCode,response.statusCode());


    }



}
