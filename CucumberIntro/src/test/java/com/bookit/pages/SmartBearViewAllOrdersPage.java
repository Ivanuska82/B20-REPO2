package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearViewAllOrdersPage {

    public SmartBearViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrdersLink;

    @FindBy(xpath ="//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[2]" )
    public WebElement newCell;




}
