import utils.SharedDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
//        /TopMenuTest.feature
//        /FooterMenuTest.feature
//        /MainPageMinimumSizeTest.feature
       features = {"src/test/java/maxiSize"},
        plugin = {"pretty", "html:target/cucumber-reports/"},
        glue = {"steps"}
)

public class TestRunner {

    @BeforeClass
    public static void  setup(){SharedDriver.startWebDriver(SharedDriver.Browser.CHROME);
    }
    @AfterClass
    public static void tearDown(){
        SharedDriver.closeDriver();
    }
}
