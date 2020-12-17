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

public class FooterMenuStepDefinition {
    private final MainPage mainPage;
    private final BasePage basePage;
    protected WebDriver driver = SharedDriver.getWebDriver();

    public FooterMenuStepDefinition() {
        mainPage = new MainPage();
        basePage = new BasePage();
    }


    @Given("user navigate to {string}")
    public void userNavigateToHttpsCeotechCa(String url) {mainPage.navigateToMainPage(url);}

    @Then("click footer menu logo icon")
    public void clickFooterMenuLogoIcon() {basePage.clickElementWithJS(LOGO_FOOTER_ICON);
    }
    @Then("click footer Contact button")
    public void clickFooterContactButton() {basePage.clickElementWithJS(CONTACT_FOOTER_BUTTON);}

    @Then("click footer AIRFLOW & TEMPERATURE CONTROL button")
    public void clickFooterAIRFLOWTEMPERATURECONTROLButton() {basePage.clickElementWithJS(AIRFLOW_FOOTER_BUTTON);
    }

    @And("verify that address {string} the page is correct")
    public void verifyThatAddressThePageIsCorrect(String expected) {
        String url = driver.getCurrentUrl();
        assertEquals(expected,url);
    }

    @Then("click footer PLANT WATERING button")
    public void clickFooterPLANTWATERINGButton() {basePage.clickElementWithJS(PLANT_WATERING_FOOTER_BUTTON);
    }

    @And("verify that address {string} of opened page is correct")
    public void verifyThatAddressOfOpenedPageIsCorrect(String expected) {
        String url = driver.getCurrentUrl();
        assertEquals(expected,url);
    }

    @Then("click footer ROOF & GUTTER DEICING button")
    public void clickFooterROOFGUTTERDEICINGButton() {basePage.clickElementWithJS(ROOF_FOOTER_BUTTON);
    }

    @Then("click footer LIGHT & OUTLET CONTROL button")
    public void clickFooterLIGHTOUTLETCONTROLButton() {basePage.clickElementWithJS(LIGHT_FOOTER_BUTTON);
    }

    @Then("click footer HOME SECURITY button")
    public void clickFooterHOMESECURITYButton() {basePage.clickElementWithJS(HOME_SECURITY_FOOTER_BUTTON);
    }

    @Then("click footer SMART INTEGRATION button")
    public void clickFooterSMARTINTEGRATIONButton() {basePage.clickElementWithJS(SMART_INTEGRATION_FOOTER_BUTTON);
    }

    @Then("click footer Copyright Statement button")
    public void clickFooterCopyrightStatementButton() {basePage.clickElementWithJS(COPYRIGHT_FOOTER_BUTTON);
    }

    @Then("click footer Privacy Policy button")
    public void clickFooterPrivacyPolicyButton() {basePage.clickElementWithJS(PRIVACY_FOOTER_BUTTON);
    }

    @Then("click footer Press Kit button")
    public void clickFooterPressKitButton() {basePage.clickElementWithJS(PRESS_KIT_FOOTER_BUTTON);
    }

    @Then("click footer Facebook icon")
    public void clickFooterFacebookIcon() {basePage.clickElementWithJS(FACEBOOK_FOOTER_ICON);
    }

    @And("verify that title of the page is correct")
    public void verifyThatTitleOfThePageIsCorrect() {
        boolean title = basePage.isElementExist(FACEBOOK_TITLE);
        assertTrue(title);
    }

    @Then("click footer Twitter icon")
    public void clickFooterTwitterIcon() {basePage.clickElementWithJS(TWITTER_FOOTER_ICON);
    }

    @And("verify that title is correct")
    public void verifyThatTitleIsCorrect() {
        boolean title = basePage.isElementExist(TWITTER_TITLE);
        assertTrue(title);
    }

    @Then("click footer Instagram icon")
    public void clickFooterInstagramIcon() {basePage.clickElementWithJS(INSTAGRAM_FOOTER_ICON);
    }

    @And("verify  that title of opened pagge is correct")
    public void verifyThatTitleOfOpenedPaggeIsCorrect() {
        boolean title = basePage.isElementExist(INSTAGRAM_TITLE);
        assertTrue(title);
    }

    @Then("click footer Linkedin icon")
    public void clickFooterLinkedinIcon() {basePage.clickElementWithJS(LINKEDIN_FOOTER_ICON);
    }

    @And("verify that title of  opened  page is correct")
    public void verifyThatTitleOfOpenedPageIsCorrect() {
        boolean title = basePage.isElementExist(LINKEDIN_TITLE);
        assertTrue(title);
    }

    @Then("click footer Our Team button")
    public void clickFooterOurTeamButton() {basePage.clickElementWithJS(OUR_TEAM_FOOTER_BUTTON);
    }

    @And("verify title Our team is visible")
    public void verifyTitleOurTeamIsVisible() {
        boolean title = basePage.isElementExist(OUR_TEAM_TITLE);
        assertTrue(title);
    }

    @Then("click footer Board of Advisors button")
    public void clickFooterBoardOfAdvisorsButton() {basePage.clickElementWithJS(BOARD_OF_ADVISORS_FOOTER_BUTTON);
    }

    @And("verify title Board of Advisors is visible")
    public void verifyTitleBoardOfAdvisorsIsVisible() {
        boolean title = basePage.isElementExist(BOARD_OF_ADVISORS_TITLE);
        assertTrue(title);
    }

    @Then("click footer Career button")
    public void clickFooterCareerButton() {basePage.clickElementWithJS(CAREER_FOOTER_BUTTON);
    }

    @And("verify title Career is visible")
    public void verifyTitleCareerIsVisible() {
        boolean title = basePage.isElementExist(CAREER_TITLE);
        assertTrue(title);
    }
}
