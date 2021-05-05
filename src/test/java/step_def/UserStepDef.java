package step_def;

import api_services.Users;
import io.cucumber.java.en.*;

public class UserStepDef {
    Users user = new Users();




    @Given("send a get request to {string} endpoint")
    public void send_a_get_request_to_endpoint(String endPoint) {
        user.getUserList(endPoint);

    }

    @Then("verify user list with response headers and status code {int}")
    public void verify_user_list_with_response_headers_and_status_code(Integer statusCode) {

        user.verifyResponseWithHeadersAndStatusCode(statusCode);


    }


    @Then("verify response with status code {int}")
    public void verify_response_with_status_code(Integer statusCode) {

        user.verifyInvalidEndpointWithStatusCode(statusCode);
    }


    @Given("create a new user payload")
    public void create_a_new_user_payload() {

    }

    @When("send a post request to {string} endpoint")
    public void send_a_post_request_to_endpoint(String endpoint) {

    }



}