package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CouponTest extends BaseTest{
    @Test
    public void createAndApplyCoupon(){
        loginSteps.doLogin(Constants.ADMIN_USERNAME,Constants.ADMIN_PASS);
        couponSteps.clickOnWordpressIcon();
        couponSteps.clickOnWooCommerce();
        couponSteps.clickOnCoupons();
        couponSteps.clickOnAddCoupons();
        couponSteps.setCouponCode(Constants.COUPON_CODE);
        couponSteps.setCouponAmount(Constants.COUPON_VALUE);
        couponSteps.selectDiscountType();
        couponSteps.clickOnPublish();
        couponSteps.validateSuccessMessage();
        couponSteps.clickOnHomepage();
        searchSteps.doSearch("Hoodie","HOODIE");
        cartSteps.addProductToCart("Hoodie");
        cartSteps.clickOnShoppingCart();
        cartSteps.setCouponInput(Constants.COUPON_CODE);
        cartSteps.clickOnApplyCoupon();
        cartSteps.validateSuccessMessage();
        cartSteps.validateCouponIsApplied(Constants.COUPON_VALUE);
    }
}
