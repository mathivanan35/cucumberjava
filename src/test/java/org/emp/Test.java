package org.emp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	static WebDriver driver;
	@Given("Enter url")
	public void enter_url() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

	}

	@When("Enter username and password")
	public void enter_username_and_password() {	
		System.out.println("2");
	}

	@Then("click login")
	public void click_login() {
		System.out.println("3");
	}

}
