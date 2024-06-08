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
Feature: Navigation and title validation on Best Buy website

Scenario: Navigate through all menus and validate title
    Given Launch the URL link
    When Navigate through each menu
    Then Validate the title on each page
    And Validate the topdeal menu
    And Validate the dealoftheday menu
    And Validate the yesbestbuysellsthat menu
    And Validate the mybestbuymemberships menu
    And Validate the creditcard menu
    And Validate the moregiftcards menu
    And Validate the moregiftideas menu