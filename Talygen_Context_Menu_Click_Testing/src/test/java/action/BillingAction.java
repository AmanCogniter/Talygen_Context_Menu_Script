package action;

import org.openqa.selenium.WebDriver;

import pageobjects.BillingPage;

public class BillingAction {
	WebDriver driver ; 
	BillingPage billingPage;
	
	public BillingAction(WebDriver driver)
	{
		this.driver= driver;
		billingPage= new BillingPage(driver);
	}
	
	public void GoToBillingPage()
	{
		billingPage.clickFullMenuDropDown();	
		billingPage.clickOnBillingLink();	
		}
	/*Meatod  for Automate Flag Processing for Billing*/
	public void GoToAutomateFlagProcessingPage()
	{
		
		billingPage.clickOnAutomateFlagProcessing();	
		billingPage.clickOnAddNewInvoice();
		billingPage.clickOnInvoice();
		billingPage.clickOnClients();
		billingPage.clickOnClientReport();	
		billingPage.clickOnMyProfile();
		
	}
}
