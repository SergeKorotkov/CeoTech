package page;

public class SmartIntegrationPage extends BasePage{

    public final static String SMART_PAGE_TITLE = "//h2[text()='Smart Integration']";

    public boolean isSmartTitleIsDisplayed(){
        return isElementDisplayed(SMART_PAGE_TITLE);
    }


}
