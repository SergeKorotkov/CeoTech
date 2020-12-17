package steps;

import page.BasePage;
import page.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

public class MainPageTestSteps {
    private final MainPage mainPage;
    private final BasePage basePage;

    public MainPageTestSteps() {
        mainPage = new MainPage();
        basePage = new BasePage();
    }

    @Given("users navigate to {string}")
    public void usersNavigateToHttpsCeotechCa(String url) {
        mainPage.navigateToMainPage(url);
    }

    @Then("verify that main page title is displayed")
    public void verifyThatMainPageTitleIsDisplayed() {
        assertTrue(mainPage.isHomePageDisplayed());
    }

    @And("Verify that  contact button is exist on the main page")
    public void verifyThatContactButtonIsExistOnTheMainPage() {
        assertTrue(mainPage.isContactButtonExist());
    }

    @And("Verify that  about button is exist on the main page")
    public void verifyThatAboutButtonIsExistOnTheMainPage() {
        assertTrue(mainPage.isAboutButtonExist());
    }

    @And("Verify that  solutions button is exist on the main page")
    public void verifyThatSolutionsButtonIsExistOnTheMainPage() {
        assertTrue(mainPage.isSolutionsButtonExist());
    }

    @And("Verify that  smart home button is exist on the main page")
    public void verifyThatSmartHomeButtonIsExistOnTheMainPage() {
        assertTrue(mainPage.isSmartHomeButtonExist());
    }

    @And("Verify that  Ceotech icon is exist on top on the main page")
    public void verifyThatCeotechIconIsExistOnTopOnTheMainPage() {
        assertTrue(mainPage.isSeoTechLogoExist());
    }

    @Then("click Solutions button")
    public void clickSolutionsButton() {
        mainPage.clickSolutionsButton();
        assertTrue(mainPage.isAirFlowButtonExist());
    }

    @And("Verify that  Airflow and Temperature Control button is exist in dropdown menu Solutions")
    public void verifyThatAirflowAndTemperatureControlButtonIsExistInDropdownMenuSolutions() {
        mainPage.clickSolutionsButton();
        assertTrue(mainPage.isAirFlowButtonExist());
    }

    @And("Verify that  Light and Outlet Control button is exist in dropdown menu Solutions")
    public void verifyThatLightAndOutletControlButtonIsExistInDropdownMenuSolutions() {
        mainPage.clickSolutionsButton();
        assertTrue(mainPage.isLightOutletButtonExist());
    }

    @And("Verify that  Roof and Gutter Deicing button is exist in dropdown menu Solutions")
    public void verifyThatRoofAndGutterDeicingButtonIsExistInDropdownMenuSolutions() {
        mainPage.clickSolutionsButton();
        assertTrue(mainPage.isRoofGutterButtonExist());
    }

    @And("Verify that  Plant Watering button is exist in dropdown menu Solutions")
    public void verifyThatPlantWateringButtonIsExistInDropdownMenuSolutions() {
        mainPage.clickSolutionsButton();
        assertTrue(mainPage.isPlantWateringButtonExist());
    }

    @And("Verify that  Home Security button is exist in dropdown menu Solutions")
    public void verifyThatHomeSecurityButtonIsExistInDropdownMenuSolutions() {
        mainPage.clickSolutionsButton();
        assertTrue(mainPage.isHomeSecurityButtonExist());
    }

    @And("Verify that  Smart Integration button is exist in dropdown menu Solutions")
    public void verifyThatSmartIntegrationButtonIsExistInDropdownMenuSolutions() {
        mainPage.clickSolutionsButton();
        assertTrue(mainPage.isSmartIntegrationButtonExist());
    }

    @Then("Verify that  Airflow and Temperature Control button is exist in fluid menu")
    public void verifyThatAirflowAndTemperatureControlButtonIsExistInFluidMenu() {
        assertTrue(mainPage.isAirFlowIconExist());

    }

    @And("Verify that  Light and Outlet Control button is exist in fluid menu")
    public void verifyThatLightAndOutletControlButtonIsExistInFluidMenu() {
        assertTrue(mainPage.isLightOutletIconExist());
    }

    @And("Verify that  Roof and Gutter Deicing button is exist in fluid menu")
    public void verifyThatRoofAndGutterDeicingButtonIsExistInFluidMenu() {
        assertTrue(mainPage.isRoofGutterIconExist());
    }

    @And("Verify that  Plant Watering button is exist in fluid menu")
    public void verifyThatPlantWateringButtonIsExistInFluidMenu() {
        assertTrue(mainPage.isPlantWateringIconExist());
    }

    @And("Verify that  Home Security button is exist in fluid menu")
    public void verifyThatHomeSecurityButtonIsExistInFluidMenu() {
        assertTrue(mainPage.isHomeSecurityIconExist());
    }

    @And("Verify that  Smart Integration button is exist in fluid menu")
    public void verifyThatSmartIntegrationButtonIsExistInFluidMenu() {
        assertTrue(mainPage.isSmartIntegrationIconExist());
    }

    @Then("Verify that  Ceotech Logo is exist on footer menu on the main page")
    public void verifyThatCeotechLogoIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isLogoFooterExist());
    }

    @And("Verify that  Airflow and Temperature Control is exist on footer menu on the main page")
    public void verifyThatAirflowAndTemperatureControlIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isAirFlowFooterExist());
    }

    @And("Verify that  Light and Outlet Control is exist on footer menu on the main page")
    public void verifyThatLightAndOutletControlIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isLightOutletFooterExist());
    }

    @And("Verify that  Roof and Gutter Deicing is exist on footer menu on the main page")
    public void verifyThatRoofAndGutterDeicingIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isRoofGutterFooterExist());
    }

    @And("Verify that  Plant Watering is exist on footer menu on the main page")
    public void verifyThatPlantWateringIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isPlantWateringFooterExist());
    }

    @And("Verify that  Home Security is exist on footer menu on the main page")
    public void verifyThatHomeSecurityIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isHomeSecurityFooterExist());
    }

    @And("Verify that  Copyright Statement is exist on footer menu on the main page")
    public void verifyThatCopyrightStatementIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isCopyrightFooterExist());
    }

    @And("Verify that  Privacy Policy is exist on footer menu on the main page")
    public void verifyThatPrivacyPolicyIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isPrivacyFooterExist());
    }

    @And("Verify that  Contact is exist on footer menu on the main page")
    public void verifyThatContactIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isContactFooterExist());
    }

    @And("Verify that  Our Team is exist on footer menu on the main page")
    public void verifyThatOurTeamIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isOurTeamFooterExist());
    }

    @And("Verify that  Board of Advisors is exist on footer menu on the main page")
    public void verifyThatBoardOfAdvisorsIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isBoardFooterExist());
    }

    @And("Verify that  Career is exist on footer menu on the main page")
    public void verifyThatCareerIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isCareerFooterExist());
    }

    @And("Verify that  Press Kit is exist on footer menu on the main page")
    public void verifyThatPressKitIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isPressKitFooterExist());
    }

    @And("Verify that  Facebook icon is exist on footer menu on the main page")
    public void verifyThatFacebookIconIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isFacebookFooterExist());
    }

    @And("Verify that  Twitter icon is exist on footer menu on the main page")
    public void verifyThatTwitterIconIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isTwitterFooterExist());
    }

    @And("Verify that  Instagram icon is exist on footer menu on the main page")
    public void verifyThatInstagramIconIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isInstagramFooterExist());
    }

    @And("Verify that  Linkedin icon is exist on footer menu on the main page")
    public void verifyThatLinkedinIconIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isLinkedinFooterExist());
    }

    @And("Verify that  Smart Integration is exist on footer menu on the main page")
    public void verifyThatSmartIntegrationIsExistOnFooterMenuOnTheMainPage() {
        assertTrue(basePage.isSmartIntegrationFooterExist());
    }
}
