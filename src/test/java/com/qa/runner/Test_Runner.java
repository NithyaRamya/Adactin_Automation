package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\qa\\feature", 
                 glue = "com\\qa\\stepdefinition",
		      tags= ("@valid-invalidcred"),
		         plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:08_06_24_2scenarios/10_06_24_scenarios_htmlreport.html" })

public class Test_Runner {

}
