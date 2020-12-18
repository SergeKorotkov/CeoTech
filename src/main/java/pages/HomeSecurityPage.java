package pages;

public class HomeSecurityPage extends BasePage{

    public final static String HOME_SECURITY_PAGE_TITLE = "//h2[text()='Home Security']";

    public boolean isHomeSecurityTitleIsDisplayed(){
        return isElementDisplayed(HOME_SECURITY_PAGE_TITLE);
    }

}
