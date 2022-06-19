package apps.driver.cash;

import apps.driver.utils.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class WebDriverCash {

    private static WebDriver webDriver;
    private static Map<String, WebDriver> mappedWebDriver = new HashMap<>();

    private WebDriverCash() {
    }

    public static WebDriver getDriver() {
        if (webDriver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }

    public static WebDriver getMappedDriver(String name) {
        if (mappedWebDriver.get(name) == null) {
            mappedWebDriver.put(name, WebDriverUtils.getDriver(name));
        }
        return mappedWebDriver.get(name);
    }
}
