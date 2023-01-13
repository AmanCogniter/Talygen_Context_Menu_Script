package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.LoginAction;
import action.VDeskAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class VDeskTest extends WebTestBase{
	static String Screenname = "<b>VDesk</b>"; 
	/*
	 * Check click testing of Context Menu for VDesk Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfApplicationSettingsPage()
	{
		test=getTest(Screenname + ":Validation Check of click testing of Context Menu for VDesk");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToApplicationSettingsPage();
		
	}
}
