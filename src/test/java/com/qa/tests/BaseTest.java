package com.qa.tests;

import com.qa.config.BrowserFactory;
import com.qa.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = BrowserFactory.createDriver(ConfigReader.getBrowserName());
        driver.get(ConfigReader.getBaseUrl());
        System.out.println("Browser launched and navigated to: " + ConfigReader.getBaseUrl());
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            System.out.println("Test failed: " + result.getName());
        }
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed");
        }
    }
}
