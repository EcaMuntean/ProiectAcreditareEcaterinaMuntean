package org.fasttrack.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class LoginSteps extends BaseSteps{

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }
    @Step
    public void navigateToLoginPage(){
        homePage.clickOnAccountLink();
    }
    @Step
    public void setUsername(String username){
        loginPage.setUsernameField(username);
    }
    @Step
    public void setPassword(String password){
        loginPage.setPasswordField(password);
    }
    @Step
    public void clickOnLogin(){
        loginPage.clickOnLoginButton();
    }
    @Step
    public void verifyUserIsLoggedIn(String username){
        Assert.assertEquals("Hello "+ username +" (not "+ username +"? Log out)", accountPage.getWelcomeMessage());
    }
    @Step
    public void verifyUsernameIsIncorrect(){
        Assert.assertEquals("ERROR: Invalid username. Lost your password?", loginPage.getErrorMessage());
    }
    @Step
    public void verifyPasswordIsIncorrect(){
        Assert.assertEquals("ERROR: The password you entered for the username admin is incorrect. Lost your password?", loginPage.getErrorMessage());
    }

    @Step
    public void doLogin(String username, String password){
        navigateToLoginPage();
        setUsername(username);
        setPassword(password);
        clickOnLogin();
    }
    @Step
    public void clickOnLogOut(){
        loginPage.clickOnLogOutLink();
    }
    @Step
    public boolean verifyUserIsLoggedOut(){
       return accountPage.isNotPresentWelcomeMessage();
    }


}
