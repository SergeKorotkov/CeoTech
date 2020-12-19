

Feature: CeoTech maine page minimum size test

  Background:
    Given users navigate to 'https://ceotech.ca'

  Scenario: Navigate to the main page and verify that title of the page is displayed
    Then verify that main page title is displayed

  Scenario: Navigate to the main page and verify title and top menu is displayed
    Then verify that main page title is displayed
    Then  click Toggle menu button
    And  Verify that  contact button is exist on the main page
    And  Verify that  about button is exist on the main page
    And  Verify that  solutions button is exist on the main page
    And  Verify that  smart home button is exist on the main page
    And  Verify that  Ceotech icon is exist on top on the main page


  Scenario: Verify that elements in dropdown menu are displayed
    Then  click Toggle menu button
    Then click Solutions button
    And  Verify that  Airflow and Temperature Control button is exist in dropdown menu Solutions
    And  Verify that  Light and Outlet Control button is exist in dropdown menu Solutions
    And  Verify that  Roof and Gutter Deicing button is exist in dropdown menu Solutions
    And  Verify that  Plant Watering button is exist in dropdown menu Solutions
    And  Verify that  Home Security button is exist in dropdown menu Solutions
    And  Verify that  Smart Integration button is exist in dropdown menu Solutions

  Scenario: Verify that elements in fluid menu are visible
    Then Verify that  Airflow and Temperature Control is exist in fluid menu
    And  Verify that  Light and Outlet Control is exist in fluid menu
    And  Verify that  Roof and Gutter Deicing is exist in fluid menu
    And  Verify that  Plant Watering is exist in fluid menu
    And  Verify that  Home Security is exist in fluid menu
    And  Verify that  Smart Integration is exist in fluid menu


  Scenario: Verify that elements in footer menu are displayed
    Then Verify that  Ceotech Logo Minisize page is exist on footer menu on the main page
    And Verify that  Airflow and Temperature Control is exist on footer menu on the main page
    And Verify that  Light and Outlet Control is exist on footer menu on the main page
    And Verify that  Roof and Gutter Deicing is exist on footer menu on the main page
    And Verify that  Plant Watering is exist on footer menu on the main page
    And Verify that  Home Security is exist on footer menu on the main page
    And Verify that  Smart Integration is exist on footer menu on the main page
    And Verify that  Copyright Statement is exist on footer menu on the main page
    And Verify that  Privacy Policy is exist on footer menu on the main page
    And Verify that  Contact is exist on footer menu on the main page
    And Verify that  Our Team is exist on footer menu on the main page
    And Verify that  Board of Advisors is exist on footer menu on the main page
    And Verify that  Career is exist on footer menu on the main page
    And Verify that  Facebook icon is exist on footer menu on the main page
    And Verify that  Twitter icon is exist on footer menu on the main page
    And Verify that  Instagram icon is exist on footer menu on the main page
    And Verify that  Linkedin icon is exist on footer menu on the main page
