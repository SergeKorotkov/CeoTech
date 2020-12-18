package pages;

public class RoofAndGutterPage extends BasePage{

    public final static String ROOF_PAGE_TITLE = "//h2[text()='Roof and Gutter Deicing']";

    public boolean isRoofTitleIsDisplayed(){
        return isElementDisplayed(ROOF_PAGE_TITLE);
    }
}
