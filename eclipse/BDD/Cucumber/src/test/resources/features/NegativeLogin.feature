Feature: Negative Validation of Techfios Billing login page

  Background: 
    Given User is on the techfios login page

  @NegativeScenario1
  Scenario Outline: User should be able to login n credentials
    When User enters the {string} in the {string} field
    Then User should land on dashboard page

    Examples: 
      | username          | password |
      | demo@techfios.com | abc123   |
      | demo@techfios.com | abc124   |
      |                   |          |
      | demo@techfios.com | abc123   |
#@NegativeScenario2 @Smoke
#Scenario: User should not be able to login n credentials
#When  User enters username as "demo@techfios.com"
#When  User enters password as "abc124"
#When  User clicks on sign in button
#Then  User should land on dashboard page
#
#@NegativeSenario3
#Scenario: User should NOT be able to login n credentials
#When  User enters username as "demo2@techfios.com"
#When  User enters password as "abc123"
#When  User clicks on sign in button
#Then  User should land on dashboard page
#
#@NegativeScenario4 @Smoke
#Scenario: User should NOT be able to login n credentials
#When  User enters username as ""
#When  User enters password as ""
#When  User clicks on sign in button
#Then  User should land on dashboard page
