package action;

import org.openqa.selenium.WebDriver;

import pageobjects.CRMPage;
import utils.WebBasePage;

public class CRMAction 
{
	WebDriver driver ; 
	CRMPage cRMPage;
	
	public CRMAction(WebDriver driver)
	{
		this.driver= driver;
		cRMPage= new CRMPage(driver);
	}
	
	public void GoToCRMPage()
	{
		cRMPage.clickFullMenuDropDown();	
		cRMPage.clickOnCRM();	
		
		
	}
	/*Meatod  for Accounts Page */
	public void GoToAccountsPage()
	{
		
		cRMPage.clickOnAccounts();	
		cRMPage.clickOnLead();
		cRMPage.clickOnDeal();
		//cRMPage.clickOnProductType();
		cRMPage.clickOnProduct();
		cRMPage.clickOnPurchaseOrder();
		cRMPage.clickOnSalesOrder();
		cRMPage.clickOnStage();
		//cRMPage.clickOnManageLayout();
		//cRMPage.clickOnCRMReport();
		cRMPage.clickOnCRMDashboard();
	}

}
