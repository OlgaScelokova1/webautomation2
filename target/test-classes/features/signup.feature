Feature: One

  Scenario: Successful sign-up
    Given I have opened landing page
    When I select My Account menu
    And I select Sign up menu
    And I enter valid first name in signup form
    And I enter valid last name in signup form
    And I enter valid mobile number in signup form
    And I enter valid email address in signup form
    And I enter password in signup form
    And I re-enter password in signup form
    And I select SIGN UP button
    Then dashboard is opened

  Scenario: Unsuccessful sign-up
    Given I have opened landing page
    When I select My Account menu
    And I select Sign up menu
    And I enter valid first name in signup form
    Then dashboard is opened
