package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends BasePage{
    //    @FindBy(css = "#menu-item-64")
    @FindBy(xpath = "//li[@id = 'menu-item-64']/a")
    private WebElementFacade myAccountLink;

    public void clickOnAccountLink(){
        clickOn(myAccountLink);
    }
}
