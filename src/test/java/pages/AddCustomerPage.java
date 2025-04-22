package pages;



import helpMethods.AlertHelper;
import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import pageLocators.AddCustomerLocators;

import static pageLocators.AddCustomerLocators.*;

public class AddCustomerPage {
    private WebDriver driver;
    private ElementHelper elementHelper;
    private AlertHelper alertHelper;

    public AddCustomerPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        alertHelper = new AlertHelper(driver);
    }
    public void fillFirstName(String firstNameValue){
        elementHelper.fillLocator(firstNameElement, firstNameValue);
        LoggerUtility.infoTest("The user filled first name filled with value");
    }
    public void fillLastName(String lastNameValue){
        elementHelper.fillLocator(lastNameElement, lastNameValue);
        LoggerUtility.infoTest("The user filled last name filled with value");
    }
    public void fillPostCode(String postCodeValue){
        elementHelper.fillLocator(postCodeElement, postCodeValue);
        LoggerUtility.infoTest("The user filled post code filled with value");
    }
    public void clickAddCustomerButton(){
        elementHelper.clickLocator(addCustomerButton);
        LoggerUtility.infoTest("The user clicked on add customer button");
        alertHelper.acceptAlert();
        LoggerUtility.infoTest("The user clicked on accept alert");
    }
}
