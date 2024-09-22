Feature: Search Functionality
  "I want to search without any error
    so that I can see the product successfully"
  Scenario: User can search successfully whatever user can see
    Given user can see the home page
    When user wants to be search a product user should be click on the search option
    Then write a product name user wants to be for search
    And  Click on search btn
    Then user can see the searched product
    And  see the details of the product
