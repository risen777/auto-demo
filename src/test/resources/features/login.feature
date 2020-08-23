Feature: Login user

  Scenario: Login user
    Then Click "Log In" button
    Then Input login
    Then Input password
    Then Click "Log in" button span
    Then Content with "Messages" visible
