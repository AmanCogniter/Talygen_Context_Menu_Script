package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.HiringAction;
import action.LoginAction;
import utils.WebTestBase;

public class HiringTest extends WebTestBase{
	static String Screenname = "<b>Hiring</b>"; 
	/*
	 *Check click testing of Context Menu for Hiring Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfCandidateListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Contexr Menu for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToCandidateListPage();
		
	}
}
