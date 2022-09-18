package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends BasePage{

    @FindBy(css ="#reg_email")
    private WebElementFacade registerEmailField;
    @FindBy(css = "#reg_password")
    private WebElementFacade registerPasswordField;
    @FindBy(css =".woocommerce-FormRow button")
    private WebElementFacade registerButton;
    @FindBy(css = ".woocommerce-password-strength")
    private WebElementFacade weakPassword;

    public void setRegisterEmailField(String value) {
        typeInto(registerEmailField, value);
    }
    public void setRegisterPasswordField(String value) {
        typeInto(registerPasswordField, value);
    }
    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }
    public String getWeakPassword(){
        return weakPassword.getText();
    }



}
