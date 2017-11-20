Feature: user can add a new kirjavinkki

  Scenario: user wants to add a new Kirjavinkki
    Given user is at vinkki page
    When user inputs "Uncle Bob", "SOLID-Principles in practice", "kirja" and "Aivan eeppinen tekele Uncle Bobilta" for new kirjavinkki and submits information
    Then new kirjavinkki with "SOLID-Principles in practice" and "Uncle Bob" is shown

  Scenario: user wants to remove a kirjavinkki
    Given user is at vinkki page
    When user clicks on Poista-nappula on a previously saved book
    Then previously saved book with author "Uncle Bob" and comment "Aivan eeppinen tekele Uncle Bobilta" is deleted and not available on vinkki page