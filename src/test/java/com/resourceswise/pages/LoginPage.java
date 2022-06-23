package com.resourceswise.pages;

import com.resourceswise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {

    @FindBy (css = ".page-title")
    WebElement welcomePage;

    @FindBy(id = "Email")
    WebElement emailinputField;

    @FindBy (id = "Password")
    WebElement passwordinputField;

    @FindBy(css = ".login-button")
    WebElement loginSubmitButton;


    public void enterLoginCreds(String email, String password){
        emailinputField.clear();
        emailinputField.sendKeys(email);
        passwordinputField.clear();
        passwordinputField.sendKeys(password);

    }

    public void clickOnLoginSubmitButton(){

        loginSubmitButton.click();
    }
}
