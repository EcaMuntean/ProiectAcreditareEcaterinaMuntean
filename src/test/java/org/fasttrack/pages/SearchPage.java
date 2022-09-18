package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends BasePage{
    @FindBy( css =".icon-search")
    private WebElementFacade searchLink ;
    @FindBy(css = ".search-form input")
    private WebElementFacade searchInput;
    @FindBy(css = ".search-form button")
    private WebElementFacade searchButton;
    @FindBy(css =".entry-title")
    private WebElementFacade searchResult;

    public void clickOnSearchLink(){
        clickOn(searchLink);
    }
    public void setSearchInput(String searchWord){
        typeInto(searchInput, searchWord);
    }
    public void clickOnSearchButton(){
        clickOn(searchButton);
    }

    public WebElementFacade getSearchResult() {
        return searchResult;
    }


}
