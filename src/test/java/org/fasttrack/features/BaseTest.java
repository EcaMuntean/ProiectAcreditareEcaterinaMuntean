package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.LoginSteps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    protected LoginSteps loginSteps;

    @Before
    public void init(){
        driver.manage().window().maximize();
        driver.get("http://qa2.fasttrackit.org:8008/");
    }
}
