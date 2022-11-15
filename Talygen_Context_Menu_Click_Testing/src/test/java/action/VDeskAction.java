package action;

import org.openqa.selenium.WebDriver;

import pageobjects.VDeskPage;

public class VDeskAction {
	WebDriver driver ; 
	VDeskPage vDeskPage;
	
	public VDeskAction(WebDriver driver)
	{
		this.driver= driver;
		vDeskPage= new VDeskPage(driver);
	}
	
	public void GoToVDeskPage()
	{
		vDeskPage.clickFullMenuDropDown();	
		vDeskPage.clickOnVDeskPage();	
		
		
	}
	/*Method  for Context menu Click testing of VDesk */
	public void GoToApplicationSettingsPage()
	{
		
		vDeskPage.clickOnApplicationSettings();	
		vDeskPage.clickOnApplicationSettingsOfContextMenu();
		vDeskPage.clickOnClientLogIn();
		vDeskPage.clickOnDesktopClients();
		vDeskPage.clickOnvDeskDashboard();
		vDeskPage.clickOnJobsReport();
	}
}
