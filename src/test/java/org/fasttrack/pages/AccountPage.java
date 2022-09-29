package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends BasePage{

    @FindBy(css = ".woocommerce-MyAccount-content p:first-of-type")
    private WebElementFacade welcomeMessage;
    @FindBy(css = ".woocommerce-MyAccount-navigation-link--orders a")
    private WebElementFacade ordersLink;
    @FindBy(css = "tr:first-of-type .woocommerce-orders-table__cell-order-number a")
    private WebElementFacade firstOrderNumber;
    @FindBy(css = ".woocommerce-MyAccount-navigation-link--edit-address a")
    private WebElementFacade addressesLink;
    @FindBy(css = ".woocommerce-MyAccount-navigation-link--edit-account a")
    private WebElementFacade accountDetails;
    @FindBy(css = "#account_first_name")
    private WebElementFacade accountFirstName;
    @FindBy(css = "#account_last_name")
    private WebElementFacade accountLastName;
    @FindBy(css = "#password_current")
    private WebElementFacade currentPassword;
    @FindBy(css = "#password_1")
    private WebElementFacade newPassword;
    @FindBy(css = "#password_2")
    private WebElementFacade confirmPassword;
    @FindBy(css = ".woocommerce-Button")
    private WebElementFacade saveButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade confirmationMessage;

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }
    public Boolean isNotPresentWelcomeMessage(){
        return !welcomeMessage.isPresent();
    }
    public void clickOnOrdersLink(){
        clickOn(ordersLink);
    }
    public WebElementFacade getFirstOrderNumber() {
        return firstOrderNumber;
    }
    public void clickOnAccountDetails(){
        clickOn(accountDetails);
    }
    public void setAccountFirstName(String value){
        typeInto(accountFirstName, value);
    }
    public void setAccountLastName(String value){
        typeInto(accountLastName,value);
    }
    public void setCurrentPassword(String value){
        typeInto(currentPassword,value);
    }
    public void setNewPassword(String value){
        typeInto(newPassword,value);
    }
    public void setConfirmPassword(String value){
        typeInto(confirmPassword,value);
    }
    public void clickOnSaveButton(){
        clickOn(saveButton);
    }
    public String getConfirmationMessage(){
        return confirmationMessage.getText();
    }
}
