package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invoicepage {
	
	//Declaration
	//Address of invoice WebElement
	
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement InvoiceBtn;
	
	//Initilization
	public Invoicepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void InvoiceButton() {
		InvoiceBtn.click();
		
	}
	

}
