@users

  Feature: User endpoint tests


    Scenario: I should be able to receive all user list from users endpoint
      Given send a get request to "/users" endpoint
      Then verify user list with response headers and status code 200

    Scenario: I shouldn't be able to receive user list from invalid users endpoint
      Given send a get request to "/use" endpoint
      Then verify response with status code 404

    Scenario: I should be able to create a new user
      Given create a new user payload
      When send a post request to "/users" endpoint
      Then verify response with status code 201
