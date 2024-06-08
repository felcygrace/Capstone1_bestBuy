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
Feature: Sign in Functionality of BestBuy Ecommerce Website 

Scenario: Sign In Functionality positive testcase 
	Given First user select the country 
	When First user click the  account 
	And First user click the signin 
	And First user enter the signin email address <mailId> 
	And First user enter the signin password <password> 
	And First user click the sign in 
	Then First user validate homePage should be displayed 

Scenario: Sign In Functionality negative testcase 
	Given Second user select the country 
	When Second user click the account 
	And Second user click the signin 
	And Second user enter the signin invalid email address <invalidMailId> 
	And Second user enter the signin password <password> 
	And Second user click the sign in 
	Then Second user validate homePage should be displayed 
	
Scenario: Sign In Functionality negative testcase 
	Given Third user select the country 
	When Third user click the account 
	And Third user click the signin 
	And Third user enter the signin email address <mailId> 
	And Third user enter the signin Invald password <InvalidPassword> 
	And Third user click the sign in 
	Then Third user validate homePage should be displayed 

Scenario: Sign In Functionality negative testcase 
	Given Fourth user select the country 
	When Fourth user click the account 
	And Fourth user click the signin 
	And Fourth user enter the signin email address <invalidMailId> 
	And Fourth user enter the signin Invald password <InvalidPassword> 
	And Fourth user click the sign in 
	Then Fourth user validate homePage should be displayed 
	
	Examples: 
	|mailId | password|InvalidMailId|InvalidPassword|
	|singarajict@gmail.com| Password@123pass|singarajict|Ja123pass|
	
	