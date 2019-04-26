package Skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.DriverUtility;

import Page.Case1AddCategoryPage;
import Page.Case1LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Case1LoginStepDefs {
	
	
	WebDriver driver;
	@Before
	public void init()
	{

		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, Case1LoginPage.class);
		PageFactory.initElements(driver, Case1AddCategoryPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	
	@Given("user enter url of app")
	public void user_enter_url_of_app() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enter data for Addcart")
	public void user_enter_data_for_Addcart() {
		Case1LoginPage.username.sendKeys("admin");
		Case1LoginPage.password.sendKeys("Password456");
		Case1LoginPage.login.click();
		Case1AddCategoryPage.addproduct.click();
		Case1AddCategoryPage.catname.click();
		Case1AddCategoryPage.select();
		Case1AddCategoryPage.subcatname.click();
		Case1AddCategoryPage.select1();
		Case1AddCategoryPage.productname.sendKeys("Laptop Deva");
		Case1AddCategoryPage.price.sendKeys("38,000");
		Case1AddCategoryPage.quantity.sendKeys("1");
		Case1AddCategoryPage.brand.sendKeys("HP");
		Case1AddCategoryPage.desc.sendKeys("HP Laptop with 8GB RAM");
		//Case1AddCategoryPage.browse.sendKeys("C:\\Users\\training_b6b.00.03\\Pictures");
		Case1AddCategoryPage.addproductbutton.click();
		String addcat =Case1AddCategoryPage.addsuccess.getText();
		Assert.assertTrue(addcat.contains("added Succesfully"));
		System.out.println("Laptop added Succesfully");
	}

	@Then("product add successfully")
	public void product_add_successfully() {
	    
	}
}
