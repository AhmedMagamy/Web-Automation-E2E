import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.SignInPage;
import pages.SubscribePage;
import utils.DriverManger;
import utils.PropertiesReader;

public class TestBase {


    public WebDriver driver;
    SubscribePage subscribePage ;
    String baseUrl = PropertiesReader.getProperty("config.properties","base.url");
    String browserName = PropertiesReader.getProperty("config.properties","browser");
    SignInPage signInPage ;

    @BeforeMethod
    public void setup() {
        driver = DriverManger.startBrowser(browserName);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        subscribePage = new SubscribePage(driver);
        signInPage = new SignInPage(driver);


    }

    @AfterMethod
    public void cleanUp() {
        driver.close();

    }


}
