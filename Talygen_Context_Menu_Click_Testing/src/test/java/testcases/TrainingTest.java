package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.LoginAction;
import action.TrainingAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class TrainingTest extends WebTestBase{
	static String Screenname = "<b>Training</b>"; 
	/*
	 * Check click testing of Context Menu for Training Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfTrainingPage()
	{
		test=getTest(Screenname + ":Validation Check of click testing of Context Menu for Training");
		TrainingAction trainingAction = new TrainingAction(driver);
		new LoginAction(driver).logoutLogin();
		trainingAction.GoToTrainingPage();
		trainingAction.GoToTrainingSubModulePage();
		
	}
}
