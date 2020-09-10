$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("rest.feature");
formatter.feature({
  "line": 1,
  "name": "Test CRUD methods in sample student REST API Testing",
  "description": "",
  "id": "test-crud-methods-in-sample-student-rest-api-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 74683901,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Get student record",
  "description": "",
  "id": "test-crud-methods-in-sample-student-rest-api-testing;get-student-record",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I set GET student service api",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I set request HEADER",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Send GET HTTP request",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I receive valid HTTP Response code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "perform the request based on queries",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.i_set_GET_student_service_api()"
});
formatter.result({
  "duration": 348633300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.i_set_request_HEADER()"
});
formatter.result({
  "duration": 151156300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.send_GET_HTTP_request()"
});
formatter.result({
  "duration": 488720400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 35
    }
  ],
  "location": "Stepdefinition.i_receive_valid_HTTP_Response_code(int)"
});
formatter.result({
  "duration": 26053900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.perform_the_request_based_on_queries()"
});
formatter.result({
  "duration": 393471701,
  "status": "passed"
});
formatter.after({
  "duration": 155949201,
  "status": "passed"
});
formatter.before({
  "duration": 2201800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Get student record",
  "description": "",
  "id": "test-crud-methods-in-sample-student-rest-api-testing;get-student-record",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I set GET user service api  \"https://jsonplaceholder.typicode.com/posts\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I set request HEADER",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Send GET HTTP request",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I receive valid HTTP Response code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "get the titles if userid equalto 7",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://jsonplaceholder.typicode.com/posts",
      "offset": 29
    }
  ],
  "location": "Stepdefinition.i_set_GET_user_service_api(String)"
});
formatter.result({
  "duration": 963299,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.i_set_request_HEADER()"
});
formatter.result({
  "duration": 546101,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.send_GET_HTTP_request()"
});
formatter.result({
  "duration": 278378700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 35
    }
  ],
  "location": "Stepdefinition.i_receive_valid_HTTP_Response_code(int)"
});
formatter.result({
  "duration": 1013400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 33
    }
  ],
  "location": "Stepdefinition.get_the_titles_if_userid_equalto(int)"
});
formatter.result({
  "duration": 19823901,
  "status": "passed"
});
formatter.after({
  "duration": 30346800,
  "status": "passed"
});
});