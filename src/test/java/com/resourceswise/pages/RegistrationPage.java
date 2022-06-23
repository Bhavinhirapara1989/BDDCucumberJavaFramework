package com.resourceswise.pages;

import com.resourceswise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.charset.MalformedInputException;

public class RegistrationPage extends DriverManager {

    @FindBy(css = ".ico-register")
    WebElement clickRegister;

    @FindBy(id = "gender-male")
    WebElement enterGender;

    @FindBy(id = "FirstName")
    WebElement inputFirstname;

    @FindBy(id = "LastName")
    WebElement inputLastname;

    @FindBy (id = "Email")
    WebElement inputEmail;

    @FindBy (id = "Password")
    WebElement inputPassword;

    @FindBy (id = "ConfirmPassword")
    WebElement inputConfirmPassword;

    @FindBy (css = ".ico-register")
    WebElement clickRegisterButton;

    public void register(){
        clickRegister.click();
    }

    public void selectGender(){
        enterGender.click();

    }

    public void enterDetails(String FirstName, String LastName) {
        inputFirstname.sendKeys(FirstName);
        inputLastname.sendKeys(LastName);
    }

    public void enterEmail(String emailid) {
        inputEmail.sendKeys(emailid);

    }

    public void enterPass(String Password, String confirmPassword){
        inputPassword.sendKeys(Password);
        inputConfirmPassword.sendKeys(confirmPassword);

    }


    public void clickOnRegisterButton() {
        clickRegister.click();

    }

}
