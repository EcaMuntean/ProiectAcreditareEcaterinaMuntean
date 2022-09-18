package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.WeakHashMap;

public class CartPage extends BasePage{
    @FindBy(css = ".entry-thumb a[href='http://qa2.fasttrackit.org:8008/?product=hoodie-with-zipper']")
    private WebElementFacade product;
    @FindBy(css = ".cart button")
    private WebElementFacade addToCartButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade confirmationMessage;
    @FindBy(css = ".product-remove a")
    private WebElementFacade deleteButton;
    @FindBy(css = ".header-cart a[title = 'View your shopping cart']")
    private WebElementFacade shoppingCart;
    @FindBy(xpath = "//input[@class = 'input-text qty text']")
    private WebElementFacade quantityInput;
    @FindBy(css = ".button[name='update_cart']")
    private WebElementFacade updateCartButton;

    public void clickOnProduct(){
        clickOn(product);
    }
    public void clickOnAddToCart(){
        clickOn(addToCartButton);
    }
    public WebElementFacade getConfirmationMessage(){
        return confirmationMessage;
    }
    public void clickOnDeleteButton(){
        clickOn(deleteButton);
    }
    public void clickOnShoppingCart(){
        clickOn(shoppingCart);
    }
    public void clickOnQuantityInput(){
        clickOn(quantityInput);
    }
    public void setQuantityInput(int quantity){
        quantityInput.clear();
        quantityInput.sendKeys(""+quantity);
    }
    public WebElementFacade getQuantityInput(){
        return quantityInput;
    }
    public void clickOnUpdateCartButton(){
        clickOn(updateCartButton);
    }
}
