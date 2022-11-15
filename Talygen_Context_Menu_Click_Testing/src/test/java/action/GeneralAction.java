package action;

import org.openqa.selenium.WebDriver;

import pageobjects.GeneralPage;

public class GeneralAction {
	WebDriver driver ; 
	GeneralPage generalPage;
	
	public GeneralAction(WebDriver driver)
	{
		this.driver= driver;
		generalPage= new GeneralPage(driver);
	}
	
	public void GoToGeneralPage()
	{
		generalPage.clickFullMenuDropDown();	
		generalPage.clickOnGeneral();	
		
		
	}
	/*Method  for Click testing of General */
	public void GoToAddReportPage()
	{
		
		generalPage.clickOnAddReport();	
		generalPage.clickOnAutoResponder();
		generalPage.clickOnAddAutoResponder();
		generalPage.clickOnRoles();
		generalPage.clickOnRuleEngine();
		generalPage.clickOnOrganizationChart();
		generalPage.clickOnManageTags();
		generalPage.clickOnProvisionalRights();
		generalPage.clickOnAddProvisionalRights();
		generalPage.clickOnWorkingDay();
		generalPage.clickOnWorkingWeek();
		
	}
}
