package action;

import org.openqa.selenium.WebDriver;

import pageobjects.DisplayScreenPage;

public class DisplayScreenAction {
	WebDriver driver ; 
	DisplayScreenPage displayScreenPage;
	
	public DisplayScreenAction(WebDriver driver)
	{
		this.driver= driver;
		displayScreenPage= new DisplayScreenPage(driver);
	}
	
	public void GoToDisplayScreenPage()
	{
		displayScreenPage.clickFullMenuDropDown();	
		displayScreenPage.clickOnDisplayScreen();	
		
		
	}
	/*Meatod  for context Menu, click Testing of DisplayScreen  */
	public void GoToCounterPage()
	{
		
		displayScreenPage.clickOnCounter();	
		displayScreenPage.clickOnDigitalScreens();
		displayScreenPage.clickOnContextMenuCounter();
		displayScreenPage.clickOnToken();
		displayScreenPage.clickOnCompanySetup();
		displayScreenPage.clickOnConfiguration();
	
	}
}
