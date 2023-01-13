package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.LoginAction;
import action.MSPModuleAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class MSPModuleTest extends WebTestBase{
	static String Screenname = "<b>MSP Module</b>"; 
	/*
	 * Check click testing of Context Menu for MSP Module 
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAddPackagesPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Context Menu for MSP Module");
		MSPModuleAction mSPModuleAction = new MSPModuleAction(driver);
		new LoginAction(driver).logoutLogin();
		mSPModuleAction.GoToMSPModulePage();
		mSPModuleAction.GoToAddPackagesPage();
		
	}
}
