package pages;

public class AirflowPage extends BasePage{

    public final static String AIRFLOW_PAGE_TITLE = "//h2[text()='Airflow and Temperature Control']";

    public boolean isAirflowTitleIsDisplayed(){
        return isElementDisplayed(AIRFLOW_PAGE_TITLE);
    }

}
