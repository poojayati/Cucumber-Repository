package com.cucumber.mukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	
	WebDriver driver ;

	@Given("^I Open facebook on Mozilla$")
	public void i_Open_facebook_on_Mozilla() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.facebook.com");
	}

	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String username, String password) throws Throwable {
     driver.findElement(By.id("email")).sendKeys(username);
     driver.findElement(By.id("pass")).sendKeys(password);
	}

	@Then("^Login should be successfull$")
	public void login_should_be_successfull() throws Throwable {
	    driver.findElement(By.id("loginbutton")).click();	
	
}
}
