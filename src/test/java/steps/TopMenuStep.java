package steps;

import static constans.Constants.*;
import page.BasePage;
import page.MainPage;
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
}
