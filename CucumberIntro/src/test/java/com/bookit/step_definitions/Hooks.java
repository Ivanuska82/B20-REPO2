package com.bookit.step_definitions;

import com.bookit.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @io.cucumber.java.Before
    public void setUpScenario(){
        System.out.println("Begpre annotation: Setting up browser");
    }

    @Before("@db")
    public void setUpDatabaseConnection(){
        System.out.println("Before annotation: DB connection created");
    }

    @After
    public void tearDownScenario(Scenario scenario){
    //    System.out.println("After annotation: Closing browser");
    //    System.out.println("scenario.getName() = " + scenario.getName());
    //    System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
    //    System.out.println("scenario.isFailed() = " + scenario.isFailed());

        // 1. we need to take a screen shot using Selenium
        // getScreenShotAs: to be able to use this method we have to cast our driver type to TakesScreenshot

      //  byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        // 2. we are going to attach it into our report
        // attach method accepts 3 arguments:
        // 1. Screenshot itself
        // 2. image type
        // 3. current scenario name

      //  scenario.attach(screenshot,"image/png",scenario.getName());

        if( scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }



    }

    @After(value = "@db", order = 1)
    public void tearDownDatabaseConnection(){
        System.out.println("After annotation: DB connection created");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("=========== Before step: Taking screenshots");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("=========== After step: Taking screenshots");
    }

}
