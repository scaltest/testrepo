Feature: Subtraction
  Scenario Outline: Subtract two positive numbers
    Given I have two positive numbers <a> and <b>
    And I pass them to the sub function
    Then I should get the difference of the two numbers <difference>

    Examples:
      | a | b | difference |
      | 3 | 2 | 1 |
      | 6 | 2 | 4 |
      | 70 | 50 | 20 |

  Scenario Outline: Subtract two negative numbers
    Given I have two negative numbers <a> and <b>
    And I pass them to the sub function
    Then I should get the difference of the two numbers <difference>

    Examples:
      | a | b | difference |
      | -1 | -2 | 1 |
      | -4 | -2 | -2 |
      | -20 | -50 | 30 |
