@Logout
Feature: Logout Functionality
  As a user customer
  I want to be able logout from my account
  So that I close my page

  Background: I am login as User Customer
    Given I am open login page in Rentz
    When I am enter email "pamanabi001@gmail.com"
    And I am enter password "pamanabi001"
    And I am click button Login
    Then I am success login
    And Show success message "Anda telah login" and click ok
    And
