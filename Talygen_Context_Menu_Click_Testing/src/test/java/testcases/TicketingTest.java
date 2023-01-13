package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.LoginAction;
import action.TicketingAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class TicketingTest extends WebTestBase{
	static String Screenname = "<b>Ticketing</b>"; 
	/*
	 * Check click testing of Context Menu for Ticketing Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfTicketingPage()
	{
		test=getTest(Screenname + ":Validation Check of click testing of Context Menu for Ticketing");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToTicketingSubModulePage();
		
	}
}
