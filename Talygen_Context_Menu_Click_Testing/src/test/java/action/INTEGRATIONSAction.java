package action;

import org.openqa.selenium.WebDriver;

import pageobjects.FSMPage;
import pageobjects.INTEGRATIONSPage;
import pageobjects.IntegrationPage;

public class INTEGRATIONSAction {
	WebDriver driver ; 
	INTEGRATIONSPage iNTEGRATIONSPage;
	FSMPage fsmPage;
	
	public INTEGRATIONSAction(WebDriver driver)
	{
		this.driver= driver;
		iNTEGRATIONSPage= new INTEGRATIONSPage(driver);
		fsmPage= new FSMPage(driver);
	}
	
	public void GoToIntegrationPage()
	{
		iNTEGRATIONSPage.clickFullMenuDropDown();	
		iNTEGRATIONSPage.clickOnIntegration();	
		
		
	}
	/*Method  for Context Menu Click testing of INTEGRATIONS*/
	public void GoToTwilioPage()
	{
		
		iNTEGRATIONSPage.clickOnTwilioforIntegration();	
		iNTEGRATIONSPage.clickOnCompanyDirectory();	
		iNTEGRATIONSPage.clickOnCompanySetup();	
		iNTEGRATIONSPage.clickOnUser();	
		iNTEGRATIONSPage.clickOnRoles();	
		iNTEGRATIONSPage.clickOnStorage();	
		
		
	}
}
