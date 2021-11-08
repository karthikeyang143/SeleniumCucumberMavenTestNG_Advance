package com.example.runner;

import io.cucumber.testng.*;

@CucumberOptions(
        features = "src/test/resources/features",
        glue= {"com.example.stepdefinitions"},
        plugin = {"pretty",
                "html:target/cucumber-reports/Result.html",
                "json:target/cucumber-reports/Result.json"},
        tags= "@smokeTest",
        dryRun =false,
        monochrome =true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}