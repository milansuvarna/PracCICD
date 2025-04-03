package com.hitachigroupid.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/hitachigroupid/features",
        glue = {"com.hitachigroupid.steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}
        
)
public class TestRunner extends AbstractTestNGCucumberTests{
    
}
