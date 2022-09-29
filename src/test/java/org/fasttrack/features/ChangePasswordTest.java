package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class ChangePasswordTest extends BaseTest {

    @Test
    public void changePasswordTest(){
        registerSteps.doRegister(Constants.NEW_USER_EMAIL,Constants.CURRENT_PASS,Constants.NEW_USERNAME);
        changePasswordSteps.clickOnAccountDetails();
        changePasswordSteps.setAccountFirstName("Eca");
        changePasswordSteps.setAccountLastName("Muntean");
        changePasswordSteps.setCurrentPassword(Constants.CURRENT_PASS);
        changePasswordSteps.setNewPassword(Constants.NEW_PASS);
        changePasswordSteps.setConfirmPassword(Constants.NEW_PASS);
        changePasswordSteps.clickOnSaveButton();
        changePasswordSteps.validateConfirmationMessage();
        loginSteps.clickOnLogOut();
        loginSteps.doLogin(Constants.NEW_USER_EMAIL,Constants.NEW_PASS);
    }
}
