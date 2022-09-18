package org.fasttrack.features;

import org.junit.Test;

public class CartTest extends BaseTest{
    @Test
    public void addToCart(){
        cartSteps.clickOnSearchLink();
        cartSteps.enterSearchWord("Hoodie");
        cartSteps.clickOnSearchButton();
        cartSteps.clickOnProduct();
        cartSteps.clickOnAddToCart();
        cartSteps.validateConfirmationMessageIsPresent();
    }
    @Test
    public void deleteFromCart(){
        cartSteps.addProductToCart("Hoodie");
        cartSteps.clickOnShoppingCart();
        cartSteps.deleteFromCart();
        cartSteps.validateDeleteConfirmation();
    }
    @Test
    public void updateCartInfo(){
        cartSteps.addProductToCart("Hoodie");
        cartSteps.clickOnShoppingCart();
        cartSteps.clickOnQuantityInput();
        cartSteps.modifyQuantityOnCart(5);
        cartSteps.clickOnUpdateCartButton();
        //cartSteps.validateUpdateCart(5);
    }
}
