@AddCustomerFeature
Feature: Techfios Other billing login page functionality validation

  Background: 
    Given User is on the techfios login page

  Scenario Outline: 
    User should be able to login with valid credentials and open a new account

    When User enters the "<username>" in the "username" field
    When User enters the "<password>" in the "password" field
    And User clicks on "login"
    Then User should land on dashboard page
    Then User should land on Account Page
    And User clicks on "bankCash"
    And User clicks on "newAccount"
    And User enters "<accountTitle>" in the "accountTitle" field on account page
    And User enters "<description>" in the "description" field on account page
    And User enters "<initialBalance>" in the "initialBalance" field on account page
    And User enters "<accountNumber>" in the "accountNumber" field on account page
    And User enters "<contactPerson>" in the "contactPerson" field on account page
    And User enters "<Phone>" in the "phone" field on account page
    And User enters "<internetBankingUrl>" in the "internetBankingUrl" field on account page
    And User clicks on "submit"
    Then User should be able to validate account created successfully

    Examples: 
      | username          | password | accountTitle           | description       | initialBalance | accountNumber | contactPerson | Phone      | internetBankingUrl |
      | demo@techfios.com | abc123   | TechfiosBillingAccount | Checkings account | $100,999       |        100233 | Louis         | 8172289900 | jsajdjasdjaj     |
