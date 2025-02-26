@Contact-us @regression
Feature: Webdriver University-Contact Us Page

  Background:
    Given I access the webdriver university contact us page

  Scenario: Validate Successful Submission- Unique Data
    When I enter a unique first name
    And I enter unique last name
    And I enter unique email address
    And I enter a unique comment
    And I click on submit button
    Then I should be presented with a successful contact us submission message


    Scenario: Validate Successful Submission- Specific Data
      When I enter a specific first name sarah
      And I enter a specific last name woods
      And I enter specific email address joe_blogs123@mail.com
      And I enter a specific comment "How are you today?"
      And I click on submit button
      Then  I should be presented with a successful contact us submission message
