package org.example.page_Elements;

import org.example.step_Definitions.CommonSteps;
import org.example.step_Definitions.CommonSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderElements {
     WebDriver driver;

     public PlaceOrderElements(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        PageFactory.initElements(driver,this);
  }

       @FindBy(linkText = "Beanie")
           public WebElement beanie;

       @FindBy(xpath = "//button[@name='add-to-cart']")
        public WebElement addToCartButton;

       @FindBy(partialLinkText = "view")
       public WebElement viewCart;

       @FindBy(partialLinkText = "Proceed")
        public WebElement proceedToCheckout;

       @FindBy(id = "billing_first_name")
        public WebElement firstName;

       @FindBy(id = "billing_last_name")
       public WebElement lastName;

       @FindBy(id = "billing_company")
       public WebElement companyName;

       @FindBy(id = "select2-billing_country-container")
       public WebElement country;

       @FindBy(id = "billing_address_1")
       public WebElement streetAddress;

       @FindBy(id = "billing_city")
       public WebElement city;

       @FindBy(id = "select2-billing_state-container")
       public WebElement state;

       @FindBy(id = "billing_postcode")
       public WebElement pinCode;

       @FindBy(id = "billing_phone")
       public WebElement phoneNumber;

       @FindBy(id = "billing_email")
       public WebElement email;

}

