package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.LoginAction;
import action.ProjectManagementAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class ProjectManagementTest extends WebTestBase{
	static String Screenname = "<b>Project Management</b>"; 
	/*
	 *  Check click testing of Context Menu for Project Management 
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfGlobalTaskPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Context Menu for Project Management");
		ProjectManagementAction projectManagementAction = new ProjectManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		projectManagementAction.GoToProjectManagementPage();
		projectManagementAction.GoToGlobalTaskPage();
		
	}
}
