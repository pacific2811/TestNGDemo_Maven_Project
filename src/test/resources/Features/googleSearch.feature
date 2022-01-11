Feature: Google search feature

  Scenario: Google
    Given browser is open
    And user is on google page
    When User enters text in serach box
    Then User hits enter
    Then User gets result