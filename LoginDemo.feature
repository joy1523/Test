#Author: your.email@your.domain.com

@tag
Feature: To test Login Function

  @tag1
  Scenario: To test the reset button
    Given The user is in guru homepage
    When the user enters username 
    And the user enter password
    And the user click rset button
    Then The user see the fields are empty

  