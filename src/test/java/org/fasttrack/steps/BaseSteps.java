package org.fasttrack.steps;

import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrack.pages.AccountPage;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.LoginPage;

public class BaseSteps extends ScenarioSteps {
    protected AccountPage accountPage;
    protected LoginPage loginPage;
    protected HomePage homePage;
}
