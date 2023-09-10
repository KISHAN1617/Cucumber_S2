 Feature: API Testing for GET request
Scenario: GET with valid data
Given API URL "https://dummy.restapiexample.com/api/v1" is up
When I give POST request for "167151"
Then I should get status code 200
And response body should contain "167151"