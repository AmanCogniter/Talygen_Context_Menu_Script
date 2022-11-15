package action;

import org.openqa.selenium.WebDriver;

import pageobjects.HRManagementPage;
import pageobjects.HiringPage;

public class HRManagementAction {
	WebDriver driver ; 
	HRManagementPage hRManagementPage;
	HiringPage hiringPage;
	
	public HRManagementAction(WebDriver driver)
	{
		this.driver= driver;
		hRManagementPage= new HRManagementPage(driver);
		hiringPage= new HiringPage(driver);
	}
	
	public void GoToHrManagementPage()
	{
		hRManagementPage.clickFullMenuDropDown();	
		hRManagementPage.clickOnHRManagement();	
		
		
	}
	/*Method  for Context Menu click testing of HR management*/
	public void GoToAttendancePage()
	{
		
		hRManagementPage.clickOnAttendanceforHRManagement();
		hRManagementPage.clickOnApplyLeave();
		hRManagementPage.clickOnLeave();
		hRManagementPage.clickOnAttendance();
		hRManagementPage.clickOnCheckInFlagList();
		hRManagementPage.clickOnCheckInOut();
		hRManagementPage.clickOnManageCheckIn();
		hRManagementPage.clickOnLeaveApproval();
		hRManagementPage.clickOnAttendanceApproval();
		hRManagementPage.clickOnCheckInOutDispute();
		hRManagementPage.clickOnDisputeApproval();
		
		
	}
}
