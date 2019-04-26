package Skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.DriverUtility;

import Page.Case1LoginPage;
import Page.Case2addheadphones;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case2stepdefs {
	

	WebDriver driver;
	@Before
	public void init()
	{

		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, Case1LoginPage.class);
		PageFactory.initElements(driver, Case2addheadphones.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	
	@When("user adds product to cart and make payment")
	public void user_adds_product_to_cart_and_make_payment() {
		Case1LoginPage.username.sendKeys("Lalitha");
		Case1LoginPage.password.sendKeys("Password123");
		Case1LoginPage.login.click();
		Case2addheadphones.searchbox.sendKeys("Carpet");
		Case2addheadphones.finddetails.click();
	}

	@Then("product purchased successfully")
	public void product_purchased_successfully() {
	   
	}

}
