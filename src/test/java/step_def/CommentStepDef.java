package step_def;

import api_services.Comments;
import io.cucumber.java.en.*;

public class CommentStepDef {
Comments comment = new Comments();


    @Given("send a get request to {string} endpoint to get comments")
    public void send_a_get_request_to_endpoint_to_get_comments(String endPoint) {

        comment.getCommentsList(endPoint);
    }

    @Then("verify comment list with response headers and status code {int} and size {int}")
    public void verify_comment_list_with_response_headers_and_status_code_and_size(Integer statusCode, Integer commentSize) {
        comment.verifyResponseWithHeadersAndStatusCode(statusCode,commentSize);

    }

    @Given("create a new comment payload and send a post request to {string} endpoint")
    public void create_a_new_comment_payload_and_send_a_post_request_to_endpoint(String endPoint) {
        comment.sendValidCommentBodyRequest(endPoint);
    }

    @Then("verify create new comment response with status code {int} and body")
    public void verify_create_new_comment_response_with_status_code_and_body(Integer statusCode) {

        comment.verifyCreatedCommentWithStatusCodeAndBody(statusCode);
    }

    @Then("validate the comment body with schema validation")
    public void validate_the_comment_body_with_schema_validation() {

        comment.validateTheFirstUserJsonBodyWithSchemaValidator();
    }


}
