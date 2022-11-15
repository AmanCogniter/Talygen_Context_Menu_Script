package action;

import org.openqa.selenium.WebDriver;

import pageobjects.ProjectManagementPage;

public class ProjectManagementAction {
	WebDriver driver ; 
	ProjectManagementPage projectManagementPage;
	
	public ProjectManagementAction(WebDriver driver)
	{
		this.driver= driver;
		projectManagementPage= new ProjectManagementPage(driver);
	}
	
	public void GoToProjectManagementPage()
	{
		projectManagementPage.clickFullMenuDropDown();	
		projectManagementPage.clickOnProjectManagement();	
		
		
	}
	/*Method  for Context menu Click testing of Global Task */
	public void GoToGlobalTaskPage()
	{
		
		projectManagementPage.clickOnGlobalTask();	
		projectManagementPage.clickOnProject();
		projectManagementPage.clickOnToDoList();
		projectManagementPage.clickOnTask();
		projectManagementPage.clickOnGlobalTaskOfContextMenu();
		projectManagementPage.clickOnConfiguration();
		projectManagementPage.clickOnUser();
		projectManagementPage.clickOnProjectReport();
		projectManagementPage.clickOnResourceScheduling();
		projectManagementPage.clickOnProjectRequest();
		projectManagementPage.clickOnQuotes();
		
		
	}
}
