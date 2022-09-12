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
}
