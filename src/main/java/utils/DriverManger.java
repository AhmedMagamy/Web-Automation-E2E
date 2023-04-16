package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManger {

    static WebDriver driver ;
    public  static WebDriver startBrowser(String browserName) {
        if (browserName.toString().equalsIgnoreCase("chrome")) {

             return driver = new ChromeDriver();
        } else if (browserName.toString().equalsIgnoreCase("firefox")) {

             return driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser name");
        }
    }

    public static void closeBrowser() {
        driver.quit();


    }


}
