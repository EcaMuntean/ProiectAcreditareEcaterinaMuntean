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
    public void loginWithInvalidUserNameTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUsername("adminn");
        loginSteps.setPassword("parola11");
        loginSteps.clickOnLogin();
        loginSteps.verifyUsernameIsIncorrect();
    }
    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUsername("admin");
        loginSteps.setPassword("parola111");
        loginSteps.clickOnLogin();
        loginSteps.verifyPasswordIsIncorrect();
    }
    @Test
    public void logOutTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUsername("admin");
        loginSteps.setPassword("parola11");
        loginSteps.clickOnLogin();
        loginSteps.verifyUserIsLoggedIn("admin");
        loginSteps.clickOnLogOut();
        loginSteps.verifyUserIsLoggedOut();
    }

}
