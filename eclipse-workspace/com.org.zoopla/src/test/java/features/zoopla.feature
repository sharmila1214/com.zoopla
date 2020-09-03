Feature: checking funtionality of search button for  list of homes
Scenario Outline: Testcase for validating list with agent name
Given Zoopla application launched 
When verify the homepage using homepage title"<homepagetitle>"
Then enter the "<cityName>" in searchbox and press the enter button
And   printing price values in decending order
Then  Click on fifth th property from the list  
When  click on agentname on the same page
Then  Validate agents page with agent pageheader
And   check the properties having agent name
 
Examples:
|homepagetitle|cityName|
|Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents|london|