# Adactin_Automation
Automation of Application Hotel Adactin to ensure the application is bug free using MAVEN project.

CUCUMBER (FEATURE FILE) & STEPDEFINITION CLASS:
TestCases are written in the Gherkin format using cucumber framework and imolemented in StepDefinition Class.

RUNNER CLASS:
Runner Class contains @RunWith and @CucumberOptions with feature file path and stepdefinition path , when executed StepDefinition class methods get executed.

PAGE OBJECT MODEL(PAGE FACTORY):
Page Factory is a Selenium inbuilt class that supports the Page Object Design pattern. 
It is used to initialize Page objects or to instantiate the Page object itself. 
The Page Object Model (POM) ensures that tests are written in a readable and maintainable form1.
Page Factory optimizes test instances created using POM. 
It provides a @FindBy annotation to find web elements without using “FindElement/s”. 
The initElements method can be further used to initialize web elements in Page Class.

EXTENT PROPERTES FILE:
Customisation of reports is provided in Extent.properties file
screenshots relative path is also mentioned in this file

HOOKS CLASS:
AfteStep method is implemented in this class with TakesScreenshot Interface and method addScreenshot(Scenario scenario),where scenario.attach (attach is a method of Scenario Class) is used.
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

POM.xml:
POM.xml file contains all the dependencies
https://mvnrepository.com/

BASE CLASS:
Base class contains all pre defined methods of Selenium which can be called in required classes using INHERITANCE OOPS concept.



