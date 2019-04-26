package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Case2addheadphones {
	
	@FindBy(how = How.ID,using = "myInput")
	public static WebElement searchbox;
	@FindBy(how = How.CSS,using = "input[value='FIND DETAILS']")
	public static WebElement finddetails;
	
}
