#Author: your.email@your.domain.com
@tag
Feature: To test new customer functionality

  @tag2
  Scenario Outline: To add new customers
    Given The user is in guru home page
    And The use logged in  as manager with "<mngrID>" and "<mngrpass>"
    And The user navigate to new customer page
    When The user enters the customer details "<CustName>","<Gender>","<DOB>","<Address>","<city>","<state>","<PIN>","<Phnum>","<email>" and "<pass>"
    When The user clicks the submit button
    Then The user is registered successfully

    Examples: 
      | CustName | Gender | DOB        | Address        | city    | state | PIN    | Phnum      | email                | pass     | mngrID     | mngrpass |
      | user1    | female | 12/12/1987 | Sundaram Nagar | chennai | TN    | 601203 | 9884514231 | joybenezer@gmail.com | Hello123 | mngr154050 | zamynEs  |
