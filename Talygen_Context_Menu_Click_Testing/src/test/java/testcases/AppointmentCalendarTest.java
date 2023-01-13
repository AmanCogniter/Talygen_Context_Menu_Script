package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.AppointmentCalendarAction;
import action.LoginAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class AppointmentCalendarTest extends WebTestBase{
	static String Screenname = "<b>Appoitment calender</b>"; 
	/*
	 * Check click testing of Manage External Link Page
	 */
	@Test
	public void ValidateClickTestingOfManageExternalLinkPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of External Link for Appointment");
		AppointmentCalendarAction appoitmentCalenderAction = new AppointmentCalendarAction(driver);
		new LoginAction(driver).logoutLogin();
		appoitmentCalenderAction.GoToAppoitmentCalendarPage();
		appoitmentCalenderAction.GoToManageexternalLinkPage();
		
	}
}
