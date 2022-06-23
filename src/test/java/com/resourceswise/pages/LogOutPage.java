package com.resourceswise.pages;

import com.resourceswise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends DriverManager {

    @FindBy(css = ".ico-logout")
    WebElement logOutButton;

    public boolean checkLogoutButtonIsDisplayed(){
        return logOutButton.isDisplayed();
    }
}
