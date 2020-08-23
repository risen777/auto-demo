package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Sergey
 */
public class HooksSteps {

    @Before
public void openUrl(){
        open("https://www.grinfer.com/");



    }
}
