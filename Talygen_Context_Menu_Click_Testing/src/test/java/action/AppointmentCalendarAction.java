package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AppointmentCalendarPage;

public class AppointmentCalendarAction {
	WebDriver driver ; 
	AppointmentCalendarPage appointmentCalendarPage;
	
	public AppointmentCalendarAction(WebDriver driver)
	{
		this.driver= driver;
		appointmentCalendarPage= new AppointmentCalendarPage(driver);
	}
	
	public void GoToAppoitmentCalendarPage()
	{
		appointmentCalendarPage.clickFullMenuDropDown();	
		appointmentCalendarPage.clickAppoitmentCalendarLink();	
		
		
	}
	/*Meatod  for External Link for appoitment*/
	public void GoToManageexternalLinkPage()
	{
		
		appointmentCalendarPage.clickOnExternalLinkforAppointment();	
		appointmentCalendarPage.clickOnScheduleAppointment();
		appointmentCalendarPage.clickOnCourse();
		appointmentCalendarPage.clickOnConsumerList();
		appointmentCalendarPage.clickOnExternallinkforAppointment();
		appointmentCalendarPage.clickOnAppointmentReport();
		
	}
}
