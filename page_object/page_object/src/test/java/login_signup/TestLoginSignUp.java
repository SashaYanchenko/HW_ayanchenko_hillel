package login_signup;

import apps.driver.flows.SignInSignUPFlow;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import apps.driver.cash.WebDriverCash;
import apps.driver.pages.HomePage;


public class TestLoginSignUp {
    WebDriver webDriver = WebDriverCash.getMappedDriver("chrome");
    HomePage homePage = new HomePage(webDriver);
    SignInSignUPFlow signInSignUPFlow = new SignInSignUPFlow(webDriver);

    @BeforeTest
    public void setUp() {
        webDriver.get("https://www.hedlyner.com/");
        webDriver.manage().window().maximize();
    }


    @Test
    public void openNavMenuTest(){
        homePage.getSSButtons().click();
    }

    @Test
    public void openRegisterPageTEST(){
        signInSignUPFlow.navigateToRegisterPage();
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.hedlyner.com/register");
    }

    @Test
    public void secondaryWaysOfRegistrationTEST(){
        signInSignUPFlow.navigateToRegisterPage();
        signInSignUPFlow.presenceOfTheSecondaryWays();
    }

    @Test
    public void alreadyRegisteredTEST() {
        signInSignUPFlow.navigateToRegisterPage();
        signInSignUPFlow.presenceOfAlreadyRegField();
        signInSignUPFlow.redirectToLoginPage();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.hedlyner.com/login");
    }

    @AfterClass
    public void endCase() {
        webDriver.quit();
    }
}
