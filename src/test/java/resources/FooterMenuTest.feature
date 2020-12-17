

Feature: CeoTech footer menu  test

  Background:
    Given user navigate to "https://ceotech.ca"

  Scenario: Navigate to the main page and footer Ceotech logo  must navigate to the correct destination:
    Then click footer menu logo icon
    And  verify that address "https://ceotech.ca/" the page is correct


  Scenario: Navigate to the main page and footer Contact button link must navigate to the correct destination:
    Then click footer Contact button
    And  verify that address "https://ceotech.ca/contact" the page is correct


  Scenario: Navigate to the main page and  footer AIRFLOW & TEMPERATURE CONTROL link must navigate to the correct destination:
    Then click footer AIRFLOW & TEMPERATURE CONTROL button
    And  verify that address "https://ceotech.ca/airflow-balancing" the page is correct


  Scenario: Navigate to the main page and footer PLANT WATERING link must navigate to the correct destination:
    Then click footer PLANT WATERING button
    And  verify that address "https://ceotech.ca/plant-watering" of opened page is correct

  Scenario: Navigate to the main page and footer ROOF & GUTTER DEICING link must navigate to the correct destination:
    Then click footer ROOF & GUTTER DEICING button
    And  verify that address "https://ceotech.ca/roof-gutter-deicing" of opened page is correct
  Scenario: Navigate to the main page and footer LIGHT & OUTLET CONTROL link must navigate to the correct destination:
    Then click footer LIGHT & OUTLET CONTROL button
    And  verify that address "https://ceotech.ca/light-outlet-control" of opened page is correct
  Scenario: Navigate to the main page and footer HOME SECURITY link must navigate to the correct destination:
    Then click footer HOME SECURITY button
    And  verify that address "https://ceotech.ca/home-security" of opened page is correct
  Scenario: Navigate to the main page and  footer SMART INTEGRATION link must navigate to the correct destination:
    Then click footer SMART INTEGRATION button
    And  verify that address "https://ceotech.ca/smart-integration" of opened page is correct
  Scenario: Navigate to the main page and  footer Copyright Statement link must navigate to the correct destination:
    Then click footer Copyright Statement button
    And  verify that address "https://ceotech.ca/copyright-statement" of opened page is correct
  Scenario: Navigate to the main page and  footer Privacy Policy link must navigate to the correct destination:
    Then click footer Privacy Policy button
    And  verify that address "https://ceotech.ca/privacy-policy" of opened page is correct
  Scenario: Navigate to the main page and  footer Press Kit link must navigate to the correct destination:
    Then click footer Press Kit button
    And  verify that address "https://ceotech.ca/press-kit" of opened page is correct
  Scenario: Navigate to the main page and  footer Facebook link must navigate to the correct destination:
    Then click footer Facebook icon
    And  verify that address "https://www.facebook.com/ceotech.ca" of opened page is correct
    And  verify that title of the page is correct

  Scenario: Navigate to the main page and  footer Twitter link must navigate to the correct destination:
    Then click footer Twitter icon
    And  verify that address "https://twitter.com/ceotechinc" of opened page is correct
    And  verify that title is correct

  Scenario: Navigate to the main page and  footer Instagram link must navigate to the correct destination:
    Then click footer Instagram icon
    And  verify that address "https://www.instagram.com/ceotech.ca/" of opened page is correct
    And  verify  that title of opened pagge is correct

  Scenario: Navigate to the main page and  footer Linkedin link must navigate to the correct destination:
    Then click footer Linkedin icon
    And  verify that address "https://www.linkedin.com/company/ceotech/" of opened page is correct
    And  verify that title of  opened  page is correct

  Scenario: Navigate to the main page and  footer Our Team link must navigate to the correct destination:
    Then click footer Our Team button
    And  verify that address "https://ceotech.ca/about" of opened page is correct
    And  verify title Our team is visible

  Scenario: Navigate to the main page and  footer Board of Advisors link must navigate to the correct destination:
    Then click footer Board of Advisors button
    And  verify that address "https://ceotech.ca/about" of opened page is correct
    And  verify title Board of Advisors is visible

  Scenario: Navigate to the main page and  footer Career link must navigate to the correct destination:
    Then click footer Career button
    And  verify that address "https://ceotech.ca/about" of opened page is correct
    And  verify title Career is visible


