@Product
Feature: Create Product
  I am as a User
  i want to create a product
  so that i am success create product

  Background: I am login as User Customer
    Given I am open login page in Rentz
    When I am enter email "pamanabi001@gmail.com"
    And I am enter password "pamanabi001"
    And I am click button Login
    Then I am success login
    And Show success message "Anda telah login" going to Home Page
    And I am click ok button

  @Product_F1 #User add product Success
  Scenario: User want to add new product
    When I am click Rental Product
    And I am click add
    And I am enter nama "<name>" price "<price>" stock "<stock>" deksripsi "<deskripsi>"
    And I am click guarantee
    And I am select city
    And I am select category
    And I am upload image "<picture/.jpg>"
    And I am click add
    Then I am success add product
