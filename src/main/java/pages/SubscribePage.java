package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.UiActions;

public class SubscribePage {

    WebDriver driver ;
    By selectCountryBtn =  By.id("country-btn");
    By bahrainSelection = By.id("bh");
    By kuwaitSelection = By.id("kw");
    By saudiSelection = By.id("sa");
    By litePlanName = By.id("name-lite");
    By classicPlanName = By.id("name-classic");
    By premiumPlanName = By.id("name-premium");

    By litePlanPrice = By.xpath("//div[@id='currency-lite']/b");
    By classicPlanPrice = By.xpath("//div[@id='currency-classic']/b");
    By premiumPlanPrice = By.xpath("//div[@id='currency-premium']/b");

    By litePlanCurrency = By.id("currency-lite");
    By classicCurrency = By.id("currency-classic");
    By premiumPlanCurrency = By.id("currency-premium");

    By signBtn = By.id("signin");




    public SubscribePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSelectCountry(){
        UiActions.click(driver,selectCountryBtn);
    }
    public void selectCountry(String countryName){
        clickSelectCountry();
        switch (countryName.toLowerCase()) {
            case "ksa":
                UiActions.click(driver,saudiSelection);
                break;
            case "bahrain":
                UiActions.click(driver,bahrainSelection);
                break;
            case "kuwait":
                UiActions.click(driver,kuwaitSelection);
                break;
        }
    }

    public String getPlanTypeNames(String planName){
        switch (planName.toLowerCase()) {
            case "lite":
                 return driver.findElement(litePlanName).getText();
            case "classic":
                return driver.findElement(classicPlanName).getText();
            case "premium":
                return driver.findElement(premiumPlanName).getText();
        }
        return null;
    }
    public WebElement getPlanTypes(String planName){
        switch (planName.toLowerCase()) {
            case "lite":
                return driver.findElement(litePlanName);
            case "classic":
                return driver.findElement(classicPlanName);
            case "premium":
                return driver.findElement(premiumPlanName);
        }
        return null;
    }

    public String getPlanPrice(String planName){
        switch (planName.toLowerCase()) {
            case "lite":
                return driver.findElement(litePlanPrice).getText();
            case "classic":
                return driver.findElement(classicPlanPrice).getText();
            case "premium":
                return driver.findElement(premiumPlanPrice).getText();
        }
        return null;
    }

    public String getPlanCurrency(String planName){
        switch (planName.toLowerCase()) {
            case "lite":
                return driver.findElement(litePlanCurrency).getText();
            case "classic":
                return driver.findElement(classicCurrency).getText();
            case "premium":
                return driver.findElement(premiumPlanCurrency).getText();
        }
        return null;
    }

    public void clickLogin(){
        UiActions.click(driver,signBtn);
    }


}
