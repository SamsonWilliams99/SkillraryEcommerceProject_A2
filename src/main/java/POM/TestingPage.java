package POM;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	//declaration
	//address of facebook webelement
	@FindBy(xpath="((//i[@class='fa fa-facebook'])[2]")
	private WebElement fbIcon;
	//Initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void fbIconWebElement() {
		fbIcon.click();
		
	}

	public WebElement getFbIcon() {
		return fbIcon;
	}

	

}
