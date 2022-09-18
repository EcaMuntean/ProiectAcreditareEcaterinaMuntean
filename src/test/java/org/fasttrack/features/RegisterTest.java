package org.fasttrack.features;
import org.fasttrack.steps.RegisterSteps;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerWithValidEmail(){
        registerSteps.navigateToRegisterPage();
        registerSteps.setEmail("muntean1234@eca.com");
        registerSteps.setPassword("Muntean2022");
        registerSteps.clickOnRegister();
        registerSteps.verifyUserIsRegistered("muntean1234");
    }
    @Test
    public void registerWithWeakPassword(){
        registerSteps.navigateToRegisterPage();
        registerSteps.setEmail("muntean1234@eca.com");
        registerSteps.setPassword("Mun");
        registerSteps.verifyWeakPasswordMessage();
    }

}
