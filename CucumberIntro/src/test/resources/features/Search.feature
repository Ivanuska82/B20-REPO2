Feature: Search
  Agile story: As a user, I should be able to search when i am on Google page

  Background: User should be on google page
    Given User is on the google search page


  Scenario: Google title verification after search
    When User searches apple
    Then User should see apple in the title

  @wip
  Scenario: Google title verification after search
    When User searches "peach"
    Then User should see "peach" in the title

  @wip
  Scenario: Google -About- link page title verification
    Then User should see About link
    And User clicks to About link
    Then User should see title Google - About Google, Our Culture & Company News

  @googleTable
  Scenario: Google search page footer verification
    Then User should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |
      | Settings         |

# Command option L -> to organize
# Command D -> to repeat same line


