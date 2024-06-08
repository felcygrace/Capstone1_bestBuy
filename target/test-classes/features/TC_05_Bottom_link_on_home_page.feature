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
Feature: Validate bottom links on Best Buy homepage 

Scenario: Verify the presence of important bottom links 
	Given Launch the URL for bottom link 
	When Navigate the bottom link 
	Then Validate the accessibility link 
	And Validate the terms&conditions link 
	And Validate the privacy link 
	And Validate the interestbasedads link 
	