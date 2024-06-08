package com.qa.stepdefinition;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.qa.base.BaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks_Class extends BaseClass {

	/*
	 * @AfterStep public void addScreenshot(Scenario scenario) {
	 * 
	 * final byte[] screenshot = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.BYTES); scenario.attach(screenshot,
	 * "image/png", "image");
	 * 
	 * }
	 */

	@AfterStep
	public void addScreenshots(Scenario scenario) {

		// validate if scenario has failed
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");
		}

	}

}
