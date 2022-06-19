package login_signup;

import apps.driver.flows.SignInSignUPFlow;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import apps.driver.cash.WebDriverCash;
import apps.driver.pages.HomePage;

import java.time.Duration;

public class TestLoginSignUp {
    WebDriver webDriver = WebDriverCash.getMappedDriver("chrome");
    HomePage homePage = new HomePage(webDriver);
    SignInSignUPFlow signInSignUPFlow = new SignInSignUPFlow(webDriver);

    @Test
    public void openNavMenuTest() throws InterruptedException {
        webDriver.get("https://www.hedlyner.com/");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver.manage().window().maximize();
        homePage.getSSButtons().click();
        webDriver.quit();
    }

    @Test
    public void openRegisterPageTEST(){
        webDriver.get("https://www.hedlyner.com/");
        webDriver.manage().window().maximize();
        signInSignUPFlow.navigateToRegisterPage();
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.hedlyner.com/register");
        webDriver.quit();
    }

    @Test
    public void secondaryWaysOfRegistrationTEST(){
        webDriver.get("https://www.hedlyner.com/");
        webDriver.manage().window().maximize();
        signInSignUPFlow.navigateToRegisterPage();
        signInSignUPFlow.presenceOfTheSecondaryWays();
        webDriver.quit();
    }

    @Test
    public void alreadyRegisteredTEST() {
        webDriver.get("https://www.hedlyner.com/");
        webDriver.manage().window().maximize();
        signInSignUPFlow.navigateToRegisterPage();
        signInSignUPFlow.presenceOfAlreadyRegField();
        signInSignUPFlow.redirectToLoginPage();
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.hedlyner.com/login");
        webDriver.quit();
    }

}
