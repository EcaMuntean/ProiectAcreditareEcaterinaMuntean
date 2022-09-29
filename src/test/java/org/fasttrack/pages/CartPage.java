package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
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
    @FindBy(css = "tbody .woocommerce-cart-form__cart-item td[data-title = 'Total']")
    private List<WebElementFacade> totalProductList;
    @FindBy(css = "tbody  td[data-title = 'Subtotal'] ")
    private WebElementFacade subtotalCartPrice ;
    @FindBy(css = "#coupon_code")
    private WebElementFacade couponCodeInput;
    @FindBy(css = ".button[name = 'apply_coupon']")
    private WebElementFacade applyCouponButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessage;
    @FindBy(css = ".cart-discount .woocommerce-Price-amount")
    private WebElementFacade couponValue;



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

    public int getProductsTotal(){
        int sum = 0;
        for (WebElementFacade elementFacade:totalProductList){
            sum+= convertStringToInteger(elementFacade.getText());
        }
        return sum;

    }
    public boolean checkIfSubtotalAndTotalMatches(){
        int expected = getProductsTotal();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
                return expected == actual;
    }
    public void setCouponCodeInput(String value){
        typeInto(couponCodeInput,value);
    }
    public void clickOnApplyCoupon(){
        clickOn(applyCouponButton);
    }
    public String getSuccessMessage(){
        return successMessage.getText();
    }
    public int getCouponValue(){
        int amount = convertStringToIntegerWithoutZeros(couponValue.getText());
        return amount;
    }

}
