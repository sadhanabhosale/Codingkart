package org.example.page_Elements;

//import org.example.step_Definitions.CommonSteps;
import org.example.step_Definitions.CommonSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class HomeElements {
    WebDriver driver;

    public HomeElements(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        PageFactory.initElements(driver,this);
    }
//        @FindBy(xpath = "//img[@alt='Accessories']")
//         public WebElement accessories;
//
}
