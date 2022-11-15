package action;

import org.openqa.selenium.WebDriver;

import pageobjects.EventManagementPage;

public class EventManagementAction {
	WebDriver driver ; 
	EventManagementPage eventManagementPage;
	
	public EventManagementAction(WebDriver driver)
	{
		this.driver= driver;
		eventManagementPage= new EventManagementPage(driver);
	}
	
	public void GoToEventManagementPage()
	{
		eventManagementPage.clickFullMenuDropDown();	
		eventManagementPage.clickOnEventMangement();	
		
		
	}
	/*Method  for Context menu Click testing of Calendar */
	public void GoToCalendarPage()
	{
		
		eventManagementPage.clickOnCalenderforEventMangement();
		eventManagementPage.clickOnAddUserAvailability();
		eventManagementPage.clickOnUserAvailability();
		eventManagementPage.clickOnCalendar();
		eventManagementPage.clickOnGoogleCalendar();
		eventManagementPage.clickOnUser();
		eventManagementPage.clickOnLocation();
		eventManagementPage.clickOnUserNotifications();
		eventManagementPage.clickOnCompanyNotifications();
		eventManagementPage.clickOnStorage();
		eventManagementPage.clickOnRoles();
		
		
	}
}
