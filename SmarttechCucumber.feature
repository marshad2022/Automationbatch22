@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Smoke 
  Scenario: Title of your scenario
    Given Open Browser 
    And User go to facebook 
    
    When add login userid and password
    And  click on login button
   
    Then I validate the outcomes
    And user will able to see the next page 

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |