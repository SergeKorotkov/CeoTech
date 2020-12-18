package steps;

import static constans.Constants.*;
import pages.BasePage;
import pages.MainPage;
import utils.SharedDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

public class TopMenuStep {
    private final MainPage mainPage;
    private final BasePage basePage;
    protected WebDriver driver= SharedDriver.getWebDriver();


    public TopMenuStep() {
        basePage = new BasePage();
        mainPage = new MainPage();
    }

    @Then("click logo icon")
    public void clickLogoIcon() {
        mainPage.clickLogoIconButton();
    }

    @Then("click SmartHome button")
    public void clickSmartHomeButton() {
        mainPage.clickSmartHomeButton();
    }

    @Then("click About button")
    public void clickAboutButton() {
        mainPage.clickAboutButton();
    }

    @Then("click Contact button")
    public void clickContactButton() {
        mainPage.clickContactButton();
    }

    @Then("click SOLUTIONS button")
    public void clickSOLUTIONSButton() {
        basePage.clickElementByXPath(SOLUTIONS_BUTTON);
    }

    @Then("click AIRFLOW & TEMPERATURE CONTROL button")
    public void clickAIRFLOWTEMPERATURECONTROLButton() {
        mainPage.clickAirFlowButton();
    }

    @Then("click PLANT WATERING button")
    public void clickPLANTWATERINGButton() {
        mainPage.clickPlantWaterButton();
    }

    @Then("click ROOF & GUTTER DEICING button")
    public void clickROOFGUTTERDEICINGButton() {
        mainPage.clickRoofGutterButton();
    }

    @Then("click LIGHT & OUTLET CONTROL button")
    public void clickLIGHTOUTLETCONTROLButton() {
        mainPage.clickLightOutButton();
    }

    @Then("click HOME SECURITY button")
    public void clickHOMESECURITYButton() {
        mainPage.clickHomeSecurityButton();
    }

    @Then("click SMART INTEGRATION button")
    public void clickSMARTINTEGRATIONButton() {mainPage.clickSmartIntegrationButton(); }


    @And("verify  that address {string} opened page is  correct")
    public void verifyThatAddressOpenedPageIsCorrect(String expected) {
        String url = driver.getCurrentUrl();
        assertEquals(expected, url);
    }

    @And("verify  that  MAIN_PAGE_TITLE the page is  correct")
    public void verifyThatThePageIsCorrect() {
        assertTrue(basePage.isElementExist(MAIN_PAGE_TITLE));
    }

    @And("verify  that  ABOUT_PAGE_TITLE the page is  correct")
    public void verifyThatABOUT_PAGE_TITLEThePageIsCorrect() {
        assertTrue(basePage.isElementExist(ABOUT_PAGE_TITLE));
    }

    @And("verify  that  CONTACT_PAGE_TITLE the page is  correct")
    public void verifyThatCONTACT_PAGE_TITLEThePageIsCorrect() {
        assertTrue(basePage.isElementExist(CONTACT_PAGE_TITLE));
    }

    @And("verify  that  AIRFLOW_PAGE_TITLE the page is  correct")
    public void verifyThatAIRFLOW_PAGE_TITLEThePageIsCorrect() {
        assertTrue(basePage.isElementExist(AIRFLOW_PAGE_TITLE));
    }

    @And("verify  that  PLANT_PAGE_TITLE the page is  correct")
    public void verifyThatPLANT_PAGE_TITLEThePageIsCorrect() {
        assertTrue(basePage.isElementExist(PLANT_PAGE_TITLE));
    }

    @And("verify  that  ROOF_PAGE_TITLE the page is  correct")
    public void verifyThatROOF_PAGE_TITLEThePageIsCorrect() {
        assertTrue(basePage.isElementExist(ROOF_PAGE_TITLE));
    }

    @And("verify  that  LIGHT_PAGE_TITLE the page is  correct")
    public void verifyThatLIGHT_PAGE_TITLEThePageIsCorrect() {
        assertTrue(basePage.isElementExist(LIGHT_PAGE_TITLE));
    }

    @And("verify  that  HOME_SECURITY_PAGE_TITLE the page is  correct")
    public void verifyThatHOME_SECURITY_PAGE_TITLEThePageIsCorrect() {
        assertTrue(basePage.isElementExist(HOME_SECURITY_PAGE_TITLE));
    }

    @And("verify  that  SMART_PAGE_TITLE the page is  correct")
    public void verifyThatSMART_PAGE_TITLEThePageIsCorrect() {
        assertTrue(basePage.isElementExist(SMART_PAGE_TITLE));
    }
}
