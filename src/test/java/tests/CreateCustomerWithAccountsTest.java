package tests;

import org.testng.annotations.Test;
import pages.*;
import sharedData.SharedData;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CreateCustomerWithAccountsTest extends SharedData {

    @Test
    public void testMethod() throws AWTException{

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickManagerLoginMenu();

        BankManagerPage bankManagerPage = new BankManagerPage(driver);
        bankManagerPage.clickAddCustomerElement();

        String firstNameValue = "Aida";
        String lastNameValue = "Georgiana";
        String postCodeValue = "111155";
        String fullNameValue = firstNameValue+" "+lastNameValue;
        String[] currencies = {"Dollar", "Pound", "Rupee"};

        AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
        addCustomerPage.fillFirstName(firstNameValue);
        addCustomerPage.fillLastName(lastNameValue);
        addCustomerPage.fillPostCode(postCodeValue);
        addCustomerPage.clickAddCustomerButton();

        bankManagerPage.clickOpenAccountElement();

        for (int i = 0; i < currencies.length; i++) {
            OpenAccountPage openAccountPage = new OpenAccountPage(driver);
            openAccountPage.selectCustomerName(fullNameValue);
            openAccountPage.selectCurrency(currencies[i]);
            openAccountPage.selectButton();
        }
    }
}