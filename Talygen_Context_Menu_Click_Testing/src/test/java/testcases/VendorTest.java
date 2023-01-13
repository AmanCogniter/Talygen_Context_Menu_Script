package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.LoginAction;
import action.VendorAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class VendorTest extends WebTestBase{
	static String Screenname = "<b>Vendor</b>"; 
	/*
	 * Check click testing of Context Menu for Vendor Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfTrainingPage()
	{
		
		test=getTest(Screenname + ":  Validation Check of click testing of Context Menu for Vendor  ");
		VendorAction vendorAction = new VendorAction(driver);
		new LoginAction(driver).logoutLogin();
		vendorAction.GoToVendorPage();
		vendorAction.GoToServicePage();
		
	}
}
