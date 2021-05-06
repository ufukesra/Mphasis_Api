package step_def;

import api_services.Posts;
import io.cucumber.java.en.*;

public class PostStepDef {
    Posts post = new Posts();

    @Given("send a get request to {string} endpoint to get posts")
    public void send_a_get_request_to_endpoint_to_get_posts(String endpoint) {
        post.getPostsList(endpoint);
    }

    @Then("verify post list with response headers and status code {int} and size {int}")
    public void verify_post_list_with_response_headers_and_status_code_and_size(Integer statusCode, Integer postSize) {
        post.verifyResponseWithHeadersAndStatusCode(statusCode,postSize);
    }

    @Given("create a new post payload and send a post request to {string} endpoint")
    public void create_a_new_post_payload_and_send_a_post_request_to_endpoint(String endpoint) {
        post.sendValidPostBodyRequest(endpoint);
    }

    @Then("verify created new post response with status code {int} and body")
    public void verify_created_new_post_response_with_status_code_and_body(Integer statusCode) {
        post.verifyCreatedCommentWithStatusCodeAndBody(statusCode);
    }

    @Then("validate the post body with schema validation")
    public void validate_the_post_body_with_schema_validation() {
        post.validateTheFirstUserJsonBodyWithSchemaValidator();
    }



}
