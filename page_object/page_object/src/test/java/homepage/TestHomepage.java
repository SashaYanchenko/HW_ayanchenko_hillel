package homepage;

import apps.driver.cash.WebDriverCash;
import apps.driver.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHomepage {
    WebDriver webDriver = WebDriverCash.getMappedDriver("chrome");
    HomePage homePage = new HomePage(webDriver);

    @BeforeTest
    public void setUp() {
        webDriver.get("https://www.hedlyner.com/");
        webDriver.manage().window().maximize();
    }

    @Test
    public void feedbackFormTEST() {
        homePage.getFeedbackButton().click();
        homePage.getFeedbackForm().isDisplayed();
    }

    @Test
    public void homepageHeaderTEST() {
        homePage.getHomepageHeader().isDisplayed();
        Assert.assertEquals(homePage.getHomepageHeader().getText(),"BOOK MORE SHOWS");
    }

    @Test
    public void threeSectionsTEST() {
        homePage.getFeaturedArtistsHeader().isDisplayed();
        Assert.assertEquals(homePage.getFeaturedArtistsHeader().getText(),"FEATURED ARTISTS");
        homePage.getListenHeader().isDisplayed();
        Assert.assertEquals(homePage.getListenHeader().getText(),"LISTEN");
        homePage.getFeaturedVenuesHeader().isDisplayed();
        Assert.assertEquals(homePage.getFeaturedVenuesHeader().getText(),"FEATURED VENUES");
    }

    @AfterClass
    public void endCase() {
        webDriver.quit();
    }
}
