package Scripts;

import org.testng.annotations.Test; 

import POM.DemoskillraryApppage;
import POM.Invoicepage;
import POM.SkillraryHomepage;
import genericLibrary.Baseclass;

public class TestCase2 extends Baseclass {
	@Test
	public void tc2() {
		SkillraryHomepage s= new SkillraryHomepage(driver);
		s.gearsbutton();
		s.skillrarydemoapp();
		utilities.childBrowser(driver);
		DemoskillraryApppage dS = new DemoskillraryApppage(driver);
		dS.feedbackbutton();
		Invoicepage iP= new Invoicepage(driver);
		iP.InvoiceButton();
	}

}
