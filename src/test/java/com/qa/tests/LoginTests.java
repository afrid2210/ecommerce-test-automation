package com.qa.tests;

import com.qa.pages.LoginPage;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginTests extends BaseTest {

    @Test(description = "Verify user can login with valid credentials")
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        assertThat(driver.getCurrentUrl()).contains("inventory");
    }

    @Test(description = "Verify error message appears with invalid credentials")
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid_user", "invalid_pass");
        String errorMsg = loginPage.getErrorMessage();
        assertThat(errorMsg).contains("Epic sadface");
    }
}
