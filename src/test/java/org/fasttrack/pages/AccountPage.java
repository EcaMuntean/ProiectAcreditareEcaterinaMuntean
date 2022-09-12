package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends BasePage{

    @FindBy(css = ".woocommerce-MyAccount-content p:first-of-type")
    private WebElementFacade welcomeMessage;

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }
}
