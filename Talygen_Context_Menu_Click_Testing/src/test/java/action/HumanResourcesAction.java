package action;

import org.openqa.selenium.WebDriver;

import pageobjects.HRManagementPage;
import pageobjects.HiringPage;
import pageobjects.HumanResourcesPage;

public class HumanResourcesAction {
	WebDriver driver ; 
	HumanResourcesPage humanResourcesPage;
	HRManagementPage hRManagementPage;
	HiringPage hiringPage;
	
	public HumanResourcesAction(WebDriver driver)
	{
		this.driver= driver;
		hRManagementPage= new HRManagementPage(driver);
		humanResourcesPage= new HumanResourcesPage(driver);
		hiringPage= new HiringPage(driver);
	}
	
	public void GoToHumanResourcesPage()
	{
		humanResourcesPage.clickFullMenuDropDown();	
		humanResourcesPage.clickOnHumanResources();	
		
		
	}
	/*Method  for Context Menu Click Testing of Human Resources*/
	public void GoToAttendancePage()
	{
		
		humanResourcesPage.clickOnAttendanceforHumanResources();
		humanResourcesPage.clickOnHRReport();
		humanResourcesPage.clickOnAttendanceApproval();
		humanResourcesPage.clickOnTrackAttendance();
		humanResourcesPage.clickOnCheckInFlagList();
		humanResourcesPage.clickOnLeaveApproval();
		
	}
}
