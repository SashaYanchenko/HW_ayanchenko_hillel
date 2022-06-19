package apps.driver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage{

    private static final By SIGN_UP_SIGN_IN_DROPDOWN = By.xpath("//input[@class='hamburger-reciever js-hamburger-reciever']");
    private static final By LOG_IN_BUTTON = By.xpath("//div[@class='dropdown-menu dropdown-menu-right js-dropdown-menu']/a[1]");
    private static final By REGISTER_BUTTON = By.xpath("//div[@class='dropdown-menu dropdown-menu-right js-dropdown-menu']/a[2]");
    private static final By CREATE_NEW_PROFILE_BUTTON=By.xpath("//a[@class='btn button-text btn-warn-yellow js-register-btn']");
    private static final By FEEDBACK_BUTTON = By.xpath("//*[@class='userback-button userback-button-e']");
    private static final By FEEDBACK_FORM = By.xpath("//*[@class='userback-controls userback-controls-e']");
    private static final By HOMEPAGE_HEADER = By.xpath("//h1");
    private static final By FEATURED_ARTISTS_SECTION_HEADER = By.xpath("//div[@class='featured-artists-desktop']//h2[@class='home-h2']");
    private static final By FEATURED_VENUES_SECTION_HEADER = By.xpath("//div[@class='featured-venues-desktop']//h2[@class='home-h2']");
    private static final By LISTEN_SECTION_HEADER = By.xpath("//div[@class='feature-listen']//h2[@class='home-h2']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSSButtons() {
        return driver.findElement(SIGN_UP_SIGN_IN_DROPDOWN);
    }

    public WebElement getLogInButton() {
        return driver.findElement(LOG_IN_BUTTON);
    }

    public WebElement getRegisterButton() {
        return driver.findElement(REGISTER_BUTTON);
    }

    public WebElement getCreateNewProfileButton() {
        return driver.findElement(CREATE_NEW_PROFILE_BUTTON);
    }

    public WebElement getFeedbackButton() {
        return driver.findElement(FEEDBACK_BUTTON);
    }

    public WebElement getFeedbackForm() {
        return driver.findElement(FEEDBACK_FORM);
    }

    public WebElement getHomepageHeader() {
        return driver.findElement(HOMEPAGE_HEADER);
    }

    public WebElement getFeaturedArtistsHeader() {
        return driver.findElement(FEATURED_ARTISTS_SECTION_HEADER);
    }

    public WebElement getFeaturedVenuesHeader() {
        return driver.findElement(FEATURED_VENUES_SECTION_HEADER);
    }

    public WebElement getListenHeader() {
        return driver.findElement(LISTEN_SECTION_HEADER);
    }
}
