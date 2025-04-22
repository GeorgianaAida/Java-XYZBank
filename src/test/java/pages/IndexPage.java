package pages;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import pageLocators.IndexLocators;

public class IndexPage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public IndexPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }
    public void clickManagerLoginMenu(){
        elementHelper.clickLocator(IndexLocators.bankManagerLoginMenu);
        LoggerUtility.infoTest("The user clicked on manager login menu");
    }
}