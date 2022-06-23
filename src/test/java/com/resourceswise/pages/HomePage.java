package com.resourceswise.pages;

import com.resourceswise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    @FindBy(css=".ico-login")
    private WebElement loginButton;

    public void clickOnLoginButton(){
        loginButton.click();
    }

}
