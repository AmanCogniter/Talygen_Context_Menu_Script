package action;

import org.openqa.selenium.WebDriver;

import pageobjects.TicketingPage;

public class TicketingAction {
	WebDriver driver ; 
	TicketingPage ticketingPage;
	
	public TicketingAction(WebDriver driver)
	{
		this.driver= driver;
		ticketingPage= new TicketingPage(driver);
	}
	
	public void GoToTicketingPage()
	{
		ticketingPage.clickFullMenuDropDown();	
		ticketingPage.clickOnTicketingLink();	
		
		
	}
	/*Method  for Context menu Click testing of Ticketing */
	public void GoToTicketingSubModulePage()
	{
		
		ticketingPage.clickOnTicketing();	
		ticketingPage.clickOnTicketingDashboard();
		ticketingPage.clickOnInbox();
		ticketingPage.clickOnAddTicket();
		ticketingPage.clickOnTicketingOfContextMenu();
		ticketingPage.clickOnAddArticle();
		ticketingPage.clickOnMyArticle();
		ticketingPage.clickOnSLA();
		ticketingPage.clickOnCannedReply();
		ticketingPage.clickOnTicketReport();
		ticketingPage.clickOnKnowledgeBase();
		
	}
}
