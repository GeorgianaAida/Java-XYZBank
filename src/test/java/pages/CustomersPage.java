package pages;

import helpMethods.AlertHelper;
import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import pageLocators.CustomerLocators;

import static pageLocators.AddCustomerLocators.firstNameElement;

public class CustomersPage {
    private WebDriver driver;
    private ElementHelper elementHelper;
    private AlertHelper alertHelper;

    public CustomersPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }
    public void searchCustomers(String lastNameValue){
        elementHelper.fillLocator(CustomerLocators.customerName, lastNameValue);
        LoggerUtility.infoTest("The user filled last name filled with value");
    }
    public void validateCustomer(String firstNameValue, String lastNameValue, String postCodeValue){
        elementHelper.validateContainTextLocator(CustomerLocators.customerRow, firstNameValue);
        LoggerUtility.infoTest("The user validates the presence of" + firstNameValue);
        elementHelper.validateContainTextLocator(CustomerLocators.customerRow, lastNameValue);
        LoggerUtility.infoTest("The user validates the presence of" + lastNameValue);
        elementHelper.validateContainTextLocator(CustomerLocators.customerRow, postCodeValue);
        LoggerUtility.infoTest("The user validates the presence of" + postCodeValue);
    }
    public void deleteCustomer(){
        elementHelper.clickJSLocator(CustomerLocators.deleteButton);
        LoggerUtility.infoTest("The user is deleted");
        alertHelper.acceptAlert();
        LoggerUtility.infoTest("The user clicked on accept alert");
    }
}