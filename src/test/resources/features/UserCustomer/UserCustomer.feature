@Goals
Feature: User Customers Functionality
  As a user customer
  I want to be able to Login in Rentz.ID and can booking product
  So that I am success checkout product rental.

  Background: I am login as User Customer
    Given I am open login page in Rentz
    When I am enter email "pamanabi001@gmail.com"
    And I am enter password "pamanabi001"
    And I am click button Login
    Then I am success login
    And Show success message "Anda telah login" going to Home Page
    And I am click ok button

  @Goals_1
  Scenario: I am User Customer Add Product to My Cart
    And I am select Product
    And I am click rental
    And I click add product
    And I am success take product to cart
    And I am click cart on home page
    And I am select checkmark product
    And I am click checkout button
    And I am select Metode Payment COD
    And I click Pay button
    Then I am success Checkout Product
    And Show success message "Pembayaran Cash On Delivery" and payment page

