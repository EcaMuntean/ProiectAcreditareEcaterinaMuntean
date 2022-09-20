package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{
    @Step
    public void clickOnProduct(){
        cartPage.clickOnProduct();
    }
    @Step
    public void clickOnAddToCart(){
        cartPage.clickOnAddToCart();
    }
    @Step
    public void validateConfirmationMessageIsPresent(){
        Assert.assertEquals("View cart\n“Hoodie with Zipper” has been added to your cart.",cartPage.getConfirmationMessage().getText());
    }
    @Step
    public void addProductToCart(String product){
        clickOnProduct();
        clickOnAddToCart();
        validateConfirmationMessageIsPresent();
    }
    @Step
    public void clickOnShoppingCart(){
        cartPage.clickOnShoppingCart();
    }
    @Step
    public void deleteFromCart(){
        cartPage.clickOnDeleteButton();
    }
    @Step
    public void validateDeleteConfirmation(){
        Assert.assertEquals("“Hoodie with Zipper” removed. Undo?",cartPage.getConfirmationMessage().getText());
    }
    @Step
    public void clickOnQuantityInput(){
        cartPage.clickOnQuantityInput();
    }
    @Step
    public void modifyQuantityOnCart(int value){
        cartPage.setQuantityInput(value);
    }
    @Step
    public void clickOnUpdateCartButton(){
        cartPage.clickOnUpdateCartButton();
    }
    /*@Step
    public void validateUpdateCart(int quantity){
        cartPage.getQuantityInput() == quantity;
    }*/
    @Step
    public void doAddToCartSteps(String product, int value){

    }

}
