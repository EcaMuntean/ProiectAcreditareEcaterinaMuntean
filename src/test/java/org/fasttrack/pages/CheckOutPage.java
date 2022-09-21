package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckOutPage extends BasePage{
    @FindBy(css ="#billing_first_name")
    private WebElementFacade firstName;
    @FindBy(css ="#billing_last_name")
    private WebElementFacade lastName;
    @FindBy(css="#billing_address_1[placeholder = 'House number and street name']")
    private WebElementFacade address;
    @FindBy(css="#billing_city[name='billing_city']")
    private WebElementFacade city;
    @FindBy(css="#billing_postcode[name='billing_postcode']")
    private WebElementFacade postcode;
    @FindBy(css="#billing_phone")
    private WebElementFacade phone;
    @FindBy(css="#billing_email")
    private WebElementFacade email;
    @FindBy(css="#place_order")
    private WebElementFacade placeOrder;
    @FindBy(xpath = "//h2[@class = 'entry-title']")
    private WebElementFacade successMessage;
    @FindBy(css=".checkout-button")
    private WebElementFacade checkOutButton;
    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorMessage;
    @FindBy(css = ".woocommerce-order-overview__order strong")
    private WebElementFacade orderNumber;

    public void clickOnCheckOutButton(){
        clickOn(checkOutButton);
    }
    public void setFirstName(String value) {typeInto(firstName,value );}

    public void setLastName(String value) {typeInto(lastName,value);}

    public void setAddress(String value) {typeInto(address, value );}

    public void setCity(String value) {typeInto(city,value);}

    public void setPostcode(String value) {typeInto(postcode,value);}

    public void setPhone(String value) {typeInto(phone,value);}

    public void setEmail(String value){typeInto(email,value);}
    public void clickOnPlaceOrderButton(){
        clickOn(placeOrder);
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
    public String getErrorMessage() {
        return errorMessage.getText();
    }
    public WebElementFacade getOrderNumber(){
        return orderNumber;
    }

}

