package action;

import org.openqa.selenium.WebDriver;

import pageobjects.CommunicationPage;

public class CommunicationAction {
	WebDriver driver ; 
	CommunicationPage communicationPage;
	
	public CommunicationAction(WebDriver driver)
	{
		this.driver= driver;
		communicationPage= new CommunicationPage(driver);
	}
	
	public void GoToCommunicationPage()
	{
		communicationPage.clickFullMenuDropDown();	
		communicationPage.clickOnCommunicationLink();	
		}
	/*Meatod  for IVR Page*/
	public void GoToIVRPage()
	{
		
		communicationPage.clickOnIVR();	
		communicationPage.clickOnIVRContextMenu();
		communicationPage.clickOnContacts();
		communicationPage.clickOnMeetingRecordingList();
		communicationPage.clickOnMeeting();	
		communicationPage.clickOnVideoRecordingList();		
	}
}
