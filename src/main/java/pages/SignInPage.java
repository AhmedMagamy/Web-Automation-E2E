package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UiActions;

public class SignInPage {
    WebDriver driver ;

    By loginIdField = By.name("username");
    By nextBtn = By.xpath("//button[@type=\"submit\"]");
    By errMsgTxt = By.xpath("//span[@class=\"error-msg-top\"]");


    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }
    public void submitLoginID(String loginID){
        UiActions.type(driver,loginIdField,loginID);
        UiActions.click(driver,nextBtn);
    }

    public String getErrMsg(){
        UiActions.locateElement(driver,errMsgTxt);
        return driver.findElement(errMsgTxt).getText();
    }
}
