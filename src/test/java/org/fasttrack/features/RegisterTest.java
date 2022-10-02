package org.fasttrack.features;
import org.fasttrack.steps.RegisterSteps;
import org.fasttrack.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerWithValidEmail(){
        registerSteps.navigateToRegisterPage();
        registerSteps.setEmail(Constants.USER_EMAIL);
        registerSteps.setPassword(Constants.USER_PASS);
        registerSteps.clickOnRegister();
        registerSteps.verifyUserIsRegistered(Constants.USER_USERNAME);
    }
    @Test
    public void registerWithWeakPassword(){
        registerSteps.navigateToRegisterPage();
        registerSteps.setEmail(Constants.USER_EMAIL);
        registerSteps.setPassword("Mun");
        registerSteps.verifyWeakPasswordMessage();
    }
    @Test
    public void registerWithTheSameEmail(){
        registerSteps.navigateToRegisterPage();
        registerSteps.setEmail(Constants.USER_EMAIL);
        registerSteps.setPassword(Constants.USER_PASS);
        registerSteps.clickOnRegister();
        registerSteps.verifySameEmailError();
    }

}
