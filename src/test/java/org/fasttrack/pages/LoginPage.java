package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage{
    @FindBy(css = "#username")
    private WebElementFacade usernameField;
    @FindBy(css = "#password")
    private WebElementFacade passwordField;
    @FindBy(css = ".form-row button[name=login]")
    private WebElementFacade loginButton;
    @FindBy(css = ".woocommerce-error li:first-of-type")
    private WebElementFacade errorMessageElement;
    @FindBy(css = ".woocommerce-MyAccount-navigation-link:last-of-type")
    private WebElementFacade logOutLink;
    public void setUsernameField(String value) {
        typeInto(usernameField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }
    public void clickOnLoginButton(){
        clickOn(loginButton);
    }
    public String getErrorMessage(){
        return errorMessageElement.getText();
    }
    public void clickOnLogOutLink(){
        clickOn(logOutLink);
    }
}
