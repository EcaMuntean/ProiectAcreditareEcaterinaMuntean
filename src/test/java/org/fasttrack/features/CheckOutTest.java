package org.fasttrack.features;

import org.fasttrack.steps.CheckOutSteps;
import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CheckOutTest extends BaseTest{
    @Test
     public void checkOutWithValidDetails() {
        searchSteps.doSearch("Hoodie","HOODIE");
        cartSteps.addProductToCart("Hoodie");
        cartSteps.clickOnShoppingCart();
        checkOutSteps.clickOnCheckOutbutton();
        checkOutSteps.setFirstname(Constants.FIRSTNAME);
        checkOutSteps.setLastName(Constants.LASTNAME);
        checkOutSteps.setAddress(Constants.ADDRESS);
        checkOutSteps.setCity(Constants.CITY);
        checkOutSteps.setPostcode(Constants.POSTCODE);
        checkOutSteps.setPhone(Constants.PHONE);
        checkOutSteps.setEmail(Constants.USER_EMAIL);
        checkOutSteps.clickOnPlaceOrderButton();
        checkOutSteps.veriffyOrderIsPlaced();
    }

}
