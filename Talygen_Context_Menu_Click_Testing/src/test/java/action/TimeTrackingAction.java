package action;

import org.openqa.selenium.WebDriver;

import pageobjects.TimeTrackingPage;

public class TimeTrackingAction {
	WebDriver driver ; 
	TimeTrackingPage timeTrackingPage;
	
	public TimeTrackingAction(WebDriver driver)
	{
		this.driver= driver;
		timeTrackingPage= new TimeTrackingPage(driver);
	}
	
	public void GoToTimeTrackingPage()
	{
		timeTrackingPage.clickFullMenuDropDown();	
		timeTrackingPage.clickOnTimeTracking();	
		
		
	}
	/*Method  for Context menu Click testing of Time Tracking */
	public void GoToAuditRulePage()
	{
		
		timeTrackingPage.clickOnAuditRule();	
		timeTrackingPage.clickOnTimeTrack();
		timeTrackingPage.clickOnBulkTimeEntry();
		timeTrackingPage.clickOnTimesheet();
		timeTrackingPage.clickOnTimeApproval();
		timeTrackingPage.clickOnWorkDiary();
		timeTrackingPage.clickOnFlagTrackEntry();
		timeTrackingPage.clickOnProjectReport();
		timeTrackingPage.clickOnTimeReport();
		timeTrackingPage.clickOnClients();
		timeTrackingPage.clickOnUser();
	
	}
}
