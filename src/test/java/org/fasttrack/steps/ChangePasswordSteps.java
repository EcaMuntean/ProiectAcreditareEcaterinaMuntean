package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ChangePasswordSteps extends BaseSteps{
    @Step
    public void clickOnAccountDetails(){
        accountPage.clickOnAccountDetails();
    }
    @Step
    public void setAccountFirstName(String firstName){
        accountPage.setAccountFirstName(firstName);
    }
    @Step
    public void setAccountLastName(String lastName){
        accountPage.setAccountLastName(lastName);
    }
    @Step
    public void setCurrentPassword(String currentPassword){
        accountPage.setCurrentPassword(currentPassword);
    }
    @Step
    public void setNewPassword(String newPassword){
        accountPage.setNewPassword(newPassword);
    }
    @Step
    public void setConfirmPassword(String confirmPassword){
        accountPage.setConfirmPassword(confirmPassword);
    }
    @Step
    public void clickOnSaveButton(){
        accountPage.clickOnSaveButton();
    }
    @Step
    public void validateConfirmationMessage(){
        Assert.assertEquals("Account details changed successfully.",accountPage.getConfirmationMessage());
        waitABit(3000);
    }

}
