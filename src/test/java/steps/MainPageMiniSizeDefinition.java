package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.MainPage;

import static constans.Constants.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageMiniSizeDefinition {
    private final MainPage mainPage;
    private final BasePage basePage;

    public MainPageMiniSizeDefinition() {
        mainPage = new MainPage();
        basePage = new BasePage();
    }


    @Then("Verify that  Airflow and Temperature Control is exist in fluid menu")
    public void verifyThatAirflowAndTemperatureControlIsExistInFluidMenu() {
        assertTrue(basePage.isElementExist(AIRFLOW_ICON_MINISIZE));
    }

    @And("Verify that  Light and Outlet Control is exist in fluid menu")
    public void verifyThatLightAndOutletControlIsExistInFluidMenu() {
        assertTrue(basePage.isElementExist(LIGHT_OUTLET_MINISIZE));
    }

    @And("Verify that  Roof and Gutter Deicing is exist in fluid menu")
    public void verifyThatRoofAndGutterDeicingIsExistInFluidMenu() {
        assertTrue(basePage.isElementExist(ROOF_GUTTER_MINISIZE));
    }

    @And("Verify that  Plant Watering is exist in fluid menu")
    public void verifyThatPlantWateringIsExistInFluidMenu() {
        assertTrue(basePage.isElementExist(PLANT_WATERING_MINISIZE));
    }

    @And("Verify that  Home Security is exist in fluid menu")
    public void verifyThatHomeSecurityIsExistInFluidMenu() {
        assertTrue(basePage.isElementExist(HOME_SECURITY_MINISIZE));
    }

    @And("Verify that  Smart Integration is exist in fluid menu")
    public void verifyThatSmartIntegrationIsExistInFluidMenu() {
        assertTrue(basePage.isElementExist(SMART_INTEGRATION_MINISIZE));
    }

    @Then("Verify that  Ceotech Logo Minisize page is exist on footer menu on the main page")
    public void verifyThatCeotechLogoMinisizePageIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isElementExist(LOGO_FOOTER_MINISIZE));
    }

    @And("verify that title Airflow and Temperature Control page is  correct")
    public void verifyThatTitleAirflowAndTemperatureControlPageIsCorrect() {
        assertTrue(basePage.isElementExist(AIRFLOW_MINI_PAGE_TITLE));
    }

    @And("verify that title PLANT WATERING page is  correct")
    public void verifyThatTitlePLANTWATERINGPageIsCorrect() {
        assertTrue(basePage.isElementExist(PLANT_MINI_PAGE_TITLE));
    }

    @And("verify that title ROOF & GUTTER DEICING page is  correct")
    public void verifyThatTitleROOFGUTTERDEICINGPageIsCorrect() {
        assertTrue(basePage.isElementExist(ROOF_MINI_PAGE_TITLE));
    }

    @And("verify that title LIGHT & OUTLET CONTROL page is  correct")
    public void verifyThatTitleLIGHTOUTLETCONTROLPageIsCorrect() {
        assertTrue(basePage.isElementExist(LIGHT_MINI_PAGE_TITLE));
    }

    @And("verify that title HOME SECURITY page is  correct")
    public void verifyThatTitleHOMESECURITYPageIsCorrect() {
        assertTrue(basePage.isElementExist(HOME_SECURITY_MINI_PAGE_TITLE));
    }

    @And("verify that title SMART INTEGRATION page is  correct")
    public void verifyThatTitleSMARTINTEGRATIONPageIsCorrect() {
        assertTrue(basePage.isElementExist(SMART_MINI_PAGE_TITLE));
    }

    @And("verify  that  ABOUT_PAGE_TITLE the mini page is  correct")
    public void verifyThatABOUT_PAGE_TITLETheMiniPageIsCorrect() {
        assertTrue(basePage.isElementExist(ABOUT_MINI_PAGE_TITLE));
    }

    @And("verify  that  CONTACT_PAGE_TITLE the mini page is  correct")
    public void verifyThatCONTACT_PAGE_TITLETheMiniPageIsCorrect() {
        assertTrue(basePage.isElementExist(CONTACT_MINI_PAGE_TITLE));
    }
}
