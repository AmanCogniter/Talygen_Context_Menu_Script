package action;

import org.openqa.selenium.WebDriver;

import pageobjects.FSMPage;
import pageobjects.IntegrationPage;

public class IntegrationAction {
	WebDriver driver ; 
	IntegrationPage integrationPage;
	FSMPage fsmPage;
	
	public IntegrationAction(WebDriver driver)
	{
		this.driver= driver;
		integrationPage= new IntegrationPage(driver);
		fsmPage= new FSMPage(driver);
	}
	
	public void GoToIntegrationPage()
	{
		integrationPage.clickFullMenuDropDown();	
		integrationPage.clickOnIntegration();	
		
		
	}
	/*Method  for Context Menu Click testing of Integration*/
	public void GoToTwilioPage()
	{
		
		integrationPage.clickOnTwilioforIntegration();	
		integrationPage.clickOnCompanyDirectory();	
		integrationPage.clickOnCompanySetup();	
		integrationPage.clickOnUser();	
		integrationPage.clickOnRoles();	
		integrationPage.clickOnStorage();	
		
		
	}
}
