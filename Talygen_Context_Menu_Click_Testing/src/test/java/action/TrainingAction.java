package action;

import org.openqa.selenium.WebDriver;

import pageobjects.TrainingPage;

public class TrainingAction {
	WebDriver driver ; 
	TrainingPage trainingPage;
	
	public TrainingAction(WebDriver driver)
	{
		this.driver= driver;
		trainingPage= new TrainingPage(driver);
	}
	
	public void GoToTrainingPage()
	{
		trainingPage.clickFullMenuDropDown();	
		trainingPage.clickOnTraining();	
		
		
	}
	/*Method  for Context menu Click testing of Training */
	public void GoToTrainingSubModulePage()
	{
		
		trainingPage.clickOnTrainingSubModule();	
		trainingPage.clickOnAddTraining();
		trainingPage.clickOnTrainingOfContextmenu();
		trainingPage.clickOnUser();
		
		trainingPage.clickOnCompanyDirectory();
		trainingPage.clickOnTrainingReport();
	
	}

}
