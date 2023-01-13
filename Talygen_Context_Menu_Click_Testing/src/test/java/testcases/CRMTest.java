package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.CRMAction;
import action.LoginAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class CRMTest extends WebTestBase{
	static String Screenname = "<b>Accounts</b>"; 
	/*
	 * Check Context Menu, click testing of Accounts Page
	 */
	@Test
	public void ValidateClickTestingOfAccountsPage()
	{
		test=getTest(Screenname + ": Validation Check of Context Menu, click testing of Accounts page");
		CRMAction crmAction = new CRMAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToAccountsPage();
		
	}
}
