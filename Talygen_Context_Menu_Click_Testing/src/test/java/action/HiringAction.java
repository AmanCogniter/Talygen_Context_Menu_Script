package action;

import org.openqa.selenium.WebDriver;

import pageobjects.HiringPage;

public class HiringAction {
	WebDriver driver ; 
	HiringPage hiringPage;
	
	public HiringAction(WebDriver driver)
	{
		this.driver= driver;
		hiringPage= new HiringPage(driver);
	}
	
	public void GoToHiringPage()
	{
		hiringPage.clickFullMenuDropDown();	
		hiringPage.clickOnHiring();	
		
		
	}
	/*Method  for Click testing of Hiring */
	public void GoToCandidateListPage()
	{
		
		hiringPage.clickOnCandidateListforHiring();	
		hiringPage.clickOnManageTalentPool();
		hiringPage.clickOnManageCandidate();
		hiringPage.clickOnCandidateList();
		hiringPage.clickOnManageJob();
		hiringPage.clickOnJobPostReport();
		
	}
}
