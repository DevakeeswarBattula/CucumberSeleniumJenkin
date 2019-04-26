package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Case1AddCategoryPage {
	
	@FindBy(how = How.CSS,using = "button[type='button']")
	public static WebElement addproduct;
	
	@FindBy(how = How.ID,using = "categorydropid")
	public static WebElement catname;
	public static void select() 
	{
		Select s=new Select(catname);
		s.selectByIndex(1);
	}
	
	@FindBy(how = How.ID,using = "subcategorydropid")
	public static WebElement subcatname;
	public static void select1() 
	{
		Select s=new Select(subcatname);
		s.selectByIndex(9);
	}
	
	@FindBy(how = How.ID,using = "prodid")
	public static WebElement productname;
	
	@FindBy(how = How.ID,using = "priceid")
	public static WebElement price;
	
	@FindBy(how = How.ID,using = "quantityid")
	public static WebElement quantity;
	
	@FindBy(how = How.ID,using = "brandid")
	public static WebElement brand;
	
	@FindBy(how = How.ID,using = "description")
	public static WebElement desc;
	
	@FindBy(how = How.NAME,using = "input-file-preview")
	public static WebElement browse;
	
	@FindBy(how = How.CSS,using = "input[value='Add Product']")
	public static WebElement addproductbutton;
	
	
	@FindBy(how = How.XPATH,using = "/html/body/main/div/div/div/form/b/i")
	public static WebElement addsuccess;
	
	
	
	
	
	
	
	
	
	
}
