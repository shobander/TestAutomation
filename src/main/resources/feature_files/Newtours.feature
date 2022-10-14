Feature: newtours

  Scenario: Flight finder page

    Given I am on the Newtours homepage

    When I click on Flights link from the Left side menus on the Home page

    Then the Flight finder page should be displayed

    And the default Flight details type selected should be “One way”

    And  the default On date and Returning date should be “January 1”

    And the default service class should be “Economy Class”