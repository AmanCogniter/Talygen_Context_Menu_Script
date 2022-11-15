package action;

import org.openqa.selenium.WebDriver;

import pageobjects.COMPANYSETUPPage;

public class COMPANYSETUPAction {
	WebDriver driver ; 
	COMPANYSETUPPage cOMPANYSETUPPage;
	
	public COMPANYSETUPAction(WebDriver driver)
	{
		this.driver= driver;
		cOMPANYSETUPPage= new COMPANYSETUPPage(driver);
	}
	
	public void GoToCompantSetupPage()
	{
		cOMPANYSETUPPage.clickFullMenuDropDown();	
		cOMPANYSETUPPage.clickOnCOMPANYSETUPLink();	
		
		
	}
	/*Meatod  for Client */
	public void GoToClientPage()
	{
		
		cOMPANYSETUPPage.clickOnClientforCompanySetup();	
		cOMPANYSETUPPage.clickOnCompanyDirectory();
		cOMPANYSETUPPage.clickOnCompanySetup();
		cOMPANYSETUPPage.clickOnUser();
		cOMPANYSETUPPage.clickOnRoles();
		cOMPANYSETUPPage.clickOnStorage();
		
		
	}
}
