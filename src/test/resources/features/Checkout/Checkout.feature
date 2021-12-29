@Checkout
Feature: Checkout Product
  as a user customers
  I want to checkout a product
  so that i am success checkout product and can use a product

  @Checkout_1
  Scenario: User customer want to checkout product in cart
    Given I am logged as Customer
    When I am on the Home Page
    And