package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipidiaSearchPage {

    public WikipidiaSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "search")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(className = "firstHeading")
    public WebElement mainHeaderAfterSearch;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement imageHeader;







}
