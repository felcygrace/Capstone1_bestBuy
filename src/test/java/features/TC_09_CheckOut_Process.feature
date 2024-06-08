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
Feature: Checkout Process 

Scenario: 
	Navigate to the checkout page and fill out the form with dummy payment information 
	Given Launch the URL for checkout 
	When Add item to shopping cart 
	And Go to checkout page 
	And Fil the Contact information "<mailId>"  "<mobileNumber>"
	And Fill the payment imformation  "<cardNumber>"  "<firstName>"  "<lastName>"  "<address>"  "<city>"  "<state>"  "<zipcode>"
	Then Validate the order confirmation message 
	
	
	Examples: 
	|mailId|mobileNumber|cardNumber|firstName|lastName|address|city|state|zipcode|
	|felcy@fmial.com|7867565434|6756 7876 567876|Tomnic|Kio|America|los|Alabama|87987|