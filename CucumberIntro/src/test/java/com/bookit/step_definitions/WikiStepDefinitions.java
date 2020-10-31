package com.bookit.step_definitions;

import com.bookit.pages.WikipidiaSearchPage;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDefinitions {

    WikipidiaSearchPage wikipidiaSearchPage = new WikipidiaSearchPage();

    @Given("User is on Wikipedia page")
    public void user_is_on_wikipedia_page() {

        Driver.getDriver().get("https://www.wikipedia.com");

    }


    @When("User searches {string} in the wiki search page")
    public void user_searches_in_the_wiki_search_page(String searchValue) {

        wikipidiaSearchPage.searchBox.sendKeys(searchValue + Keys.ENTER);


    }
    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));



    }

    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String expectedMainHeader ) {

        String actualHeaderText = wikipidiaSearchPage.mainHeaderAfterSearch.getText();

        Assert.assertEquals(actualHeaderText,expectedMainHeader);
    }

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String expectedImageHeader) {

        String actualImage = wikipidiaSearchPage.imageHeader.getText();

        Assert.assertEquals(actualImage,expectedImageHeader);
    }
}
