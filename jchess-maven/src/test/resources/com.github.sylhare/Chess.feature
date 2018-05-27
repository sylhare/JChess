Feature: Chess

  Scenario: Display the Chess Board
    Given A game of chess
    When I check the the board
    Then the board is displayed