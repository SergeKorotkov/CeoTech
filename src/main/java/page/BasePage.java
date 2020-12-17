package page;

import utils.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static constans.Constants.*;

public class BasePage {
    protected WebDriver driver = SharedDriver.getWebDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 5);

    public boolean isElementExist(String xpath) {
        try {
            driver.findElement(By.xpath(xpath));

            return true;
        } catch (Exception err) {
            return false;
        }
    }

    public boolean isElementDisplayed(String xpath) {
        List<WebElement> webElementList = driver.findElements(By.xpath(xpath));
        return webElementList.size() > 0;
    }

    public void clickElementByXPath(String xpath) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }

    public void clickElementByXPathLocation(String xpath) {
        WebElement element;
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
        element = driver.findElement(By.xpath(xpath));
        element.getLocation();
        element.click();
    }
    public void clickElementWithJS(String xpath) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", driver.findElement(By.xpath(xpath)));
    }

    public void clickTwitterIconWithJS() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();", TWITTER_FOOTER_ICON);
//        jse.executeScript("arguments[0].click()", driver.findElement(By.xpath(xpath)));
    }




    protected WebElement findElementByXpath(String xpath) {
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element = driver.findElement(By.xpath(xpath));
        element.getLocation();
        return element;
    }


    public boolean isAirFlowFooterExist() {
        return isElementExist(AIRFLOW_FOOTER_BUTTON);
    }

    public boolean isPlantWateringFooterExist() {
        return isElementExist(PLANT_WATERING_FOOTER_BUTTON);
    }

    public boolean isRoofGutterFooterExist() {
        return isElementExist(ROOF_FOOTER_BUTTON);
    }

    public boolean isLightOutletFooterExist() {
        return isElementExist(LIGHT_FOOTER_BUTTON);
    }

    public boolean isHomeSecurityFooterExist() {
        return isElementExist(HOME_SECURITY_FOOTER_BUTTON);
    }

    public boolean isSmartIntegrationFooterExist() {
        return isElementExist(SMART_INTEGRATION_FOOTER_BUTTON);
    }

    public boolean isContactFooterExist() {
        return isElementExist(CONTACT_FOOTER_BUTTON);
    }

    public boolean isOurTeamFooterExist() {
        return isElementExist(OUR_TEAM_FOOTER_BUTTON);
    }

    public boolean isBoardFooterExist() {
        return isElementExist(BOARD_OF_ADVISORS_FOOTER_BUTTON);
    }

    public boolean isCareerFooterExist() {
        return isElementExist(CAREER_FOOTER_BUTTON);
    }

    public boolean isPressKitFooterExist() {
        return isElementExist(PRESS_KIT_FOOTER_BUTTON);
    }

    public boolean isCopyrightFooterExist() {
        return isElementExist(COPYRIGHT_FOOTER_BUTTON);
    }

    public boolean isPrivacyFooterExist() {
        return isElementExist(PRIVACY_FOOTER_BUTTON);
    }

    public boolean isLogoFooterExist() {
        return isElementExist(LOGO_FOOTER_ICON);
    }

    public boolean isFacebookFooterExist() {
        return isElementExist(FACEBOOK_FOOTER_ICON);
    }

    public boolean isTwitterFooterExist() {
        return isElementExist(TWITTER_FOOTER_ICON);
    }

    public boolean isInstagramFooterExist() {
        return isElementExist(INSTAGRAM_FOOTER_ICON);
    }

    public boolean isLinkedinFooterExist() {
        return isElementExist(LINKEDIN_FOOTER_ICON);
    }
}

