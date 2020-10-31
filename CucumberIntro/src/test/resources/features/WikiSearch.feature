@wiki
Feature: Wiki title and search verification

  Background: User is on wiki home page
    Given User is on Wikipedia page


  Scenario: Search functionality title verification
    When User searches "Steve Jobs" in the wiki search page
    Then User should see "Steve Jobs" in the wiki title

  Scenario: Search functionality header verification
    When User searches "Steve Jobs" in the wiki search page
    Then User should see "Steve Jobs" in the main header

  @wikiScenarioOutline
  Scenario Outline: Search functionality header verification
    When User searches "<searchValue>" in the wiki search page
    Then User should see "<expectedTitle>" in the wiki title
    Then User should see "<expectedMainHeader>" in the main header
    Then User should see "<expectedImageHeader>" in the image header

    Examples:
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Dua Lipa        | Dua Lipa        | Dua Lipa           | Dua Lipa            |
      | John Travolta   | John Travolta   | John Travolta      | John Travolta       |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |







