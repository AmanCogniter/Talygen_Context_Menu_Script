package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.ExpenseAction;
import action.LoginAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class ExpenseTest extends WebTestBase{
	static String Screenname = "<b>Expense</b>"; 
	/*
	 *  Check click testing of Context Menu for Expense Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAddExpensePage()
	{
		test=getTest(Screenname + ": Validation Check of Context Menu click testing for Expense");
		ExpenseAction expenseAction = new ExpenseAction(driver);
		new LoginAction(driver).logoutLogin();
		expenseAction.GoToExpensePage();
		expenseAction.GoToAddExpensePage();
		
	}
}
