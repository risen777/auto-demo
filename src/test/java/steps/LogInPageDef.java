package steps;

import io.cucumber.java.en.Then;
import pages.LogInPage;

import static config.UserConfig.USER_LOGIN;
import static config.UserConfig.USER_PASSWORD;

/**
 * Created by Sergey
 */
public class LogInPageDef {

    LogInPage logInPage = new LogInPage();

    @Then("Input login")
    public void inputLogin() {
        logInPage.inputLogin(USER_LOGIN);
        
    }

    @Then("Input password")
    public void inputPassword() {
        logInPage.inputPassword(USER_PASSWORD);
    }


}
