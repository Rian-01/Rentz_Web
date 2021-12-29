@Checkout
Feature: Checkout Product
  as a user customers
  I want to checkout a product
  so that i am success checkout product and can use a product

  Background: I am login as User Customer
    Given I am open login page in Rentz
    When I am enter email "pamanabi001@gmail.com"
    And I am enter password "pamanabi001"
    And I am click button Login
    Then I am success login
    And Show success message "Anda telah login" going to Home Page
    And I am click ok button

  @Checkout_1
  Scenario: User customer want to checkout product in cart
    And I am select checkmark product
    And I am click checkout button
    And I click Pay button
    Then I am failed Checkout Product
    And Show success message "bad request" on payment page