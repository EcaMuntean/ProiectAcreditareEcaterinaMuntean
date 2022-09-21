package org.fasttrack.features;

import org.junit.Test;

public class CartTest extends BaseTest{
    @Test
    public void addToCart(){
        searchSteps.doSearch("Hoodie","HOODIE");
        cartSteps.clickOnProduct();
        cartSteps.clickOnAddToCart();
        cartSteps.validateConfirmationMessageIsPresent();
    }
    @Test
    public void deleteFromCart(){
        searchSteps.doSearch("Hoodie","HOODIE");
        cartSteps.addProductToCart("Hoodie");
        cartSteps.clickOnShoppingCart();
        cartSteps.deleteFromCart();
        cartSteps.validateDeleteConfirmation();
    }
    @Test
    public void updateCartInfo(){
        searchSteps.doSearch("Hoodie","HOODIE");
        cartSteps.addProductToCart("Hoodie");
        cartSteps.clickOnShoppingCart();
        cartSteps.clickOnQuantityInput();
        cartSteps.modifyQuantityOnCart(5);
        cartSteps.clickOnUpdateCartButton();
        //cartSteps.validateUpdateCart(5);
    }
    @Test
    public void checkSubtotalAndTotalPrice(){
        searchSteps.doSearch("Hoodie","HOODIE");
        cartSteps.addProductToCart("Hoodie");
        cartSteps.clickOnShoppingCart();
        cartSteps.clickOnQuantityInput();
        cartSteps.modifyQuantityOnCart(5);
        cartSteps.clickOnUpdateCartButton();
        cartSteps.checkSubtotalAndTotalPrice();
    }


}
