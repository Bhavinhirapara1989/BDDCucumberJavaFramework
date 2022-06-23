package com.resourceswise.step_def;

import com.resourceswise.driver.DriverManager;
import com.resourceswise.pages.LogOutPage;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LogOutSteps extends DriverManager {

    LogOutPage logOutPage = new LogOutPage();

    @Then("^I should see Logout button displayed$")
    public void i_should_see_Logout_button_displayed() throws Throwable {

        boolean isLogOutButtonDisplayed = logOutPage.checkLogoutButtonIsDisplayed();
        assertThat(isLogOutButtonDisplayed,is(true));

    }
}
