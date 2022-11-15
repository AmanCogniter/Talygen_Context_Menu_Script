package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.AssetManagementAction;
import action.LoginAction;
import utils.WebTestBase;

public class AssetManagementTest extends WebTestBase{
	static String Screenname = "<b>Group List</b>"; 
	/*
	 * Check click testing of Group List Page
	 */
	@Test
	public void ValidateClickTestingOfGroupListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Group List");
		AssetManagementAction assetManagementAction = new AssetManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAction.GoToAssetManagementPage();
		assetManagementAction.GoToGroupListPage();
	}
}
