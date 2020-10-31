@loginWithBackground
Feature: Login feature

  As a user, I should be bale to login with correct credentials
  to different accounts. And dashboard should be displayed

  Background: Backstory is that user is on the login page
    Given User is on the login page

  Scenario: Librarian login scenario

    When Users logs in as librarian
    Then User should see dashboard


  Scenario:  Student login scenario

    When User logs in as student
    Then User is on the login page

  @db
  Scenario: Admin login scenario

    When User logs in as admin
    Then User should see dashboard
