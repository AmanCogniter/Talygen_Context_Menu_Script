package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.IntegrationAction;
import action.LoginAction;
import utils.WebTestBase;

public class IntegrationTest extends WebTestBase{
	static String Screenname = "<b>Integration</b>"; 
	/*
	 * Check Context menu click testing of Integration Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfBasecampPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Basecamp for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.GoToTwilioPage();
		
	}
}
