Feature: API Testing for DELETE request
Scenario: DELETE with valid data
Given API URL "https://dummy.restapiexample.com/api/v1" is up
When I give DELETE request for "167151"
Then I should get status code 404
