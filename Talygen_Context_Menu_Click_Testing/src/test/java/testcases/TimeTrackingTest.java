package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.LoginAction;
import action.TimeTrackingAction;
import utils.WebTestBase;

public class TimeTrackingTest extends WebTestBase{
	static String Screenname = "<b>Time Tracking</b>"; 
	/*
	 * Check click testing of Context Menu for Time Tracking Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAuditRulePage()
	{
		test=getTest(Screenname + ":Validation Check of click testing of Context Menu for Time Tracking");
		TimeTrackingAction timeTrackingAction = new TimeTrackingAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackingAction.GoToTimeTrackingPage();
		timeTrackingAction.GoToAuditRulePage();
		
	}
}
