import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.SubscribePage;
import utils.DriverManger;
import utils.PropertiesReader;
import utils.TestngListener;


@Listeners(TestngListener.class)
public class SignInTests extends TestBase{





    @Test(description = "Tc010 Verify that user is unable to login with non exist login ID")
    public void tc010_VerifyUsrIsUnableToLoginWithNonExistLoginID() {
        subscribePage.clickLogin();
        signInPage.submitLoginID("invalid@id.com");
        Assert.assertTrue(signInPage.getErrMsg().contains("Login ID does not exist"));


    }



}
