Feature: Test CRUD methods in sample student REST API Testing

Scenario: Get student record 
Given I set GET student service api 
When   I set request HEADER
And    Send GET HTTP request
Then   I receive valid HTTP Response code 200
And    perform the request based on queries

  
Scenario: Get student record 
Given I set GET user service api  "https://jsonplaceholder.typicode.com/posts"
When I set request HEADER
And Send GET HTTP request
Then I receive valid HTTP Response code 200
And get the titles if userid equalto 7