package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.HRManagementAction;
import action.LoginAction;
import utils.WebTestBase;

public class HRManagementTest extends WebTestBase{
	static String Screenname = "<b>Hr Management</b>"; 
	/*
	 * Check click testing of Context Menu for HR Managemnet Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAttendancePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Context Menu for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToAttendancePage();
		
	}
}
