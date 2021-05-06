$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/comment.feature");
formatter.feature({
  "name": "Comments API Service Tests",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@comments"
    }
  ]
});
formatter.scenario({
  "name": "I should be able to receive all comments list from comments endpoint",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@comments"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "send a get request to \"/comments\" endpoint to get comments",
  "keyword": "Given "
});
formatter.match({
  "location": "CommentStepDef.send_a_get_request_to_endpoint_to_get_comments(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify comment list with response headers and status code 200 and size 500",
  "keyword": "Then "
});
formatter.match({
  "location": "CommentStepDef.verify_comment_list_with_response_headers_and_status_code_and_size(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I shouldn\u0027t be able to receive comment list from invalid endpoint",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@comments"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "send a get request to \"/coment\" endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "UserStepDef.send_a_get_request_to_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify response with status code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "UserStepDef.verify_response_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I should be able to create a new comment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@comments"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "create a new comment payload and send a post request to \"/comments\" endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "CommentStepDef.create_a_new_comment_payload_and_send_a_post_request_to_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify create new comment response with status code 201 and body",
  "keyword": "Then "
});
formatter.match({
  "location": "CommentStepDef.verify_create_new_comment_response_with_status_code_and_body(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Schema validation for first comment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@comments"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "send a get request to \"/comments/1\" endpoint to get comments",
  "keyword": "Given "
});
formatter.match({
  "location": "CommentStepDef.send_a_get_request_to_endpoint_to_get_comments(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the comment body with schema validation",
  "keyword": "Then "
});
formatter.match({
  "location": "CommentStepDef.validate_the_comment_body_with_schema_validation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/post.feature");
formatter.feature({
  "name": "Post API Service Tests",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@posts"
    }
  ]
});
formatter.scenario({
  "name": "I should be able to receive all post list from posts endpoint",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@posts"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "send a get request to \"/posts\" endpoint to get posts",
  "keyword": "Given "
});
formatter.match({
  "location": "PostStepDef.send_a_get_request_to_endpoint_to_get_posts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify post list with response headers and status code 200 and size 100",
  "keyword": "Then "
});
formatter.match({
  "location": "PostStepDef.verify_post_list_with_response_headers_and_status_code_and_size(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I shouldn\u0027t be able to receive post list from invalid endpoint",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@posts"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "send a get request to \"/pooosst\" endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "UserStepDef.send_a_get_request_to_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify response with status code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "UserStepDef.verify_response_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I should be able to create a new post",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@posts"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "create a new post payload and send a post request to \"/posts\" endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "PostStepDef.create_a_new_post_payload_and_send_a_post_request_to_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify created new post response with status code 201 and body",
  "keyword": "Then "
});
formatter.match({
  "location": "PostStepDef.verify_created_new_post_response_with_status_code_and_body(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Schema validation for first post",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@posts"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "send a get request to \"/posts/1\" endpoint to get posts",
  "keyword": "Given "
});
formatter.match({
  "location": "PostStepDef.send_a_get_request_to_endpoint_to_get_posts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the post body with schema validation",
  "keyword": "Then "
});
formatter.match({
  "location": "PostStepDef.validate_the_post_body_with_schema_validation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/user.feature");
formatter.feature({
  "name": "User API Service Tests",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@users"
    }
  ]
});
formatter.scenario({
  "name": "I should be able to receive all user list from users endpoint",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@users"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "send a get request to \"/users\" endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "UserStepDef.send_a_get_request_to_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user list with response headers and status code 200 and size 10",
  "keyword": "Then "
});
formatter.match({
  "location": "UserStepDef.verify_user_list_with_response_headers_and_status_code_and_size(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I shouldn\u0027t be able to receive user list from invalid users endpoint",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@users"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "send a get request to \"/use\" endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "UserStepDef.send_a_get_request_to_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify response with status code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "UserStepDef.verify_response_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I should be able to create a new user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@users"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "create a new user payload and send a post request to \"/users\" endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "UserStepDef.create_a_new_user_payload_and_send_a_post_request_to_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify response with status code 201 and body",
  "keyword": "Then "
});
formatter.match({
  "location": "UserStepDef.verify_response_with_status_code_and_body(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I should see the created user within the user list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@users"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "send a get request to \"/users/11\" endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "UserStepDef.send_a_get_request_to_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user with id 11 and status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "UserStepDef.verify_user_with_id_and_status_code(Integer,Integer)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c200\u003e but was \u003c404\u003e.\n\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:72)\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:59)\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:84)\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:59)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:263)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:277)\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:493)\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\n\tat io.restassured.internal.ResponseSpecificationImpl.validateResponseIfRequired(ResponseSpecificationImpl.groovy:674)\n\tat jdk.internal.reflect.GeneratedMethodAccessor52.invoke(Unknown Source)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.codehaus.groovy.runtime.callsite.PlainObjectMetaMethodSite.doInvoke(PlainObjectMetaMethodSite.java:43)\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite$PogoCachedMethodSiteNoUnwrapNoCoerce.invoke(PogoMetaMethodSite.java:193)\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite.callCurrent(PogoMetaMethodSite.java:61)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:185)\n\tat io.restassured.internal.ResponseSpecificationImpl.statusCode(ResponseSpecificationImpl.groovy:126)\n\tat io.restassured.specification.ResponseSpecification$statusCode$0.callCurrent(Unknown Source)\n\tat io.restassured.internal.ResponseSpecificationImpl.statusCode(ResponseSpecificationImpl.groovy:134)\n\tat io.restassured.internal.ValidatableResponseOptionsImpl.statusCode(ValidatableResponseOptionsImpl.java:89)\n\tat io.restassured.internal.ValidatableResponseImpl.super$2$statusCode(ValidatableResponseImpl.groovy)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1262)\n\tat org.codehaus.groovy.runtime.ScriptBytecodeAdapter.invokeMethodOnSuperN(ScriptBytecodeAdapter.java:144)\n\tat io.restassured.internal.ValidatableResponseImpl.statusCode(ValidatableResponseImpl.groovy:142)\n\tat io.restassured.internal.ValidatableResponseImpl.statusCode(ValidatableResponseImpl.groovy)\n\tat api_services.Users.verifyCreatedUserwith_Id_And_StatusCode(Users.java:100)\n\tat step_def.UserStepDef.verify_user_with_id_and_status_code(UserStepDef.java:51)\n\tat ✽.verify user with id 11 and status code 200(file:src/test/resources/features/user.feature:20)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Schema validation for first user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@users"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "send a get request to \"/users/1\" endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "UserStepDef.send_a_get_request_to_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the user body with schema validation",
  "keyword": "Then "
});
formatter.match({
  "location": "UserStepDef.validate_the_user_body_with_schema_validation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I shouldn\u0027t be sent invalid data set which is not json format",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@users"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "send a post request with a body which is not json format to \"/users\" endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "UserStepDef.send_a_post_request_with_a_body_which_is_not_json_format_to_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify error code with status code 400",
  "keyword": "Then "
});
formatter.match({
  "location": "UserStepDef.verify_error_code_with_status_code(Integer)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c400\u003e but was:\u003c500\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\n\tat org.junit.Assert.assertEquals(Assert.java:645)\n\tat org.junit.Assert.assertEquals(Assert.java:631)\n\tat api_services.Users.verifyErrorWithStatusCode(Users.java:123)\n\tat step_def.UserStepDef.verify_error_code_with_status_code(UserStepDef.java:70)\n\tat ✽.verify error code with status code 400(file:src/test/resources/features/user.feature:28)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});