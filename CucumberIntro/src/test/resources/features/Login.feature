Feature: As a user I want to login so that I can see my dashboard


    @scenario_1
    Scenario: Login as a student
    Given I am on the login page
    When I enter my valid credentials
    Then I will log in
    And I will see my dashboard

    @scenario_2
    Scenario: paramaterized login
    Given I am on the login page
    When I enter as a "sales manager"
    Then I will log in
    And I will see my dashboard

