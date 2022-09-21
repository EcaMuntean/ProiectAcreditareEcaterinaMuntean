package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class OrdersTest extends BaseTest{
    @Test
    public void checkNewOrderIsPresentInOrdersList(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
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
        ordersSteps.getOrderNumberFromCheckout();
        loginSteps.navigateToLoginPage();
        ordersSteps.clickOnOrders();
        ordersSteps.verifyNewOrderIsInOrdersList();
    }
}
