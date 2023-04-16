import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SubscribePage;
import utils.DriverManger;
import utils.PropertiesReader;
import utils.TestngListener;



@Listeners(TestngListener.class)
public class SubscribeTests extends TestBase {



    @Test(description = "Tc001 Verify that all plan types are displayed for kuwait user")
    public void tc001_VerifyThePlanTypesForKuwait(){
        subscribePage.selectCountry("kuwait");
        Assert.assertTrue(subscribePage.getPlanTypes("lite").isDisplayed());
        Assert.assertTrue(subscribePage.getPlanTypes("classic").isDisplayed());
        Assert.assertTrue(subscribePage.getPlanTypes("premium").isDisplayed());

    }
    @Test(description = "Tc002 Verify that all prices are displayed correctly for kuwait user")
    public void tc002_VerifyThePricesForKuwait(){
        subscribePage.selectCountry("kuwait");
        Assert.assertTrue(subscribePage.getPlanPrice("lite").equals("1.2"));
        Assert.assertTrue(subscribePage.getPlanPrice("classic").equals("2.5"));
        Assert.assertTrue(subscribePage.getPlanPrice("premium").equals("4.8"));

    }
    @Test(description = "Tc003 Verify that all prices are displayed with correct currency KWD for kuwait user")
    public void tc003_VerifyTheCurrencyForKuwait(){
        subscribePage.selectCountry("kuwait");
        Assert.assertTrue(subscribePage.getPlanCurrency("lite").contains("KWD"));
        Assert.assertTrue(subscribePage.getPlanCurrency("classic").contains("KWD"));
        Assert.assertTrue(subscribePage.getPlanCurrency("premium").contains("KWD"));

    }
    @Test(description = "Tc004 Verify that all plan types are displayed for KSA user")
    public void tc004_VerifyThePlanTypesForKSA(){
        subscribePage.selectCountry("KSA");
        Assert.assertTrue(subscribePage.getPlanTypes("lite").isDisplayed());
        Assert.assertTrue(subscribePage.getPlanTypes("classic").isDisplayed());
        Assert.assertTrue(subscribePage.getPlanTypes("premium").isDisplayed());

    }
    @Test(description = "Tc005 Verify that all prices are displayed correctly for KSA user")
    public void tc005_VerifyThePricesForKSA(){
        subscribePage.selectCountry("KSA");
        Assert.assertTrue(subscribePage.getPlanPrice("lite").equals("15"));
        Assert.assertTrue(subscribePage.getPlanPrice("classic").equals("25"));
        Assert.assertTrue(subscribePage.getPlanPrice("premium").equals("60"));

    }
    @Test(description = "Tc006 Verify that all prices are displayed with correct currency KSA for KSA user")
    public void tc006_VerifyTheCurrencyForKSA(){
        subscribePage.selectCountry("KSA");
        Assert.assertTrue(subscribePage.getPlanCurrency("lite").contains("SAR"));
        Assert.assertTrue(subscribePage.getPlanCurrency("classic").contains("SAR"));
        Assert.assertTrue(subscribePage.getPlanCurrency("premium").contains("SAR"));

    }
    @Test(description = "Tc007 Verify that all plan types are displayed for Bahrain user")
    public void tc007_VerifyThePlanTypesForBahrain(){
        subscribePage.selectCountry("bahrain");
        Assert.assertTrue(subscribePage.getPlanTypes("lite").isDisplayed());
        Assert.assertTrue(subscribePage.getPlanTypes("classic").isDisplayed());
        Assert.assertTrue(subscribePage.getPlanTypes("premium").isDisplayed());

    }
    @Test(description = "Tc008 Verify that all prices are displayed correctly for Bahrain user")
    public void tc008_VerifyThePricesForBahrain(){
        subscribePage.selectCountry("KSA");
        Assert.assertTrue(subscribePage.getPlanPrice("lite").equals("2"));
        Assert.assertTrue(subscribePage.getPlanPrice("classic").equals("3"));
        Assert.assertTrue(subscribePage.getPlanPrice("premium").equals("6"));

    }
    @Test(description = "Tc009 Verify that all prices are displayed with correct currency BHD for Bahrain user")
    public void tc009_VerifyTheCurrencyForBahrain(){
        subscribePage.selectCountry("bahrain");
        Assert.assertTrue(subscribePage.getPlanCurrency("lite").contains("BHD"));
        Assert.assertTrue(subscribePage.getPlanCurrency("classic").contains("BHD"));
        Assert.assertTrue(subscribePage.getPlanCurrency("premium").contains("BHD"));

    }




}
