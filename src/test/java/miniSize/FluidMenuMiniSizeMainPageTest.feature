

Feature: Fluid menu on the maine page mini size test

  Background:
    Given navigate  to 'https://ceotech.ca'

  Scenario: Navigate to the  main page and fluid menu Airflow and Temperature Control button link must navigate to the correct destination:
    Then click Airflow and Temperature Control button on fluid menu mini size
    And  verify that address "https://ceotech.ca/airflow-balancing" is  correct
    And  verify that title Airflow and Temperature Control page is  correct

  Scenario: Navigate to the main page and fluid menu PLANT WATERING button link must navigate to the correct destination:
    Then click PLANT WATERING button on fluid menu mini size
    And  verify that address "https://ceotech.ca/plant-watering" is  correct
    And  verify that title PLANT WATERING page is  correct

  Scenario: Navigate to the main page and fluid menu ROOF & GUTTER DEICING button link must navigate to  the correct destination:
    Then click ROOF & GUTTER DEICING button on fluid menu mini size
    And  verify that address "https://ceotech.ca/roof-gutter-deicing" is  correct
    And  verify that title ROOF & GUTTER DEICING page is  correct

  Scenario: Navigate to the main page and fluid menu  LIGHT & OUTLET CONTROL button must navigate to the correct destination:
    Then click  LIGHT & OUTLET CONTROL button on fluid menu mini size
    And  verify that address "https://ceotech.ca/light-outlet-control" is  correct
    And  verify that title LIGHT & OUTLET CONTROL page is  correct

  Scenario: Navigate to the main page and fluid menu  HOME SECURITY button must navigate to the correct destination:
    Then click  HOME SECURITY button on fluid menu mini size
    And  verify that address "https://ceotech.ca/home-security" is  correct
    And  verify that title HOME SECURITY page is  correct

  Scenario: Navigate to the main page and fluid menu  SMART INTEGRATION button must navigate to the correct destination:
    Then click  SMART INTEGRATION button on fluid menu mini size
    And  verify that address "https://ceotech.ca/smart-integration" is  correct
    And  verify that title SMART INTEGRATION page is  correct



