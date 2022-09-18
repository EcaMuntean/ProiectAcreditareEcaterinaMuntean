package org.fasttrack.steps;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{

    @Step
    public void clickOnSearchLink(){
        searchPage.clickOnSearchLink();
    }
    @Step
    public void enterSearchWord(String searchWord){
        searchPage.setSearchInput(searchWord);
    }
    @Step
    public void clickOnSearchButton(){
        searchPage.clickOnSearchButton();
    }
    @Step
    public void validateSearchResult(String searchWord){
        Assert.assertTrue(searchPage.getSearchResult().getText().contains(searchWord));
    }
}
