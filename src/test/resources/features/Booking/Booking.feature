@Booking
Feature: Booking Product
  as a user customers
  I want to rental a product
  so that i am success booking product on cart

  @Booking_1
  Scenario: user customers booking product on Home Page
    Given I am logged page in Rentz
    When I am enter  email "pamanabi001@gmail.com"
    And I am enter  password "pamanabi001"
    And I am logged as Customers
    And I am click a product
    And I am enter StartDate "12/30/2021"
    And I am enter EndDate "12/31/2021"
    Then I am success to booking product message
    And Show success message "Berhasil menambahkan product" on page