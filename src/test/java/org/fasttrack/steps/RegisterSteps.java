package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePage;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps{

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }
    @Step
    public void navigateToRegisterPage(){
        homePage.clickOnAccountLink();
    }
    @Step
    public void setEmail(String email){
        registerPage.setRegisterEmailField(email);
    }
    @Step
    public void setPassword(String password){
        registerPage.setRegisterPasswordField(password);
    }
    @Step
    public void clickOnRegister(){
        registerPage.clickOnRegisterButton();
    }
    @Step
    public void verifyUserIsRegistered(String username){
        Assert.assertEquals("Hello "+ username +" (not "+ username +"? Log out)", accountPage.getWelcomeMessage());
    }
    @Step
    public void verifyWeakPasswordMessage(){
        Assert.assertEquals("Very weak - Please enter a stronger password.", registerPage.getWeakPassword());

    }
    @Step
    public void verifySameEmailError(){
        Assert.assertEquals("Error: An account is already registered with your email address. Please log in.", registerPage.getSameEmailError());
    }
    @Step
    public void doRegister(String email, String password, String username){
        navigateToRegisterPage();
        setEmail(email);
        setPassword(password);
        clickOnRegister();
        verifyUserIsRegistered(username);
    }
}
