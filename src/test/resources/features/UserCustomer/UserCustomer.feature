@Goals
Feature: User Customers Functionality
  As a user customer
  I want to be able to Login in Rentz.ID and can booking product
  So that I am success checkout product rental.

  Background: I am Registration as User Customer
    Given Given I am open regis page in Rentz.ID
    When I am enter name "PamanManto"
    And I am enter new email "pamanManto006@gmail.com"
    And I am enter NumberHP "087254122626"
    And I am enter new password "pamanManto006"
    And I am click button Registration
    Then I am success Registration
    And Show success message "Daftar akun berhasil" Regis
    And Clik OK button

  @Goals_1
  Scenario: I am User Customer Add Product to My Cart and Checkout Product
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