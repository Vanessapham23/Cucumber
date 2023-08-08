Feature: Techfios Billing login page functionality validation

  Background: 
    Given User is on the techfios login page

  @Smoke
  Scenario: User should Be able to login valid credentials
    When User enters username as "demo@techfios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page

  Scenario: User should not be able to login valid credentials
    When User enters username as "demo@techfios.com"
    When User enters password as "abc1234"
    When User clicks on sign in button
    Then User should land on dashboard page
