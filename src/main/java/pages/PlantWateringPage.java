package pages;

public class PlantWateringPage extends BasePage{

    public final static String PLANT_PAGE_TITLE = "//h2[text()='Plant Watering']";

    public boolean isPlantTitleIsDisplayed(){
        return isElementDisplayed(PLANT_PAGE_TITLE);
    }

}
