Feature: newtours

#  Background: Given I am on the Newtours homepage

  @newt1
  Scenario: Flight finder page
    Given I am on the Newtours homepage
    When I click on Flights link from the Left side menus on the Home page
    Then the Flight finder page should be displayed
    And the default Flight details type selected should be “One way”
    And  the default On date and Returning date should be “January 1”
    And the default service class should be “Economy Class”

  @newt2
  Scenario Outline: Register by entering only User information
    Given I am on the Newtours homepage
    When I click on the Register Link
    And I enter "<username>", password and confirm as "<Password>"
    And enter "<CountryName>"
    And I click submit button
    Then confirmation page is displayed with my "<username>"

    Examples:
      | username | Password    | CountryName |
      | Jose     | password120 | ANGOLA      |

@newt3
  Scenario Outline: Register an account with all the fields
    Given I am on the Newtours homepage
    When I click on the Register Link
    When I enter the Contact information of "<Firstname>", "<LastName>", "<PhoneNumber>" and "<Email>"
#    And I enter mailing Information of "<Address>","<City>", "<State>", "<Postcode>" and "<Country>"
    And I enter mailing Information of "<Address>","<City>", "<State>", "<Postcode>"
    And enter "<CountryName>"
#    And I enter User Information of "<Username>", password and confirm password as "<Password>"
    And I enter "<username>", password and confirm as "<Password>"
    And I click submit button
    Then confirmation page is displayed with my "<username>"

    Examples:

      | Firstname | LastName | PhoneNumber | Email       | Address     | City   | State | Postcode | CountryName  | username | Password |

      | Lateef    | abdul    | 0728383884  | weee@tt.com | 87 dest rod | London | Ohio  | da8 3e   | BULGARIA | Bob      | 123456   |