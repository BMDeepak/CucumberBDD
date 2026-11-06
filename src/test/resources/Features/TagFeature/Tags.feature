Feature: Validation of OrangeHRM

  Background: Test background
    Given should be in login page
    When credincials are passed
    And press login
    Then should login to homepage

  @Regrssion
  Scenario: Check Tags
    Given Should be on Home page.
    When Clicked on profile.
    Then Logout should be shown.

  @smoke
  Scenario:
    Given should be in Home
    When moved to dashboard
    Then Dashboard should be shown
