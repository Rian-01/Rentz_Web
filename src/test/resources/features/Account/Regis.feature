@Regis
Feature: I am user want to regis Rentz.ID website
  so i have account as user customer on Rentz.ID website

  Scenario: I am regis with Valid email Password
    Given Given I am open regis page in Rentz.ID
    When I am enter name "PamanManto"
    And I am enter new email "pamanManto001@gmail.com"
    And I am enter NumberHP "087254122672"
    And I am enter new password "pamanManto001"
    And I am click button Registration
    Then I am success Registration
    And Show success message "Email atau No.Telepon sudah terdaftar" Regis