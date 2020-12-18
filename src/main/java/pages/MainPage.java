package pages;

import static constans.Constants.*;

public class MainPage extends BasePage {

    public final static String MAIN_PAGE_TITLE = "//h1[text()='SmartHome']";
    public final static String ABOUT_TOP_BUTTON = "//div[text()='ABOUT']";
    public final static String CONTACT_TOP_BUTTON = "//div[@class='nav-link scroll-menu-item contact-menu'][text()='CONTACT']";
    public final static String SOLUTIONS_BUTTON = "//a[@class='nav-link dropdown-toggle']";
    public final static String SMART_HOME_BUTTON = "//div[@class='nav-link scroll-menu-item'][text()='SMARTHOME']";
    public final static String AIRFLOW_BUTTON = "//div[@class='dropdown-item scroll-menu-item text-uppercase align-middle']//*[text()='Airflow & Temperature Control']";
    public final static String PLANT_WATERING_BUTTON = "//div[@class='dropdown-item scroll-menu-item text-uppercase align-middle']//*[text()='Plant Watering']";
    public final static String ROOF_GUTTER_BUTTON = "//div[@class='dropdown-item scroll-menu-item text-uppercase align-middle']//*[text()='Roof & Gutter Deicing']";
    public final static String LIGHT_OUTLET_BUTTON = "//div[@class='dropdown-item scroll-menu-item text-uppercase align-middle']//*[text()='Light & Outlet Control']";
    public final static String HOME_SECURITY_BUTTON = "//div[@class='dropdown-item scroll-menu-item text-uppercase align-middle']//*[text()='Home Security']";
    public final static String SMART_INTEGRATION_TOP_BUTTON = "//div[@class='dropdown-item scroll-menu-item text-uppercase align-middle']//*[text()='Smart Integration']";
    public final static String SMART_INTEGRATION_ICON= "//div[@class='col-6 smarthome-welcome-img']//*[@data-tip='Smart Integration']";
    public final static String AIRFLOW_ICON= "//div[@class='col-6 smarthome-welcome-img']//*[@data-tip='Airflow and Temperature Control']";
    public final static String PLANT_WATERING_ICON= "//div[@class='col-6 smarthome-welcome-img']//*[@data-tip='Plant Watering']";
    public final static String ROOF_GUTTER_ICON= "//div[@class='col-6 smarthome-welcome-img']//*[@data-tip='Roof and<br/>Gutter Deicing']";
    public final static String LIGHT_OUTLET_ICON= "//div[@class='col-6 smarthome-welcome-img']//*[@data-tip='Light and Outlet Control']";
    public final static String HOME_SECURITY_ICON= "//div[@class='col-6 smarthome-welcome-img']//*[@data-tip='Home Security']";



    public void navigateToMainPage(String url){
        driver.get(url);
    }

    public boolean isHomePageDisplayed(){return isElementExist(MAIN_PAGE_TITLE);

    }
    public boolean isAboutButtonExist(){
        return isElementExist(ABOUT_TOP_BUTTON);
    }
    public boolean isContactButtonExist(){ return isElementExist(CONTACT_TOP_BUTTON);}
    public boolean isSolutionsButtonExist(){ return isElementExist(SOLUTIONS_BUTTON);}
    public boolean isSmartHomeButtonExist(){ return isElementExist(SMART_HOME_BUTTON);}
    public boolean isSeoTechLogoExist(){ return isElementExist(LOGO_ALL_PAGES);}
    public boolean isAirFlowButtonExist(){ return isElementExist(AIRFLOW_BUTTON);}
    public boolean isPlantWateringButtonExist(){ return isElementExist(PLANT_WATERING_BUTTON);}
    public boolean isRoofGutterButtonExist(){ return isElementExist(ROOF_GUTTER_BUTTON);}
    public boolean isLightOutletButtonExist(){ return isElementExist(LIGHT_OUTLET_BUTTON);}
    public boolean isHomeSecurityButtonExist(){ return isElementExist(HOME_SECURITY_BUTTON);}
    public boolean isSmartIntegrationButtonExist(){ return isElementExist(SMART_INTEGRATION_TOP_BUTTON);}

    public boolean isAirFlowIconExist(){ return isElementExist(AIRFLOW_ICON);}
    public boolean isPlantWateringIconExist(){ return isElementExist(PLANT_WATERING_ICON);}
    public boolean isRoofGutterIconExist(){ return isElementExist(ROOF_GUTTER_ICON);}
    public boolean isLightOutletIconExist(){ return isElementExist(LIGHT_OUTLET_ICON); }
    public boolean isHomeSecurityIconExist(){ return isElementExist(HOME_SECURITY_ICON);}
    public boolean isSmartIntegrationIconExist(){ return isElementExist(SMART_INTEGRATION_ICON);}


    public void clickSolutionsButton(){clickElementByXPath(SOLUTIONS_BUTTON);}
    public void clickAirFlowButton(){clickElementByXPath(AIRFLOW_BUTTON);}
    public void clickPlantWaterButton(){clickElementByXPath(PLANT_WATERING_BUTTON);}
    public void clickRoofGutterButton(){clickElementByXPath(ROOF_GUTTER_BUTTON);}
    public void clickLightOutButton(){clickElementByXPath(LIGHT_OUTLET_BUTTON);}
    public void clickHomeSecurityButton(){clickElementByXPath(HOME_SECURITY_BUTTON);}
    public void clickSmartIntegrationButton(){clickElementByXPath(SMART_INTEGRATION_TOP_BUTTON);}
    public void clickLogoIconButton(){clickElementByXPath(LOGO_ALL_PAGES);}
    public void clickSmartHomeButton(){clickElementByXPath(SMART_HOME_BUTTON);}
    public void clickContactButton(){clickElementByXPath(CONTACT_TOP_BUTTON);}
    public void clickAboutButton(){clickElementByXPath(ABOUT_TOP_BUTTON);}
    public void clickLogoFooterButton(){clickElementByXPath(LOGO_FOOTER_ICON);}

    public ContactPage clickContactUs(){
        clickElementByXPath(SOLUTIONS_BUTTON);
        return new ContactPage();
    }

}
