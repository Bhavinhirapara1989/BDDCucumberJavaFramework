package com.resourceswise;

import com.resourceswise.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.sql.Driver;

public class Hooks {
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp()throws IllegalAccessException {
        driverManager.runOnLocalBrowser();
        driverManager.goToUrl();
        driverManager.maxbrowser();
        driverManager.applyImpliciteWait();
    }

    @After
    public void tearDown(){
        driverManager.closeBrowser();

    }
}
