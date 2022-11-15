package action;

import org.openqa.selenium.WebDriver;

import pageobjects.ApprovalPage;

public class ApprovalAction {
	WebDriver driver ; 
	ApprovalPage approvalPage;
	
	public ApprovalAction(WebDriver driver)
	{
		this.driver= driver;
		approvalPage= new ApprovalPage(driver);
	}
	
	public void GoToApprovalPage()
	{
		approvalPage.clickFullMenuDropDown();	
		approvalPage.clickOnApprovalLink();	
		
		
	}
	/*Meatod  for Approval Chain for Approval*/
	public void GoToApprovalChain()
	{
		
		approvalPage.clickOnApprovalChain();	
		approvalPage.clickOnApprovalGroup();
		approvalPage.clickOnApprovalchain();
		approvalPage.clickOnApprovalRule();
		approvalPage.clickOnApprovalApprovalReport();	
		approvalPage.clickOnApprovalCompanySetup();
		
	}
}
