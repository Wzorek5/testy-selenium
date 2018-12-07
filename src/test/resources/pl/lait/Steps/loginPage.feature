@tag
Feature: Flight reservation
  I want to loin and reserve some flight

  @tag1
  Scenario: login to the app
    Given I open main page
    When I fill the login form with login "Wzorek5" and pass "Stepien1"
    Then I should see the flight reservation form

  Scenario: simple reservation
    Given I open main page
    When I fill the login form with login "Wzorek5" and pass "Stepien1"
    And I click on select button oneWay from type flight
    And I click on select button roundTrip from type flight
    And I click on select button passengers and choose 2
    And I click on select button fromPort and choose London 
    And I click on select button on and choose 12 and 20
    And arrivingInPort and choose