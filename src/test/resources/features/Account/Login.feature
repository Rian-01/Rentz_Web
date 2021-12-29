@Login
Feature: Login Functionality
  As a user
  I want to be able to Login in Rentz.ID
  So that I am success Login

  @Login_1 #TC_1
  Scenario: I am login with valid email and password
    Given I am open login page in Rentz
    When I am enter email "pamanabi001@gmail.com"
    And I am enter password "pamanabi001"
    And I am click button Login
    Then I am success login
    And Show success message "Anda telah login"


  @Login_F1 #TC_2
  Scenario: I am login with invalid email and password
    Given I am open login page in Rentz
    When I am enter email "pamanabi001@gmail.com"
    And I am enter password "pamanabi00"
    And I am click button Login
    Then I am success login
    And Show Failed message "Email / Kata sandi salah"