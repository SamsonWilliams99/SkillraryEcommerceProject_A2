package Scripts;

import org.testng.annotations.Test; 

import POM.DemoskillraryApppage;
import POM.SkillraryHomepage;
import POM.TestingPage;
import genericLibrary.Baseclass;

public class TestCase1 extends Baseclass {
	@Test
	public void tc1()throws Throwable {
		SkillraryHomepage s = new SkillraryHomepage(driver);
		s.gearsbutton();
		s.skillrarydemoapp();
		utilities.childBrowser(driver);
		DemoskillraryApppage dS= new DemoskillraryApppage(driver);
		utilities.dropDowns(dS.getselectDd(), pdata.getPropertyData("coursed"));
		TestingPage tp= new TestingPage(driver);
		utilities.scrollBar(driver,tp.getFbIcon());
		tp.fbIconWebElement();
	}

}
