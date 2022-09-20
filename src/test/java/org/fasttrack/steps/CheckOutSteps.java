package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.yecht.Data;

public class CheckOutSteps extends BaseSteps{
    @Step
    public void clickOnCheckOutbutton(){checkOutPage.clickOnCheckOutButton();}

    @Step
    public void setFirstname(String firstName ){checkOutPage.setFirstName(firstName);}

    @Step
    public void setLastName(String lastName){checkOutPage.setLastName(lastName);}

    @Step
    public void setAddress(String address){checkOutPage.setAddress(address);}

    @Step
    public void setCity(String city){checkOutPage.setCity(city);}

    @Step
    public void setPostcode(String postcode){checkOutPage.setPostcode(postcode);}

    @Step
    public void setPhone(String phone){checkOutPage.setPhone(phone);}

    @Step
    public void setEmail(String email){checkOutPage.setEmail(email);}

    @Step
    public void clickOnPlaceOrderButton(){checkOutPage.clickOnPlaceOrderButton();}

    @Step
    public void veriffyOrderIsPlaced(){
        waitABit(3000);
        Assert.assertEquals("ORDER RECEIVED", checkOutPage.getSuccessMessage());
    }



    }


