package api_services;

import api_services.bodies.UserBody;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Posts {

    UserBody userBody = new UserBody();


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

    public static void main(String[] args) {
        Posts post= new Posts();
        //System.out.printf(post.createSampleBody().toString());

        Response response = given().
                                    contentType(ContentType.JSON).body(post.createSampleBody()).log().all().
                            when().
                                    post("https://jsonplaceholder.typicode.com/users").prettyPeek();

        System.out.println("Status code"+ response.statusCode());
    }


}
