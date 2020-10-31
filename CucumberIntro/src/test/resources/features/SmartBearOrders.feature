Feature: Smartbear order placing feature
  Agile story: When user is on the Order page, user should be able to place
  order after filling out the form


  @smartOrder
  Scenario Outline: User should be able to places order with different data sets
    Given User is logged in into smartbear Tester account and on Order page
    And User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity input box
    And User enters "<customerName>" to customer name input box
    And User enters "<street>" to street input box
    And User enters "<city>" to city input box
    And User enters "<state>" to state input box
    And User enters"<zip>" to zip input box
    And User selects "<cardType>" to card input box
    And User enters "<cardNumber>" to card number input box
    And User enters "<expirationDate>" to experetion date input box
    And User clicks process button
    Then User verifies "<expectedName>" is in the table

    Examples: User fills out the form as follow from the table below
      | product     | quantity | customerName | street    | city      | state | zip   | cardType   | cardNumber   | expirationDate | expectedName |
      | MyMoney     | 1        | Ivanuska     | Kinzie st | Arlington | VA    | 22202 | Visa       | 123456789232 | 23/23          | Ivanuska     |
      | FamilyAlbum | 4        | Micko        | Joey st   | Chicago   | IL    | 60002 | MasterCard | 234567891463 | 12/34          | Micko        |
      | ScreenSaver | 5        | Niksa        | Rachel st | Chicago   | IL    | 60502 | MasterCard | 234365891235 | 12/24          | Niksa        |




