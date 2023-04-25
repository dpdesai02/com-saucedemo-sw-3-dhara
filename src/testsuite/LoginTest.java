package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl="https://www.saucedemo.com/";
    @Before
    public void openUp(){
        openBrowser(baseUrl);
    }
    @After
    public void tearDown(){
        closeBrowser();}
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //Enter “standard_user” username
        sendTextToElement(By.id("user-name"),"standard_user");

        //Enter “secret_sauce” password
        sendTextToElement(By.id("password"),"secret_sauce");

        //Click on ‘LOGIN’ button
        clickOnElement(By.id("login-button"));

        //Verify the text “PRODUCTS”
        String expectedText = "Products";
        // actual text

        String actualText = getTextFromElement(By.xpath("//span[@class='title']"));
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        //Enter “standard_user” username
        sendTextToElement(By.id("user-name"),"standard_user");

        //Enter “secret_sauce” password
        sendTextToElement(By.id("password"),"secret_sauce");

        //Click on ‘LOGIN’ button
        clickOnElement(By.id("login-button"));

        //Verify that six products are displayed
        //on page
        int expectedNumber = 6;
        int actualNumber =getNumberFromElement(By.className("inventory_item"));

        System.out.println(actualNumber);
        Assert.assertEquals(expectedNumber,actualNumber);

    }
}





