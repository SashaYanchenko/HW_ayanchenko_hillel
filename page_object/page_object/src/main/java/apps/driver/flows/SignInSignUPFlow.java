package apps.driver.flows;

import apps.driver.pages.HomePage;
import apps.driver.pages.CreateProfilePage;
import org.openqa.selenium.WebDriver;

public class SignInSignUPFlow extends AbstractFlow {
    private HomePage basePage;
    private CreateProfilePage createProfilePage;


    public SignInSignUPFlow(WebDriver driver) {
        super(driver);
        basePage = new HomePage(driver);
        createProfilePage = new CreateProfilePage(driver);
    }

    public void navigateToRegisterPage() {
        basePage.getCreateNewProfileButton().click();
    }

    public void presenceOfTheSecondaryWays() {
        createProfilePage.getFacebookButton().isDisplayed();
        createProfilePage.getGoogleButton().isDisplayed();
    }


    public void presenceOfAlreadyRegField() {
        createProfilePage.getAlreadyRegisteredField().isDisplayed();
    }

    public void redirectToLoginPage() {
        createProfilePage.getAlreadyRegisteredField().click();
    }
}
