package action;

import org.openqa.selenium.WebDriver;

import pageobjects.FSMPage;

public class FSMAction {
	WebDriver driver ; 
	FSMPage fsmPage;
	
	public FSMAction(WebDriver driver)
	{
		this.driver= driver;
		fsmPage= new FSMPage(driver);
	}
	
	public void GoToFSMPage()
	{
		fsmPage.clickFullMenuDropDown();	
		fsmPage.clickOnFSMLink();	
		
		
	}
	/*Method  for Click testing of FSM */
	public void GoToAddTicketPage()
	{
		
		fsmPage.clickOnAddTicket();	
		fsmPage.clickOnFieldServiceTicket();
		fsmPage.clickOnRuleEngine();
		fsmPage.clickOnManageServiceBoard();
		fsmPage.clickOnZoneManagement();
		fsmPage.clickOnSLA();
		
	}
}
