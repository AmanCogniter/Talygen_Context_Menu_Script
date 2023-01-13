package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.CommunicationAction;
import action.LoginAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class CommunicationTest extends WebTestBase{
	static String Screenname = "<b>Communication</b>"; 
	/*
	 * Check click testing of IVRPage
	 */
	@Test
	public void ValidateClickTestingOfIVRPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of IVR");
		CommunicationAction communicationAction = new CommunicationAction(driver);
		new LoginAction(driver).logoutLogin();
		communicationAction.GoToCommunicationPage();
		communicationAction.GoToIVRPage();
	}
}
