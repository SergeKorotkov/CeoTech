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

public class FooterMiniPageStepDefinition {
    private final MainPage mainPage;
    private final BasePage basePage;
    protected WebDriver driver = SharedDriver.getWebDriver();

    public FooterMiniPageStepDefinition() {
        mainPage = new MainPage();
        basePage = new BasePage();
    }

    @Then("click footer menu logo mini page icon")
    public void clickFooterMenuLogoMiniPageIcon() {
        basePage.clickElementWithJS(LOGO_FOOTER_MINISIZE);
    }

    @Then("click footer mini page Contact button")
    public void clickFooterMiniPageContactButton() {
        basePage.clickElementWithJS(CONTACT_FOOTER_BUTTON);
    }

    @Then("click footer mini page AIRFLOW & TEMPERATURE CONTROL button")
    public void clickFooterMiniPageAIRFLOWTEMPERATURECONTROLButton() {
        basePage.clickElementWithJS(AIRFLOW_FOOTER_BUTTON);
    }

    @Then("click footer mini page PLANT WATERING button")
    public void clickFooterMiniPagePLANTWATERINGButton() {
        basePage.clickElementWithJS(PLANT_WATERING_FOOTER_BUTTON);
    }

    @Then("click footer mini page ROOF & GUTTER DEICING button")
    public void clickFooterMiniPageROOFGUTTERDEICINGButton() {
        basePage.clickElementByXPath(ROOF_FOOTER_BUTTON);
    }

    @Then("click footer mini page LIGHT & OUTLET CONTROL button")
    public void clickFooterMiniPageLIGHTOUTLETCONTROLButton() {
        basePage.clickElementByXPath(LIGHT_FOOTER_BUTTON);
    }

    @Then("click footer mini page HOME SECURITY button")
    public void clickFooterMiniPageHOMESECURITYButton() {
        basePage.clickElementByXPath(HOME_SECURITY_FOOTER_BUTTON);
    }

    @Then("click footer mini page SMART INTEGRATION button")
    public void clickFooterMiniPageSMARTINTEGRATIONButton() {
        basePage.clickElementByXPath(SMART_INTEGRATION_FOOTER_BUTTON);
    }

    @Then("click footer mini page Copyright Statement button")
    public void clickFooterMiniPageCopyrightStatementButton() {
        basePage.clickElementByXPath(COPYRIGHT_FOOTER_BUTTON);
    }

    @Then("click footer mini page Privacy Policy button")
    public void clickFooterMiniPagePrivacyPolicyButton() {
        basePage.clickElementWithJS(PRIVACY_FOOTER_BUTTON);
    }

    @Then("click footer mini page Our Team button")
    public void clickFooterMiniPageOurTeamButton() {
        basePage.clickElementByXPath(OUR_TEAM_FOOTER_BUTTON);
    }

    @Then("click footer mini page Board of Advisors button")
    public void clickFooterMiniPageBoardOfAdvisorsButton() {
        basePage.clickElementByXPath(BOARD_OF_ADVISORS_FOOTER_BUTTON);
    }

    @Then("click footer mini page Career button")
    public void clickFooterMiniPageCareerButton() {
        basePage.clickElementByXPath(CAREER_FOOTER_BUTTON);
    }

    @And("verify  that  COPYRIGHT_PAGE_TITLE the mini page is  correct")
    public void verifyThatCOPYRIGHT_PAGE_TITLETheMiniPageIsCorrect() {
        basePage.clickElementWithJS(COPYRIGHT_MINI_PAGE_TITLE);
    }

    @And("verify  that  PRIVACY_PAGE_TITLE the mini page is  correct")
    public void verifyThatPRIVACY_PAGE_TITLETheMiniPageIsCorrect() {
        basePage.clickElementWithJS(PRIVACY_FOOTER_BUTTON);
    }

    @And("verify title Our team mini page is visible")
    public void verifyTitleOurTeamMiniPageIsVisible() {
        basePage.clickElementWithJS(OUR_TEAM_MINI_TITLE);
    }
}
