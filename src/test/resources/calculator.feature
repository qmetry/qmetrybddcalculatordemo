Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

    @requirementKey=PLA-RQ-6
    Scenario Outline: Add two numbers <num1> & <num2>
    Given I have a calculator
    When I add <num1> and <num2>
    Then the result should be <total>
    Examples: 
    | num1 | num2 | total |
    | 4 | 1 | 5 |
    | -1 | -2 | -3 |

    @requirementKey=PLA-RQ-6
    Scenario Outline: Substract two numbers <num1> & <num2>
    Given I have a calculator
    When I Substract <num1> from <num2>
    Then the result should be <result>
    Examples: 
    | num1 | num2 | result |
    | 3 | 6 | 3 |
    | 4 | 1 | -3 |
    | -1 | 2 | 3 |
    
    @requirementKey=PLA-RQ-6
    Scenario Outline: Multiple Two Numbers <num1> & <num2>
    Given I have a calculator
    When I Multiply <num1> with <num2>
    Then the result should be <result>
    Examples: 
    | num1 | num2 | result |
    | 3 | 6 | 18 |
    | 4 | 1 | 4 |
    | -1 | 2 | -2 |
    
    @requirementKey=PLA-RQ-6
    Scenario Outline: Divide Two Number <num1> & <num2>
    Given I have a calculator
    When I Divide <num1> by <num2>
    Then the result should be <result>
    Examples: 
    | num1 | num2 | result |
    | 6 | 3 | 2 |
    | -4 | 2 | -2 |