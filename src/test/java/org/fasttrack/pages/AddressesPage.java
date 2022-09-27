package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AddressesPage extends BasePage{
    @FindBy(css = ".u-column1 .edit")
    private WebElementFacade editBillingAddressButton;
    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameInput;
    @FindBy(css = ".button[name = 'save_address']")
    private WebElementFacade saveButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessage;

    public void clickOnEditBillingButton(){
        clickOn(editBillingAddressButton);
    }
    public void setFirstNameInput(String value){
        firstNameInput.clear();
        typeInto(firstNameInput, value);
    }
    public String getFirstName(){
        String firstNameValue = firstNameInput.getAttribute("value");
        System.out.println("value is:"+firstNameValue);
        return firstNameValue;
    }
    public void clickOnSaveButton(){
        clickOn(saveButton);
    }
    public String getSuccessMessage(){
        return successMessage.getText();
    }
}
