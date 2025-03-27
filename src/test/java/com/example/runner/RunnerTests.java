package com.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/LoginPage.feature",
        glue = "com.example.definitions",
        plugin = {
                "pretty",
                "com.aventstack.chaintest.plugins.ChainTestCucumberListener:"
        }
)
public class RunnerTests extends AbstractTestNGCucumberTests {
}
