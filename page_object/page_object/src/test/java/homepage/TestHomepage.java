package homepage;

import apps.driver.cash.WebDriverCash;
import apps.driver.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage {
    WebDriver webDriver = WebDriverCash.getMappedDriver("chrome");
    HomePage homePage = new HomePage(webDriver);



    @Test
    public void feedbackFormTEST() {
        webDriver.get("https://www.hedlyner.com/");
        webDriver.manage().window().maximize();
        homePage.getFeedbackButton().click();
        homePage.getFeedbackForm().isDisplayed();
        webDriver.quit();
    }

    @Test
    public void homepageHeaderTEST() {
        webDriver.get("https://www.hedlyner.com/");
        webDriver.manage().window().maximize();
        homePage.getHomepageHeader().isDisplayed();
        Assert.assertEquals(homePage.getHomepageHeader().getText(),"BOOK MORE SHOWS");
        webDriver.quit();
    }

    @Test
    public void threeSectionsTEST() {
        webDriver.get("https://www.hedlyner.com/");
        webDriver.manage().window().maximize();
        homePage.getFeaturedArtistsHeader().isDisplayed();
        Assert.assertEquals(homePage.getFeaturedArtistsHeader().getText(),"FEATURED ARTISTS");
        homePage.getListenHeader().isDisplayed();
        Assert.assertEquals(homePage.getListenHeader().getText(),"LISTEN");
        homePage.getFeaturedVenuesHeader().isDisplayed();
        Assert.assertEquals(homePage.getFeaturedVenuesHeader().getText(),"FEATURED VENUES");
        webDriver.quit();

    }
}
