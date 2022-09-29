package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.Select;


public class AdminPage extends BasePage{
    @FindBy(css = ".ab-item[href='http://qa2.fasttrackit.org:8008/wp-admin/about.php']")
    private WebElementFacade wordPressIcon;
    @FindBy(css = "#toplevel_page_woocommerce ")
    private WebElementFacade wooCommerce;
    @FindBy(css = "a[href='edit.php?post_type=shop_coupon']")
    private WebElementFacade coupons;
    @FindBy(css = "a[class='page-title-action']")
    private WebElementFacade addCoupons;
    @FindBy(css = "#title")
    private WebElementFacade couponCode;
    @FindBy(css = "#discount_type")
    private WebElementFacade discountTypeList;
    @FindBy(css = "#coupon_amount")
    private WebElementFacade couponAmount;
    @FindBy(css = "#publish")
    private WebElementFacade publishButton;
    @FindBy(css = ".notice-success")
    private WebElementFacade successMessage;
    @FindBy(css = "a[href='http://qa2.fasttrackit.org:8008/']")
    private WebElementFacade homePage;

    public void clickOnWordPressIcon(){
        clickOn(wordPressIcon);
    }
    public void clickOnWooCommerce(){
        clickOn(wooCommerce);
    }
    public void clickOnCoupons(){
        clickOn(coupons);
    }
    public void clickOnAddCoupons(){
        clickOn(addCoupons);
    }
    public void setCouponCode(String value){
        typeInto(couponCode,value);
    }
    public void clickOnFixedCartDiscount(){
        Select select = new Select(discountTypeList);
        select.selectByValue("fixed_cart");
    }
    public void setCouponAmount(String value){
        typeInto(couponAmount,value);
    }
    public void clickOnPublishButton(){
        clickOn(publishButton);
    }
    public String getSuccessMessage(){
        return successMessage.getText();
    }
    public void clickOnHomePage(){
        clickOn(homePage);
    }
}
