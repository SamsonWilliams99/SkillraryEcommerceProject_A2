package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.WebDriverUtilities;

public class SkillraryHomepage {
	
	//Declaration
	//Address of Gears
	@FindBy(xpath="//a[text()=' GEARS ']  ")
	private WebElement gearsbtn;
	
	//address od skillrary demo
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//adress of search Textfield
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTF;
	
	//address of searchIcon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon;

	//address of cookie cross icon
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement cookies;
	
	//Initialization
	public SkillraryHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void gearsbutton() {
		gearsbtn.click();
	}
	
	public void skillrarydemoapp() {
		skillrarydemoapp.click();
	}
	
	public void searchTextfield() {
		searchTF.click();
	}
	
	public void searchicon() {
		searchicon.click();
	}
	
	public void cookiesicon() {
		cookies.click();
	}
	
	
	
}
