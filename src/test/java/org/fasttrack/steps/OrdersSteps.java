package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.CheckOutPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class OrdersSteps extends BaseSteps{
    String orderFromCheckout = "";

    @Step
    public void clickOnOrders(){
        accountPage.clickOnOrdersLink();
    }
    @Step
    public String getOrderNumberFromOrders(){
        WebElement ordOrds = accountPage.getFirstOrderNumber();
        return ordOrds.getText();
    }
    @Step
    public String getOrderNumberFromCheckout(){
        WebElement ordChk = checkOutPage.getOrderNumber();
        orderFromCheckout = ordChk.getText();
        return orderFromCheckout;
    }
    @Step
    public void verifyNewOrderIsInOrdersList(){
        Assert.assertEquals(getOrderNumberFromOrders(),"#" +orderFromCheckout);
    }
}
