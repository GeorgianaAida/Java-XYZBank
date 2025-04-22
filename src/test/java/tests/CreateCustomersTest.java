package tests;

import org.testng.annotations.Test;
import pages.AddCustomerPage;
import pages.BankManagerPage;
import pages.IndexPage;
import sharedData.SharedData;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CreateCustomersTest extends SharedData {
    @Test
    public void testMethod(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickManagerLoginMenu();

        BankManagerPage bankManagerPage = new BankManagerPage(driver);
        bankManagerPage.clickAddCustomerElement();

        String[] firstNames = {"Alina", "Elena", "Ioana", "Madalina"};
        String[] lastNames = {"Simson", "Johnson", "Smith", "Argo"};
        String[] postCodes = {"251569", "123456", "654321", "556678"};

        for (int i = 0; i < firstNames.length; i++) {
            AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
            addCustomerPage.fillFirstName(firstNames[i]);
            addCustomerPage.fillLastName(lastNames[i]);
            addCustomerPage.fillPostCode(postCodes[i]);
            addCustomerPage.clickAddCustomerButton();
        }
    }
}