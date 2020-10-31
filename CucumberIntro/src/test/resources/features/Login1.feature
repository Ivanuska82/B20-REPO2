@login
Feature: Login feature

  As a user, I should be bale to login with correct credentials
  to different accounts. And dashboard should be displayed

  @librarian
  Scenario: Librarian login scenario
    Given User is on the login page
    When Users logs in as librarian
    Then User should see dashboard

  @student
  Scenario:  Student login scenario
    Given User is on the login page
    When User logs in as student
    Then User is on the login page

   @admin
  Scenario: Admin login scenario
    Given User is on the login page
    When User logs in as admin
    Then User should see dashboard