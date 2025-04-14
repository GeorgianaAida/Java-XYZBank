package pages;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import pageLocators.BankManagerLocators;

public class BankManagerPage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public BankManagerPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }
    public void clickAddCustomerElement(){
        elementHelper.clickLocator(BankManagerLocators.addCustomerElement);
        LoggerUtility.infoTest("The user clicked on add customer element");
    }
    public void clickOpenAccountElement(){
        elementHelper.clickLocator(BankManagerLocators.openAccountElement);
        LoggerUtility.infoTest("The user clicked on open account element");
    }
    public void clickCustomersElement(){
        elementHelper.clickLocator(BankManagerLocators.customersElement);
        LoggerUtility.infoTest("The user clicked on customersElement");
    }
}