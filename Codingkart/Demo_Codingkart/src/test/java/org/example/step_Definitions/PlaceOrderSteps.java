package org.example.step_Definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.example.page_Action.PlaceOrderAction;

public class PlaceOrderSteps{
    WebDriver driver;

    PlaceOrderAction placeOrder_action;

    public PlaceOrderSteps(CommonSteps commonSteps, PlaceOrderAction placeOrder_action ) {
        this.driver = commonSteps.getDriver();
        this.placeOrder_action = placeOrder_action;

    }
    @When("Select product and click on add to Cart button")
    public void select_product_and_click_on_add_to_cart_button() {
        placeOrder_action.clickOnBeanie();
        placeOrder_action.clickOnAddToCart();

    }

    @Then("I click on view cart link")
    public void i_click_on_view_cart_link() {
        placeOrder_action.clickOnViewCart();

    }

    @Then("I click on proceed to checkout button")
    public void i_click_on_proceed_to_checkout_button() {
        placeOrder_action.clickOnCheckoutButton();

    }

    @When("I enter valid credentials in billing address form")
    public void i_enter_valid_credentials_in_billing_address_form(DataTable dataTable) {
    placeOrder_action.enterFirstName(dataTable.cell(1,1));
    placeOrder_action.enterLastName(dataTable.cell(2,1));
    placeOrder_action.enterCompanyName(dataTable.cell(3,1));
    //placeOrder_action.selectCountry();
    placeOrder_action.enterStreetAddress(dataTable.cell(5,1));
    placeOrder_action.enterCity(dataTable.cell(6,1));
    //placeOrder_action.selectState();
    placeOrder_action.enterPinCode(dataTable.cell(8,1));
    placeOrder_action.enterPhoneNumber(dataTable.cell(9,1));
    placeOrder_action.enterEmail(dataTable.cell(10,1));

    }

    @When("Select payment method")
    public void select_payment_method() {

    }

    @When("Click on place order button")
    public void click_on_place_order_button() {

    }

    @Then("I should get the {string} and click on continue button")
    public void i_should_get_the_and_click_on_continue_button(String string) {

    }

    @Then("home page should be displayed")
    public void home_page_should_be_displayed() {

    }

}
