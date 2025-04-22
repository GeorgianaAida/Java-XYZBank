package pages;

import helpMethods.AlertHelper;
import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import pageLocators.OpenAccountLocators;

public class OpenAccountPage {
    private WebDriver driver;
    private ElementHelper elementHelper;
    private AlertHelper alertHelper;

    public OpenAccountPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        alertHelper = new AlertHelper(driver);
    }
    public void selectCustomerName(String fullNameValue){
        elementHelper.selectLocator(OpenAccountLocators.customerNameElement, fullNameValue);
    }
    public void selectCurrency(String currencyValue){
        elementHelper.selectLocator(OpenAccountLocators.currencyElement, currencyValue);
    }
    public void selectButton(){
        elementHelper.clickLocator(OpenAccountLocators.processButton);
        alertHelper.acceptAlert();
        LoggerUtility.infoTest("The user clicked on accept alert");
    }
}