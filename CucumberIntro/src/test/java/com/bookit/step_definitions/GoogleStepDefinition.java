package com.bookit.step_definitions;

import com.bookit.pages.GoogleSearchPage;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleStepDefinition {


    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("http://www.google.com");



    }

    @When("User searches apple")
    public void user_searches_apple() {
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);

    }

    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);


    }


    @When("User searches {string}")
    public void userSearches(String searchValue) {
        googleSearchPage.searchBox.sendKeys(searchValue+Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedINTitle) {
        String expectedTitle = expectedINTitle+ " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Then("User should see About link")
    public void userShouldSeeAboutLink() {
        Assert.assertTrue(googleSearchPage.aboutLink.isDisplayed());
    }

    @And("User clicks to About link")
    public void userClicksToAboutLink() {
        googleSearchPage.aboutLink.click();
    }

    @Then("User should see title Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {

        String expectedTitle = "Google - About Google, Our Culture & Company News";
        String actuatlTite = Driver.getDriver().getTitle();

        Assert.assertEquals( actuatlTite,expectedTitle);
    }


    @Then("User should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List<String> linksString) {
     //   System.out.println("linksString.size() = " + linksString.size());

        int expectedSize = linksString.size();
        int actualSize = googleSearchPage.footerLinks.size();

        System.out.println("linksString = " + linksString);

        Assert.assertEquals(actualSize,expectedSize);


    }

}
