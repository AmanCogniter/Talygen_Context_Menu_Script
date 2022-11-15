package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.DocumentStorageAction;
import action.LoginAction;
import utils.WebTestBase;

public class DocumentStorageTest extends WebTestBase{
	static String Screenname = "<b>Document Storage</b>"; 
	/*
	 * Check Context menu ,click testing of Document Storage Page
	 */
	@Test
	public void ValidateClickTestingOfManageClientStoragePage()
	{
		test=getTest(Screenname + ": Validation Check of Context Menu click testing of Document Storage page");
		DocumentStorageAction documentStorageAction = new DocumentStorageAction(driver);
		new LoginAction(driver).logoutLogin();
		documentStorageAction.GoToDocumentStoragePage();
		documentStorageAction.GoToManageClientStoragePage();
		
	}
}
