

Feature: CeoTech top menu test

  Background:
    Given users navigate to 'https://ceotech.ca'

  Scenario: Navigate to the main page and  Ceotech logo link must navigate to the correct destination:
    Then click logo icon
    And  verify  that address "https://ceotech.ca/" opened page is  correct

  Scenario: Navigate to the main page and  SmartHome link must navigate to the correct destination:
    Then click SmartHome button
    And  verify  that address "https://ceotech.ca/" opened page is  correct
    And  verify  that  MAIN_PAGE_TITLE the page is  correct

  Scenario: Navigate to the main page and  ABOUT button link must navigate to the correct destination:
    Then click About button
    And  verify  that address "https://ceotech.ca/about" opened page is  correct
    And  verify  that  ABOUT_PAGE_TITLE the page is  correct

  Scenario: Navigate to the main page and  Contact button link must navigate to the correct destination:
    Then click Contact button
    And  verify  that address "https://ceotech.ca/contact" opened page is  correct
    And  verify  that  CONTACT_PAGE_TITLE the page is  correct

  Scenario: Navigate to the main page and  AIRFLOW & TEMPERATURE CONTROL link must navigate to the correct destination:
    Then click SOLUTIONS button
    Then click AIRFLOW & TEMPERATURE CONTROL button
    And  verify  that address "https://ceotech.ca/airflow-balancing" opened page is  correct
    And  verify  that  AIRFLOW_PAGE_TITLE the page is  correct

  Scenario: Navigate to the main page and  PLANT WATERING link must navigate to the correct destination:
    Then click SOLUTIONS button
    Then click PLANT WATERING button
    And  verify  that address "https://ceotech.ca/plant-watering" opened page is  correct
    And  verify  that  PLANT_PAGE_TITLE the page is  correct

  Scenario: Navigate to the main page and  ROOF & GUTTER DEICING link must navigate to the correct destination:
    Then click SOLUTIONS button
    Then click ROOF & GUTTER DEICING button
    And  verify  that address "https://ceotech.ca/roof-gutter-deicing" opened page is  correct
    And  verify  that  ROOF_PAGE_TITLE the page is  correct

  Scenario: Navigate to the main page and  LIGHT & OUTLET CONTROL link must navigate to the correct destination:
    Then click SOLUTIONS button
    Then click LIGHT & OUTLET CONTROL button
    And  verify  that address "https://ceotech.ca/light-outlet-control" opened page is  correct
    And  verify  that  LIGHT_PAGE_TITLE the page is  correct

  Scenario: Navigate to the main page and  HOME SECURITY link must navigate to the correct destination:
    Then click SOLUTIONS button
    Then click HOME SECURITY button
    And  verify  that address "https://ceotech.ca/home-security" opened page is  correct
    And  verify  that  HOME_SECURITY_PAGE_TITLE the page is  correct

  Scenario: Navigate to the main page and  SMART INTEGRATION link must navigate to the correct destination:
    Then click SOLUTIONS button
    Then click SMART INTEGRATION button
    And  verify  that address "https://ceotech.ca/smart-integration" opened page is  correct
    And  verify  that  SMART_PAGE_TITLE the page is  correct


