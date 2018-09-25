package org.cucum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenOutline {
	static WebDriver driver;
	@Given("^The user is in guru home page$")
	public void the_user_is_in_guru_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ebenezer\\workspace\\NewCucumber\\CucumberNew\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/v4/");
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	   
	}

	@Given("^The use logged in  as manager with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_use_logged_in_as_manager_with_and(String mangrid, String manngrP) {
		driver.findElement(By.name("uid")).sendKeys(mangrid);
		driver.findElement(By.name("password")).sendKeys(manngrP);
		driver.findElement(By.name("btnLogin")).click();
	    
	}

	@Given("^The user navigate to new customer page$")
	public void the_user_navigate_to_new_customer_page() {
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		
	    	}

	
	@When("^The user clicks the submit button$")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.name("name")).sendKeys("CustNmae");
		driver.findElement(By.xpath("//input[@value='f']")).sendKeys("Gender");
		driver.findElement(By.name("dob")).sendKeys("DOB");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Address");
		driver.findElement(By.name("city")).sendKeys("city");
	
	driver.findElement(By.name("state")).sendKeys("state");
	driver.findElement(By.name("pinno")).sendKeys("PIN");
	driver.findElement(By.name("telephoneno")).sendKeys("Phnum");
	driver.findElement(By.name("emailid")).sendKeys("email");
	driver.findElement(By.name("password")).sendKeys("pass");
	
	driver.findElement(By.name("sub")).click();
	}
	@Then("^The user is registered successfully$")
	public void the_user_is_registered_successfully() {
		System.out.println("User Registered");
	  
	}

	
	

}
