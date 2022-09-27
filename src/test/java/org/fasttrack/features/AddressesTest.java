package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class AddressesTest extends BaseTest{
    @Test
    public void changeBillingAddress(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        addressesSteps.clickOnAddresses();
        addressesSteps.clickOnEditBillingButton();
        addressesSteps.setNewFirstName("Vultur");
        addressesSteps.clickOnSaveButton();
        addressesSteps.validateSuccessMessage();
        addressesSteps.clickOnEditBillingButton();
        addressesSteps.validateFirstNameIsActuallyChanged("Vultur");
    }
}
