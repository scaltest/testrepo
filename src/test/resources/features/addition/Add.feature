Feature: Addition
  Scenario Outline: Add two positive numbers
    Given I have two positive numbers <a> and <b>
    And I pass them to the add function
    Then I should get the sum of the two numbers <sum>

    Examples:
      | a | b | sum |
      | 1 | 2 | 3 |
      | 4 | 2 | 6 |
      | 20 | 50 | 70 |

  Scenario Outline: Add two negative numbers
    Given I have two negative numbers <a> and <b>
    And I pass them to the add function
    Then I should get the sum of the two numbers <sum>

    Examples:
      | a | b | sum |
      | -1 | -2 | -3 |
      | -4 | -2 | -6 |
      | -20 | -50 | -70 |
