package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.GeneralAction;
import action.LoginAction;
import utils.WebTestBase;

public class GeneralTest extends WebTestBase
{
	static String Screenname = "<b>General</b>"; 
	/*
	 *  Check click testing of Context Menu for General
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAddReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Contexr Menu for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToAddReportPage();
		
	}
}
