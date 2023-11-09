Feature: Verify user login

  Scenario Outline: user login successfully using valid credentials
    Given user opens parabank link
    When user enters <username> and <password>
    And click login button
    Then user is logged in successfully

    Examples: 
      | username | password    |
      | qa006    | parabank006 |
