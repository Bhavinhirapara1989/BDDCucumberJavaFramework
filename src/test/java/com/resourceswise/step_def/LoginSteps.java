package com.resourceswise.step_def;

import com.resourceswise.driver.DriverManager;
import com.resourceswise.pages.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverManager {

    LoginPage loginPage = new LoginPage();


    @Then("^I should see \"([^\"]*)\" text on login page$")
    public void i_should_see_text_on_login_page(String exepectedText) throws Throwable {

    }

    @Then("^the url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain_with(String expectedMessage) throws Throwable {

    }

    @When("^I enter my username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_my_username_and_password(String email, String password) throws Throwable {

        loginPage.enterLoginCreds(email,password);

    }

    @When("^I click on Login button on Login page$")
    public void i_click_on_Login_button_on_Login_page() throws Throwable {

        loginPage.clickOnLoginSubmitButton();

    }


}

