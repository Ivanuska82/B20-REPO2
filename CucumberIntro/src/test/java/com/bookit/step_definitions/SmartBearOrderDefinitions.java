package com.bookit.step_definitions;

import com.bookit.pages.SmartBearLandingPage;
import com.bookit.pages.SmartBearLoginPage;
import com.bookit.pages.SmartBearOrderPage;
import com.bookit.pages.SmartBearViewAllOrdersPage;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SmartBearOrderDefinitions {

    SmartBearLandingPage smartBearLandingPage = new SmartBearLandingPage();
    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();
    SmartBearViewAllOrdersPage smartBearViewAllOrdersPage= new SmartBearViewAllOrdersPage();


    @Given("User is logged in into smartbear Tester account and on Order page")
    public void user_is_logged_in_into_smartbear_tester_account_and_on_order_page() throws InterruptedException {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBearLoginPage.userInput.sendKeys("Tester");
        smartBearLoginPage.passwordInput.sendKeys("test");
        smartBearLoginPage.loginButton.click();
        Thread.sleep(3000);

        smartBearLandingPage.orderLink.click();
    }


    @Given("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String productDropdownValue) {
        Select productDropdown = new Select(smartBearOrderPage.productDropdown);
        productDropdown.selectByVisibleText(productDropdownValue);


    }

    @Given("User enters {string} to quantity input box")
    public void user_enters_to_quantity_input_box(String givenQuantity) {
        smartBearOrderPage.quantity.sendKeys(Keys.BACK_SPACE+ givenQuantity );
    }

    @Given("User enters {string} to customer name input box")
    public void user_enters_to_customer_name_input_box(String customerName) {
        smartBearOrderPage.customerName.sendKeys(customerName);

    }

    @Given("User enters {string} to street input box")
    public void user_enters_to_street_input_box(String givenStreet) {
       smartBearOrderPage.street.sendKeys(givenStreet);
    }

    @Given("User enters {string} to city input box")
    public void user_enters_to_city_input_box(String giveCity) {
       smartBearOrderPage.city.sendKeys(giveCity);
    }

    @Given("User enters {string} to state input box")
    public void user_enters_to_state_input_box(String givenState) {
        smartBearOrderPage.state.sendKeys(givenState);
    }

    @And("User enters{string} to zip input box")
    public void userEntersToZipInputBox(String givenZip) {
        smartBearOrderPage.zip.sendKeys(givenZip);
    }

    @Given("User selects {string} to card input box")
    public void user_selects_to_card_input_box(String givenType) {
        if(givenType.equalsIgnoreCase("Visa")){
            smartBearOrderPage.visaCardType.click();
        }else if(givenType.equalsIgnoreCase("MasterCard")){
            smartBearOrderPage.masteCardType.click();
        }else if(givenType.equalsIgnoreCase("American Express")){
            smartBearOrderPage.americanExpressCardType.click();
        }else{
            Assert.assertTrue("Invalid Card",false);
        }

    }

    @Given("User enters {string} to card number input box")
    public void user_enters_to_card_number_input_box(String givenCardNumber) {
        smartBearOrderPage.cardNumber.sendKeys(givenCardNumber);

    }

    @Given("User enters {string} to experetion date input box")
    public void user_enters_to_experetion_date_input_box(String givenExperationNumber) {
       smartBearOrderPage.expireDate.sendKeys(givenExperationNumber);
    }

    @Given("User clicks process button")
    public void user_clicks_process_button() {
      smartBearOrderPage.processButton.click();
    }

    @Then("User verifies {string} is in the table")
    public void user_verifies_is_in_the_table(String givendName) throws InterruptedException {
        smartBearViewAllOrdersPage.viewAllOrdersLink.click();
        Thread.sleep(5000);

        String actualName = smartBearViewAllOrdersPage.newCell.getText();

        Assert.assertTrue("Names are not matching", actualName.equals(givendName));

    }



}
