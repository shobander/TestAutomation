#@TestToRun
Feature: Confirm whether visa is required to visit UK
#  As a Tourist/Student
#  I want to know if I require Visa to come to the UK from my country.
#  So that I can make a decision before I travel

  Background:
    Given I am on the UKBA website

  @scen1
  Scenario: Country(X) nationalities coming to UK to study for more than 6 months require Visa
    When I provide nationality of "<CountryName>"
    And I click on the Continue button
    And I select the reason "Study"
    And I click on the Continue button
    And I state I am intending to stay for more than 6 months
    And I click on the Continue button
    Then I will be informed "You’ll need a visa to study in the UK"
    Examples:
      | CountryName |
      | Japan       |
      | Ukraine     |
      | Morocco     |
      | USA         |
      | Canada      |
      | Australia   |

  @scen2
  Scenario: Country(A) nationalities coming to UK for Tourism do not require Visa
    When I provide nationality of "<CountryName>"
    And I click on the Continue button
    And I select "tourism" as reason for coming to the UK
    And I click on the Continue button
    Then I will be informed "You will not need a visa to come to the UK"
    Examples:
      | CountryName |
      | Japan       |
      | USA         |
      | Malaysia    |
      | Canada      |
      | Australia   |

  @scen3
  Scenario: Country(B) nationalities coming to UK as Tourists and not travelling or visiting a partner or family require Visa
    When I provide nationality of "<CountryName>"
    And I click on the Continue button
    And I select "tourism" as reason for coming to the UK
    And I click on the Continue button
    And I state I am not travelling or visiting a partner or family
    And I click on the Continue button
    Then I will be informed "You’ll need a visa to come to the UK"
    Examples:
      | CountryName |
      | Russia      |
      | Cuba        |
      | Belarus     |
      | Albania     |
      | Hong Kong   |
      | South Korea |

#  @scenout
#  Scenario Outline: Cuba nationalities coming to UK as Tourists and not travelling or visiting a partner or family require Visa
#    When I provide nationality of "<CountryName>"
#    And I click on the Continue button
#    And I select "tourism" as reason for coming to the UK
#    And I click on the Continue button
#    And I state I am not travelling or visiting a partner or family
#    And I click on the Continue button
#    Then I will be informed "You’ll need a visa to come to the UK"
#    Examples:
#      | CountryName |
#      | Russia      |
#      | Cuba        |
#      | Belarus     |
#      | Albania     |
##      | Hong Kong   |
##      | South Korea|