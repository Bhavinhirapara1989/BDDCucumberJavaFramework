package com.resourceswise.step_def;

import com.resourceswise.driver.DriverManager;
import com.resourceswise.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomeSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        String myActualUrl = driverManager.getUrl();
        System.out.println(myActualUrl);
        assertThat(myActualUrl,is(endsWith("nopcommerce.com/")));
    }

    @When("^I click on the \"([^\"]*)\"$")
    public void i_click_on_the(String headersName) throws Throwable {
        homePage.clickOnLoginButton();
    }
}
