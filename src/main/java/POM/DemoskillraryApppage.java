package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoskillraryApppage {
	
	//Declaration
	//address of course webelement
	@FindBy(id="course")
	private WebElement Coursebtn;
	
	//address of feedback web element
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackbtn;
	
	//address of select cateogry drop down
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	//INITIALZATION
	public DemoskillraryApppage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	 public WebElement getCouesebtn() {
		 return Coursebtn;
	 }
	 
	 public WebElement getselectDd() {
		 return selectDd ;
	 }
	 
	 public void feedbackbutton () {
		 feedbackbtn.click();
	 }
			
	

}
