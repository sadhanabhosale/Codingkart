package org.example.page_Action;

import org.example.page_Elements.PlaceOrderElements;
import org.example.step_Definitions.CommonSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class PlaceOrderAction {
    WebDriver driver;
    PlaceOrderElements placeOrderElements;

    public PlaceOrderAction(CommonSteps commonSteps, PlaceOrderElements placeOrderElements) {
        this.driver = commonSteps.getDriver();
        this.placeOrderElements = placeOrderElements;
    }

    public void clickOnBeanie(){
        placeOrderElements.beanie.click();
    }

    public void clickOnAddToCart(){
        placeOrderElements.addToCartButton.click();
    }

    public void clickOnViewCart(){
        placeOrderElements.viewCart.click();
    }

    public void clickOnCheckoutButton(){
        placeOrderElements.proceedToCheckout.click();
   }

   public void enterFirstName(String firstName){
        placeOrderElements.firstName.sendKeys(firstName);
   }
   public  void enterLastName(String lastName){
        placeOrderElements.lastName.sendKeys(lastName);
   }

   public void enterCompanyName(String companyName){
        placeOrderElements.companyName.sendKeys(companyName);
   }

//   public void selectCountry(){
//    Select countryDropDown=new Select(PlaceOrderElements.country);
//        countryDropDown.selectById("select2-billing_country-result-3suv-IN");
//   }

   public void enterStreetAddress(String streetAddress){
        placeOrderElements.streetAddress.sendKeys(streetAddress);
   }

   public void enterCity(String city){
        placeOrderElements.city.sendKeys(city);
   }

//   public void selectState(){
//        Select stateDropDown=new Select(PlaceOrderElements.state);
//        stateDropDown.selectById("select2-billing_state-result-ttel-MH");
//    }

   public void enterPinCode(String pinCode){
        placeOrderElements.pinCode.sendKeys(pinCode);
   }

   public void enterPhoneNumber(String phoneNumber){
        placeOrderElements.phoneNumber.sendKeys(phoneNumber);
   }

   public void enterEmail(String email){
        placeOrderElements.email.sendKeys(email);
   }

}
