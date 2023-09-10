 Feature: API Testing for POST request
Scenario: POST with valid data
Given API "" is up
When I give POST request for "Cucumber-S2-S2"
Then I should get status code 200
And response body should contain "Cucumber-s2-S2"