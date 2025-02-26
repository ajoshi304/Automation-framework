@Login @regression
Feature: Webdriver University-LoginPage

  Background:
    Given I access the webdriver university login page

@login1
  Scenario: Validate Successful login
   When I enter a username webdriver
    And I enter a password webdriver123
    And I click on the login button
    Then I should be presented with the successful login message

  Scenario: Validate Unsuccessful login
    When I enter a username webdriver
    And I enter a password password123
    And I click on the login button
    Then I should be presented with the unsuccessful login message

 @smoke @ignore
  Scenario Outline: Validate - successful & Unsuccessful login
    When I enter a username <username>
    And I enter a password <password>
    And I click on the login button
    Then I should be presented with the following login validation message<loginValidationMessage>

    Examples:
      | username  | password     | loginValidationMessage |
      | webdriver | webdriver123 | validation succeeded   |
      | webdriver | webdriver1   | validation failed      |
      | joe_blogs | password1    | validation failed      |
