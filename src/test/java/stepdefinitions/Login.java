package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	public WebDriver driver;
	@Given("enter the URL")
	public void enter_the_url() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("user is on login page");
		System.out.println("user is on login page");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebElement titleElement = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share')]"));
		Assert.assertEquals(titleElement.getText(), "Facebook helps you connect and share with the people in your life.");
		System.out.println("user enters login page");
	}

	@When("enter the valid username and password")
	public void enter_the_valid_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("Radha");
		driver.findElement(By.id("pass")).sendKeys("krishna");
		driver.findElement(By.name("login")).click();
		System.out.println("user enters the username and pwd");
	}

	@Then("user is able to land homescreen")
	public void user_is_able_to_land_homescreen() {
		System.out.println("user is on homepage");
		driver.close();
	}

}
