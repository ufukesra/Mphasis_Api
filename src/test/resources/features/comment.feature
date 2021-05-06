@comments
  Feature: Comments API Service Tests

    Scenario: I should be able to receive all comments list from comments endpoint
      Given send a get request to "/comments" endpoint to get comments
      Then verify comment list with response headers and status code 200 and size 500

    Scenario: I shouldn't be able to receive comment list from invalid endpoint
      Given send a get request to "/coment" endpoint
      Then verify response with status code 404

    Scenario: I should be able to create a new comment
      Given create a new comment payload and send a post request to "/comments" endpoint
      Then verify create new comment response with status code 201 and body

    Scenario: Schema validation for first comment
      Given send a get request to "/comments/1" endpoint to get comments
      Then validate the comment body with schema validation