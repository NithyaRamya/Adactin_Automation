package com.qa.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	protected static WebDriver driver;
	

	public static WebDriver browserLaunch(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\NITHYA\\latest eclipse workspace\\Adactin_QA_04_06_24\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				//driver.get("https://adactinhotelapp.com/");
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\admin\\eclipse-workspace\\SeleniumProject1\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\admin\\eclipse-workspace\\SeleniumProject1\\Driver\\geckoDriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid browsername");
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

	public static void dropdown(WebElement element, String value, String i) {
		Select s = new Select(element);
		if (value.equals("index")) {
			s.selectByIndex(Integer.parseInt(i));
		} else if (value.equals("values")) {
			s.selectByValue(i);
		} else if (value.equals("text")) {
			s.selectByVisibleText(i);
		}
		
	}

	public static void selectDropDownValue(By locator, String type, String value) {
		Select s = new Select(getElement(locator));

		switch (type) {
		case "index":
			s.selectByIndex(Integer.parseInt(value));
			break;

		case "value":
			s.selectByValue(value);
			break;

		case "VisibleText":
			s.selectByVisibleText(value);
			break;

		default:
			System.out.println("plesae pass the correct selection criteria..");
			break;
		}

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}
	
	public static TakesScreenshot ScreenShot(String Path) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot) driver;	
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(Path);
		FileUtils.copyFile(src, dest);
		
		return ts;

	}
	
	public static JavascriptExecutor js() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		return js;
	}
}