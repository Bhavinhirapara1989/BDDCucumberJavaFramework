@EndToEnd1
Feature: Login feature
  As a customer
  I want to Log in
  So that i can see my emails

  Scenario: Validate Login Page
    Given I am on the home page
    When I click on the "Log in"
    Then I should see "Welcome, Please Sign In!" text on login page
    And the url should contain with "/login"


  Scenario: Login with valid Email and Password
    Given I am on the home page
    When I click on the "Log in"
    And I enter my username "samit@samit.com" and password "12345678"
    And I click on Login button on Login page
    Then I should see Logout button displayed

  @BP
  Scenario: Successful registration
    Given I am on the home page
    When I click on register
    Then I select gender Male or Female
    And I enter firstname as "Bhavin" and lastname as "Patel"
    And I enter email as a "bhavin123@yahoo.com"
    And I enter password as a "patel12345" and confirm password as a "patel12345"
    And I click on register button
    And I should see "Your registration completed"

  @BH
  Scenario Outline: Login with morethan one eamilid adn password
    Given I am on the home page
    When I click on the "Log in"
    And I enter my username "<Email>" and password "<Password>"
    And I click on Login button on Login page
    Then I should see Logout button displayed

    Examples:
      | Email           | Password |
      | samit@samit.com | 12345678 |
#      | sa@sa.com          | 87654321    |
#      | kotadia@gmail.com  | Samit@0304  |
#      | samitk@gmail.co.uk | Kotadia@123 |

#  Scenario: Login with valid credentials
#    Given I am on home page
#    When I enter Username & Password
#    And I click on Login button
#    Then I should be Logged in
