package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CouponSteps extends BaseSteps{
    @Step
    public void clickOnWordpressIcon(){
        adminPage.clickOnWordPressIcon();
    }
    @Step
    public void clickOnWooCommerce(){
        adminPage.clickOnWooCommerce();
    }
    @Step
    public void clickOnCoupons(){
        adminPage.clickOnCoupons();
    }
    @Step
    public void clickOnAddCoupons(){
        adminPage.clickOnAddCoupons();
    }
    public void setCouponCode(String code){
        adminPage.setCouponCode(code);
    }
    @Step
    public void setCouponAmount(String value){
        adminPage.setCouponAmount(value);
    }
    @Step
    public void selectDiscountType(){
        adminPage.clickOnFixedCartDiscount();
    }
    @Step
    public void clickOnPublish(){
        adminPage.clickOnPublishButton();
    }
    @Step
    public void validateSuccessMessage(){
        Assert.assertEquals("Coupon updated.\n" +"Dismiss this notice.",adminPage.getSuccessMessage());
    }
    public void clickOnHomepage(){
        adminPage.clickOnHomePage();
    }
}
