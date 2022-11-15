package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.LoginAction;
import action.PerformanceReviewAction;
import utils.WebTestBase;

public class PerformanceReviewTest extends WebTestBase{
	static String Screenname = "<b>Performance Review</b>"; 
	/*
	 *Check click testing of Context Menu for Performance Review Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfPerformanceReviewPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Context Menu for Performance Review ");
		PerformanceReviewAction performanceReviewAction = new PerformanceReviewAction(driver);
		new LoginAction(driver).logoutLogin();
		performanceReviewAction.GoToPerformanceReviewPage();
		performanceReviewAction.GoToPerformanceReviewSubModulePage();
		
	}
}
