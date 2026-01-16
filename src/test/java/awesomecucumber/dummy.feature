Feature: user login

  #1 - Send credentials as a Data Table.
  Scenario: login is successful
    Given I'm an existing customer of xyz app
    | username | password |
    | john     | john123 |
    When I provide my credentials
    Then I'm logged in

  #2 - Concrete outcome in the "Then" step in the form of a message "Hi joh"
  Scenario: login is successful
    Given I'm an existing customer of xyz app
      | username | password |
      | john     | john123 |
    When I provide my credentials
    Then I'm logged in and greeted with a message "Hi john"

  #3 - Send credentials as parameters
  Scenario Outline: login is successful
    Given My username is "<username>" and password is "<password>"
    When I provide my credentials
    Then I'm logged in and greeted with a message "Hi John"
    Examples:
      | username | password |
      | john     | john123 |
  @QA
  Scenario Outline: Dummy scenario
    Given my account balance is $<opening_balance>
    When I withdraw $<withdrawal_amount>
    Then the account balance should be $<closing_balance>

    Examples:
      | opening_balance | withdrawal_amount | closing_balance |
      | 100             | 50                | 50              |
      | 50              | 50                | 0               |