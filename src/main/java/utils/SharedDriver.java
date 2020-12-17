package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class SharedDriver {

    private static WebDriver driver;

    public enum Browser {
        CHROME,
        FIREFOX,
        OPERA,
        EDGE,
    }

    public static void startWebDriver(Browser browser) {
        if (driver == null) {
            switch (browser) {

                case CHROME:
                    ChromeOptions options = new ChromeOptions();
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);
                    break;

                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case OPERA:
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;

                case EDGE:
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
    }

    public static WebDriver getWebDriver() {
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }
}
