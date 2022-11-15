package action;

import org.openqa.selenium.WebDriver;

import pageobjects.MSPModulePage;

public class MSPModuleAction {
	WebDriver driver ; 
	MSPModulePage mSPModulePage;
	
	public MSPModuleAction(WebDriver driver)
	{
		this.driver= driver;
		mSPModulePage= new MSPModulePage(driver);
	}
	
	public void GoToMSPModulePage()
	{
		mSPModulePage.clickFullMenuDropDown();	
		mSPModulePage.clickOnMSPModule();	
		
		
	}
	/*Method  for AddPackages of MSPModule*/
	public void GoToAddPackagesPage()
	{
		
		mSPModulePage.clickOnAddPackagesforMSPModule();
		mSPModulePage.clickOnAddPackagesOfContextMenu();
		mSPModulePage.clickOnAddSubscription();
		mSPModulePage.clickOnManagePackages();
		mSPModulePage.clickOnManageSubscription();
		mSPModulePage.clickOnMyProducts();
		
		
	}
}
