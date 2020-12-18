package pages;

public class AboutPage extends BasePage{
    public final static String ABOUT_PAGE_TITLE = "//h2[text()='About the company']";

    public boolean isAboutPageTitleIsDisplayed(){
        return isElementDisplayed(ABOUT_PAGE_TITLE);
    }

}
