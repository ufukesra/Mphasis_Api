@posts
  Feature: Post API Service Tests

    Scenario: I should be able to receive all post list from posts endpoint
    Given send a get request to "/posts" endpoint to get posts
    Then verify post list with response headers and status code 200 and size 100

    Scenario: I shouldn't be able to receive post list from invalid endpoint
      Given send a get request to "/pooosst" endpoint
      Then verify response with status code 404

    Scenario: I should be able to create a new post
      Given create a new post payload and send a post request to "/posts" endpoint
      Then verify created new post response with status code 201 and body

    Scenario: Schema validation for first post
      Given send a get request to "/posts/1" endpoint to get posts
      Then validate the post body with schema validation