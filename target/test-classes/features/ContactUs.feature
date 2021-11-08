
Feature: To test the Contact us page
  @smokeTest
  Scenario: Fill Contact us form and submit

    Given Launch Application
    And I see the home page
    And I Navigate to Contact us page
    When I fill the contact us page with required details
    Then I submit the contact us details
    And I see the success message
