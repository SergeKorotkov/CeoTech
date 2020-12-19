package steps;

import static constans.Constants.*;
import pages.BasePage;
import pages.MainPage;
import utils.SharedDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.*;


public class FluidMenuMiniSizePageDefinition {
    private final MainPage mainPage;
    private final BasePage basePage;
    protected WebDriver driver = SharedDriver.getWebDriver();

    public FluidMenuMiniSizePageDefinition() {
        mainPage = new MainPage();
        basePage = new BasePage();
    }
    @Given("navigate  to {string}")
    public void navigateToHttpsCeotechCa(String url) {
        mainPage.navigateToMainPage(url);
    }

    @Then("click Airflow and Temperature Control button on fluid menu mini size")
    public void clickAirflowAndTemperatureControlButtonOnFluidMenuMiniSize() {
            basePage.clickElementByXPath(AIRFLOW_ICON_MINISIZE);
        }


    @And("verify that address {string} is  correct")
    public void verifyThatAddressIsCorrect(String expected) {
        String url = driver.getCurrentUrl();
        assertEquals(url, expected);
    }

    @Then("click PLANT WATERING button on fluid menu mini size")
    public void clickPLANTWATERINGButtonOnFluidMenuMiniSize() {
        basePage.clickElementByXPath(PLANT_WATERING_MINISIZE);
    }

    @Then("click ROOF & GUTTER DEICING button on fluid menu mini size")
    public void clickROOFGUTTERDEICINGButtonOnFluidMenuMiniSize() {
        basePage.clickElementByXPath(ROOF_GUTTER_MINISIZE);
    }

    @Then("click  LIGHT & OUTLET CONTROL button on fluid menu mini size")
    public void clickLIGHTOUTLETCONTROLButtonOnFluidMenuMiniSize() {
        basePage.clickElementByXPath(LIGHT_OUTLET_MINISIZE);
    }

    @Then("click  HOME SECURITY button on fluid menu mini size")
    public void clickHOMESECURITYButtonOnFluidMenuMiniSize() {
        basePage.clickElementByXPath(HOME_SECURITY_MINISIZE);
    }

    @Then("click  SMART INTEGRATION button on fluid menu mini size")
    public void clickSMARTINTEGRATIONButtonOnFluidMenuMiniSize() {
        basePage.clickElementByXPath(SMART_INTEGRATION_MINISIZE);
    }
}
