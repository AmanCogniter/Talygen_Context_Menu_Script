package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.IntegrationAction;
import action.LoginAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class INTEGRATIONSTest extends WebTestBase{
	static String Screenname = "<b>INTEGRATIONS</b>"; 
	/*
	 * Check Context menu click testing of INTEGRATIONS Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfINTEGRATIONSPage()
	{
		test=getTest(Screenname + ": Validation Check of Context menu click testing for INTEGRATIONS ");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.GoToTwilioPage();
		
	}
}
