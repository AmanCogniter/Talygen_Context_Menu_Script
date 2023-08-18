package action;

import org.openqa.selenium.WebDriver;

import pageobjects.DocumentStoragePage;

public class DocumentStorageAction {
	WebDriver driver ; 
	DocumentStoragePage documentStoragePage;
	
	public DocumentStorageAction(WebDriver driver)
	{
		this.driver= driver;
		documentStoragePage= new DocumentStoragePage(driver);
	}
	
	public void GoToDocumentStoragePage()
	{
		documentStoragePage.clickFullMenuDropDown();	
		documentStoragePage.clickOnDocumentStoragePage();	
		
		
	}
	/*Method  for Manage Client Storage Page */
	public void GoToManageClientStoragePage()
	{
		
		documentStoragePage.clickOnManageClientStorage();	
		documentStoragePage.clickOnFileDashboard();
		documentStoragePage.clickOnInbox();
		documentStoragePage.clickOnContextMenuManageClientStorage();
		documentStoragePage.clickOnClients();
		documentStoragePage.clickOnManageUserStorage();
		documentStoragePage.clickOnStorage();
		//documentStoragePage.clickOnUserStorageReport();
		documentStoragePage.clickOnRoles();
		documentStoragePage.clickOnUserNotifications();
		documentStoragePage.clickOnCompanyNotifications();
		
		
	}
}
