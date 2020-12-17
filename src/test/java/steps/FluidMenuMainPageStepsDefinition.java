package steps;

import static constans.Constants.*;
import page.BasePage;
import page.MainPage;
import utils.SharedDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.*;

public class FluidMenuMainPageStepsDefinition {
    private final MainPage mainPage;
    private final BasePage basePage;
    protected WebDriver driver = SharedDriver.getWebDriver();

    public FluidMenuMainPageStepsDefinition() {
        mainPage = new MainPage();
        basePage = new BasePage();
    }

    @Given("navigate to {string}")
    public void navigateToHttpsCeotechCa(String url) {mainPage.navigateToMainPage(url);}

    @Then("click Airflow and Temperature Control button on fluid menu")
    public void clickAirflowAndTemperatureControlButtonOnFluidMenu() {basePage.clickElementByXPath(AIRFLOW_ICON);
    }

    @And("verify that address {string} is correct")
    public void verifyThatAddressIsCorrect(String expected) {
        String url = driver.getCurrentUrl();
        assertEquals(url, expected);
    }

    @Then("click PLANT WATERING button on fluid menu")
    public void clickPLANTWATERINGButtonOnFluidMenu() {basePage.clickElementByXPath(PLANT_WATERING_ICON);
    }

    @Then("click ROOF & GUTTER DEICING button on fluid menu")
    public void clickROOFGUTTERDEICINGButtonOnFluidMenu() {basePage.clickElementByXPath(ROOF_GUTTER_ICON);
    }

    @Then("click  LIGHT & OUTLET CONTROL button on fluid menu")
    public void clickLIGHTOUTLETCONTROLButtonOnFluidMenu() {basePage.clickElementByXPath(LIGHT_OUTLET_ICON);
    }

    @Then("click  HOME SECURITY button on fluid menu")
    public void clickHOMESECURITYButtonOnFluidMenu() {basePage.clickElementByXPath(HOME_SECURITY_ICON);
    }

    @Then("click  SMART INTEGRATION button on fluid menu")
    public void clickSMARTINTEGRATIONButtonOnFluidMenu() {basePage.clickElementByXPath(SMART_INTEGRATION_ICON);
    }
}
