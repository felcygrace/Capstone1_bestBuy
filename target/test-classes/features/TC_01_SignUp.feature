#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Sign up Functionality of BestBuy Ecommerce Website 

Scenario: Sign Up Functionality 
	Given User select the country 
	When User click the account 
	And User click the create an account 
	And User enter the firstname <firstName> 
	And User enter the last name <lastName> 
	And User enter the email address <mailId> 
	And User enter the password <password> 
	And User enter the confirm password <confirmPassword> 
	And User enter the mobile number <mobileNumber> 
	And User click the submit 
	Then User validate the create an account successfully or not <firstName> 
	
	
	Examples: 
|firstName| lastName| mailId                | password    | confirmPassword| mobileNumber|
|felcy|       S    | singarajict@gmail.com| Password@123pass| Password@123pass   | 6381698553  |
	
	