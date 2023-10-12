package genericLibrary;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	public Propertyfile pdata = new Propertyfile();
	public WebDriverUtilities utilities = new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get(pdata.getPropertyData("url"));
	}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws Throwable {
		int status = res.getStatus();
		String name= res.getName();
		if(status ==2) {
			photo p = new photo();
			
			p.getphoto(driver, name);
		}

}
}