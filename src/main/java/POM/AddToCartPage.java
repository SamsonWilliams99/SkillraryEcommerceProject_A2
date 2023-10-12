package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	//Declartion
	//Address of Plus Icon
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement plusIcon;
	
	//Address of Add to cart
	@FindBy(xpath="//button[text()=  ' Add to Cart']")
	private WebElement addtocart;
	
	//Initialization
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this); 
	}
	
	//Utilization
	public WebElement getPlusIcon() {
		return plusIcon;
	}
	public void addToCart() {
		addtocart.click();
	}

}
