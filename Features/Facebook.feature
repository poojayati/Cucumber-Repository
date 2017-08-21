Feature: Test Smoke scenarios for facebook

  Scenario Outline: Login with valid credentials
    Given I Open facebook on Mozilla    
    When I enter valid "<username>" and valid "<password>"
    Then Login should be successfull

    Examples: 
      | username  | password  |
      | username1 | password1 |
      | username2 | password3 |
