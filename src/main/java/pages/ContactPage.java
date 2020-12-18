package pages;

public class ContactPage extends BasePage{

    public final static String CONTACT_PAGE_TITLE = "//h2[text()='Contact Us']";

    public boolean isContactTitleIsDisplayed(){
        return isElementDisplayed(CONTACT_PAGE_TITLE);
    }
}
