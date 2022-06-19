package apps.driver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CreateProfilePage extends AbstractPage{
    private static final By REGISTER_BUTTON = By.xpath("//button[@class='btn button-text bg-purple text-white btn-shadow border-100 py-3']");
    private static final By GOOGLE_BUTTON = By.xpath("//div[@class='row px-1']/*");
    private static final By FACEBOOK_BUTTON = By.xpath("//div[@class='row py-4 px-1']/*");
    private static final By ALREADY_REGISTERED_FIELD = By.xpath("//div[@class='col d-flex']");

    public CreateProfilePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRegisterButton() {
        return driver.findElement(REGISTER_BUTTON);
    }

    public WebElement getGoogleButton() {
        return driver.findElement(GOOGLE_BUTTON);
    }

    public WebElement getFacebookButton() {
        return driver.findElement(FACEBOOK_BUTTON);
    }

    public WebElement getAlreadyRegisteredField() {
        return driver.findElement(ALREADY_REGISTERED_FIELD);
    }
}
