package org.example.page_Action;

import org.example.page_Elements.HomeElements;
import org.example.step_Definitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class HomeAction {
    WebDriver driver;
    HomeElements homeElements;

    public HomeAction(CommonSteps commonSteps, HomeElements home_Elements) {
        this.driver = commonSteps.getDriver();
        this.homeElements = home_Elements;
    }



}
