package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentialsTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUsername(Constants.ADMIN_USERNAME);
        loginSteps.setPassword(Constants.ADMIN_PASS);
        loginSteps.clickOnLogin();
        loginSteps.verifyUserIsLoggedIn(Constants.ADMIN_USERNAME);
    }

    @Test
    public void loginWithInvalidUserNameTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUsername("aadmin");
        loginSteps.setPassword(Constants.ADMIN_PASS);
        loginSteps.clickOnLogin();
        loginSteps.verifyUsernameIsIncorrect();
    }
    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUsername(Constants.ADMIN_USERNAME);
        loginSteps.setPassword("parola123");
        loginSteps.clickOnLogin();
        loginSteps.verifyPasswordIsIncorrect();
    }
    @Test
    public void logOutTest(){
        loginSteps.doLogin(Constants.ADMIN_USERNAME,Constants.ADMIN_PASS);
        loginSteps.verifyUserIsLoggedIn(Constants.ADMIN_USERNAME);
        loginSteps.clickOnLogOut();
        loginSteps.verifyUserIsLoggedOut();
    }

}
