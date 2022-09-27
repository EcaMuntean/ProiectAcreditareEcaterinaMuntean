package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage extends PageObject {
        public int convertStringToInteger(String element){
        return Integer.parseInt(element
                .replaceAll(" lei", "")
                .replaceAll(",","")) ;


    }

}
