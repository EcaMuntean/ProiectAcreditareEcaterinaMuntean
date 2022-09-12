package org.fasttrack.features;

import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentialsTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUsername("admin");
        loginSteps.setPassword("parola11");
        loginSteps.clickOnLogin();
        loginSteps.verifyUserIsLoggedIn("admin");
    }

    @Test
    public void loginWithInvalidCredentialsTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUsername("adminn");
        loginSteps.setPassword("parola111");
        loginSteps.clickOnLogin();
        loginSteps.verifyUserNotLoggedIn();
    }
}
