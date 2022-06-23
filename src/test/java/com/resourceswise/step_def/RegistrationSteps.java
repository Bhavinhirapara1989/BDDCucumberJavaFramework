package com.resourceswise.step_def;

import com.resourceswise.driver.DriverManager;
import com.resourceswise.pages.RegistrationPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps extends DriverManager {
    RegistrationPage registrationPage = new RegistrationPage();

    @When("^I click on register$")
    public void i_click_on_register() throws Throwable {
        registrationPage.clickOnRegisterButton();
    }

    @Then("^I select gender Male or Female$")
    public void i_select_gender() throws Throwable {
           registrationPage.selectGender();
    }

    @Then("^I enter firstname as \"([^\"]*)\" and lastname as \"([^\"]*)\"$")
    public void i_enter_firstname_as_and_lastname_as(String Bhavin, String Patel) throws Throwable {
          registrationPage.enterDetails(Bhavin,Patel);
    }

    @Then("^I enter email as a \"([^\"]*)\"$")
    public void i_enter_email_as_a(String email) throws Throwable {
        registrationPage.enterEmail(email);

    }

    @Then("^I enter password as a \"([^\"]*)\" and confirm password as a \"([^\"]*)\"$")
    public void i_enter_password_as_a_and_confirm_password_as_a(String password, String password1) throws Throwable {
        registrationPage.enterPass(password, password1);

    }

    @Then("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
        registrationPage.clickOnRegisterButton();



    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String youreregistrationcompleted) throws Throwable {


    }
}
