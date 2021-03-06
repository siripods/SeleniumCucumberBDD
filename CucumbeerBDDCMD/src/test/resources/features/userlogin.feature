Feature: feature to test login functionality

  @positive @smoke
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters valid username and password - username: <username>, password: <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |

  @negative
  Scenario Outline: Check login is failed with invalid credentials
    Given user is on login page
    When user enters invalid username and password - username: <username>, password: <password>
    And clicks on login button
    Then error message is displayed - invalid credential

    Examples: 
      | username | password |
      |          | y        |

  @negative
  Scenario Outline: Login ไม่สำเร็จ โดยใส่ credential ผิด
    Given user อยู่ที่หน้าจอ login page
    When user กรอก username, password ผิด - username: <username>, password: <password>
    And คลิกที่ login button
    Then error message ถูกแสดง - invalid credential

    Examples: 
      | username | password |
      | x        |     1234 |
