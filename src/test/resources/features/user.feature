@users

  Feature: User API Service Tests


    Scenario: I should be able to receive all user list from users endpoint
      Given send a get request to "/users" endpoint
      Then verify user list with response headers and status code 200 and size 10

    Scenario: I shouldn't be able to receive user list from invalid users endpoint
      Given send a get request to "/use" endpoint
      Then verify response with status code 404

    Scenario: I should be able to create a new user
      Given create a new user payload and send a post request to "/users" endpoint
      Then verify response with status code 201 and body

    Scenario: I should see the created user within the user list
      Given send a get request to "/users/11" endpoint
      Then verify user with id 11 and status code 200

    Scenario: Schema validation for first user
      Given send a get request to "/users/1" endpoint
      Then validate the user body with schema validation

    Scenario:I shouldn't be sent invalid data set which is not json format
      Given send a post request with a body which is not json format to "/users" endpoint
      Then verify error code with status code 400