Feature: Sign in user scenarios

  @Krishna
  Scenario Outline: valid user should login and see the desired page
    Given user is in home page
    When  user click on login page
    Then  user can see the sign in page
    When  user enter username "<username>" and password "<Password>"
    And   user click on singin botton
    Then  user should be in logged in page


    Examples:
      | username         | Password  |
      | manu1@yahoo.com  | somnathj1 |
      | kinji1@gmail.com |           |

  Scenario: regisiter as a new user
    Given user is in home page
    When  user click on login page
    Then  user can see the sign in page