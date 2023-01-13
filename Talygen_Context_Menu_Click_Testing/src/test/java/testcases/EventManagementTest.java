package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.EventManagementAction;
import action.LoginAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class EventManagementTest extends WebTestBase{
	static String Screenname = "<b>Event Management</b>"; 
	/*
	 * Check click testing of Context Menu for Calendar Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfCalendarPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Context Menu for Calendar ");
		EventManagementAction eventManagementAction = new EventManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		eventManagementAction.GoToEventManagementPage();
		eventManagementAction.GoToCalendarPage();
		
	}
}
