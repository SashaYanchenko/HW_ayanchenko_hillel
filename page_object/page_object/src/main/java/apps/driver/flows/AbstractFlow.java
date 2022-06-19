package apps.driver.flows;

import org.openqa.selenium.WebDriver;

public class AbstractFlow {
    private WebDriver driver;

    public AbstractFlow(WebDriver driver) {
        this.driver = driver;
    }
}
