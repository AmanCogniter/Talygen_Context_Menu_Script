package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.HumanResourcesAction;
import action.LoginAction;
import utils.WebTestBase;

public class HumanResourcesTest extends WebTestBase{
	static String Screenname = "<b>Human Resources</b>"; 
	/*
	 * Check Context Menu click testing of Human Resource  Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAttendancePage()
	{
		test=getTest(Screenname + ": Validation Check of Context Menu click testing of Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToAttendancePage();
		
	}
}
