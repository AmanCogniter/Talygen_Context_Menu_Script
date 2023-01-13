package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.BillingAction;
import action.LoginAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class BillingTest extends WebTestBase{
	static String Screenname = "<b>Automate Flag Processing</b>"; 
	/*
	 * Check click testing of Automate Flag Processing Page
	 */
	@Test
	public void ValidateClickTestingOfAutomateFlagProcessingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Automate Flag Processing");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToAutomateFlagProcessingPage();
	}
}
