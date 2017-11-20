Feature: user wants to remove a previously saved kirjavinkki

  Scenario: user wants to remove a kirjavinkki
    Given user is at vinkki page
    When user clicks on Poista-nappula on a previously saved book
    Then previously saved book with author "Uncle Bob" and comment "Aivan eeppinen tekele Uncle Bobilta" is deleted and not available on vinkki page