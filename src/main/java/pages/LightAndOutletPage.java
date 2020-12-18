package pages;

public class LightAndOutletPage extends BasePage{

    public final static String LIGHT_PAGE_TITLE = "//h2[text()='Light and Outlet Control']";

    public boolean isLightTitleIsDisplayed(){
        return isElementDisplayed(LIGHT_PAGE_TITLE);
    }

}
