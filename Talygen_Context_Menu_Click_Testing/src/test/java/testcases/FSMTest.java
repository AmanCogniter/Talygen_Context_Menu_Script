package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.FSMAction;
import action.LoginAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class FSMTest  extends WebTestBase{
	static String Screenname = "<b>FSM</b>"; 
	/*
	 *  Check click testing of Context Menu for FSM Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAddTicketPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Add Ticket for FSM");
		FSMAction fsmAction = new FSMAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToAddTicketPage();
		
	}
}
