Feature: LoginFeature

  Scenario Outline: check login featuee
    Given Login validation
    And move to login page
    When <username> and <password>
    And Click login
    Then Logout button should be shown

    Examples:
      | username | password    |
      | student  | Password123 |
