package org.fasttrack.features;

import org.junit.Test;

public class SearchTest extends BaseTest{
    @Test
    public void searchLinkTest(){
        searchSteps.clickOnSearchLink();
        searchSteps.enterSearchWord("Hoodie");
        searchSteps.clickOnSearchButton();
        searchSteps.validateSearchResult("HOODIE");
    }
}
