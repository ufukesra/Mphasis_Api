package step_def;

import api_services.Users;
import io.cucumber.java.en.*;

public class UserStepDef {
    Users user = new Users();




    @Given("send a get request to {string} endpoint")
    public void send_a_get_request_to_endpoint(String endPoint) {
        user.getUserList(endPoint);

    }

    @Then("verify user list with response headers and status code {int} and size {int}")
    public void verify_user_list_with_response_headers_and_status_code_and_size(Integer statusCode, Integer userSize) {

        user.verifyResponseWithHeadersAndStatusCode(statusCode,userSize);


    }


    @Then("verify response with status code {int}")
    public void verify_response_with_status_code(Integer statusCode) {

        user.verifyInvalidEndpointWithStatusCode(statusCode);
    }



    @Given("create a new user payload and send a post request to {string} endpoint")
    public void create_a_new_user_payload_and_send_a_post_request_to_endpoint(String endpoint) {

        user.sendPostRequestWithValidUserBody(endpoint);
    }

    @Then("verify response with status code {int} and body")
    public void verify_response_with_status_code_and_body(Integer statusCode) {
        user.verifyPostResponseWithStatusCodeAndBody(statusCode);
    }


    @Then("verify user with id {int} and status code {int}")
    public void verify_user_with_id_and_status_code(Integer id, Integer statusCode) {


        user.verifyCreatedUserwith_Id_And_StatusCode(id,statusCode);
    }

    @Then("validate the user body with schema validation")
    public void validate_the_user_body_with_schema_validation() {

        user.validateTheFirstUserJsonBodyWithSchemaValidator();
    }

    @Given("send a post request with a body which is not json format to {string} endpoint")
    public void send_a_post_request_with_a_body_which_is_not_json_format_to_endpoint(String endpoint) {

        user.createUserWithNotJsonFormatBody(endpoint);

    }

    @Then("verify error code with status code {int}")
    public void verify_error_code_with_status_code(Integer statusCode) {

        user.verifyErrorWithStatusCode(statusCode);

    }

}