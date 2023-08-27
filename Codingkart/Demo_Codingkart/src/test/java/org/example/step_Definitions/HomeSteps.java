package org.example.step_Definitions;

import io.cucumber.java.en.Given;
import org.example.page_Action.HomeAction;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    WebDriver driver;
    HomeAction homeAction;

    public HomeSteps(CommonSteps commonSteps, HomeAction home_action) {
        this.driver = commonSteps.getDriver();
        this.homeAction = home_action;
    }

    @Given("I open application url")
    public void i_open_application_url() {
            driver.get("https://demo.codingkloud.com/");
    }

}
