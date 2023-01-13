package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.COMPANYSETUPAction;
import action.LoginAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class COMPANYSETUPTest extends WebTestBase{
	static String Screenname = "<b>Client</b>"; 
	/*
	 * Check Context Menu click testing of Client Page
	 */
	@Test
	public void ValidateClickTestingOfClientPage()
	{
		test=getTest(Screenname + ": Validation Check for context menu  click testing of Client page");
		COMPANYSETUPAction companySetupAction = new COMPANYSETUPAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToClientPage();
		
	}
}
