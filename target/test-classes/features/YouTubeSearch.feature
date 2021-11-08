
Feature: To test youtube search
  @smokeTest
  Scenario: Youtube Search Smoke Test

    Given Open the browser and navigate to URL
    When I enter the search criteria
    Then I Click on search button

  @Regression
  Scenario: Youtube Search Regression Test

    Given Open the browser and navigate to URL
    When I enter the search criteria
    Then I Click on search button