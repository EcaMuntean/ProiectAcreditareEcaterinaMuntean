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
    public void clickOnAddressesLink(){
        clickOn(addressesLink);
    }
}
