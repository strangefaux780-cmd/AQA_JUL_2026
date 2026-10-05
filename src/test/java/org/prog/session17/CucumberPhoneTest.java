package org.prog.session17;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.prog.session17"
)
public class CucumberPhoneTest extends AbstractTestNGCucumberTests {
}

