package action;

import org.openqa.selenium.WebDriver;

import pageobjects.PerformanceReviewPage;

public class PerformanceReviewAction {
	WebDriver driver ; 
	PerformanceReviewPage performanceReviewPage;
	
	public PerformanceReviewAction(WebDriver driver)
	{
		this.driver= driver;
		performanceReviewPage= new PerformanceReviewPage(driver);
	}
	
	public void GoToPerformanceReviewPage()
	{
		performanceReviewPage.clickFullMenuDropDown();	
		performanceReviewPage.clickOnPerformanceReview();	
		
		
	}
	/*Method  for Context menu Click testing of Performance Review*/
	public void GoToPerformanceReviewSubModulePage()
	{
		
		performanceReviewPage.clickOnPerformanceReviewSubModule();
		performanceReviewPage.clickOnProvideReview();
		performanceReviewPage.clickOnReview();
		performanceReviewPage.clickOnProvideFeedback();
		performanceReviewPage.clickOnGoal();
		performanceReviewPage.clickOnCompanyDirectory();
		performanceReviewPage.clickOnCompanyNotifications();
		performanceReviewPage.clickOnPerformanceReviewOfContextMenu();
		performanceReviewPage.clickOnCompanySetup();
		performanceReviewPage.clickOnPerformanceReviewReport();
		performanceReviewPage.clickOnStorage();
		
		
	}
}
