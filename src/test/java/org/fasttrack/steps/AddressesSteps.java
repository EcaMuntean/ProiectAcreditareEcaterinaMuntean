package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AddressesSteps extends BaseSteps{
    @Step
    public void clickOnAddresses(){
        accountPage.clickOnAddressesLink();
    }
    @Step
    public void clickOnEditBillingButton(){
        addressesPage.clickOnEditBillingButton();
    }
    @Step
    public void setNewFirstName(String newFirstName){
        addressesPage.setFirstNameInput(newFirstName);
    }
    @Step
    public void clickOnSaveButton(){
        addressesPage.clickOnSaveButton();
    }
    @Step
    public void validateSuccessMessage(){
        Assert.assertEquals("Address changed successfully.", addressesPage.getSuccessMessage());
    }
    @Step
    public void validateFirstNameIsActuallyChanged(String newFirstName){
        clickOnEditBillingButton();
        Assert.assertEquals(newFirstName,addressesPage.getFirstName());
    }
}
