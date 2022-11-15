package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.ApprovalAction;
import action.LoginAction;
import utils.WebTestBase;

public class ApprovalTest extends WebTestBase{
	static String Screenname = "<b>Approval</b>"; 
	/*
	 * Check click testing of Approval chain Page
	 */
	@Test
	public void ValidateClickTestingOfApprovalChainPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Approval module's context menu");
		ApprovalAction approvalAction = new ApprovalAction(driver);
		new LoginAction(driver).logoutLogin();
		approvalAction.GoToApprovalPage();
		approvalAction.GoToApprovalChain();
	}
}
