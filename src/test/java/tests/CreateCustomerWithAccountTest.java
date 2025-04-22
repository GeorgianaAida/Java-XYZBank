package tests;

import org.testng.annotations.Test;
import pages.*;
import sharedData.SharedData;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CreateCustomerWithAccountTest extends SharedData {

    @Test
    public void testMethod() throws AWTException{

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickManagerLoginMenu();

        BankManagerPage bankManagerPage = new BankManagerPage(driver);
        bankManagerPage.clickAddCustomerElement();

        String firstNameValue = "Aida";
        String lastNameValue = "Georgiana";
        String postCodeValue = "123456";
        String fullNameValue = firstNameValue+" "+lastNameValue;
        String currencyValue = "Dollar";

        AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
        addCustomerPage.fillFirstName(firstNameValue);
        addCustomerPage.fillLastName(lastNameValue);
        addCustomerPage.fillPostCode(postCodeValue);
        addCustomerPage.clickAddCustomerButton();


        bankManagerPage.clickOpenAccountElement();
        OpenAccountPage openAccountPage = new OpenAccountPage(driver);
        openAccountPage.selectCustomerName(fullNameValue);
        openAccountPage.selectCurrency(currencyValue);
        openAccountPage.selectButton();



        bankManagerPage.clickCustomersElement();
        CustomersPage customersPage = new CustomersPage(driver);

        customersPage.searchCustomers(lastNameValue);
        customersPage.validateCustomer(firstNameValue, lastNameValue, postCodeValue);

    }
}