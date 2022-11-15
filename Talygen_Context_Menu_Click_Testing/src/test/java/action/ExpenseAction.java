package action;

import org.openqa.selenium.WebDriver;

import pageobjects.ExpensePage;

public class ExpenseAction {
	WebDriver driver ; 
	ExpensePage expensePage;
	
	public ExpenseAction(WebDriver driver)
	{
		this.driver= driver;
		expensePage= new ExpensePage(driver);
	}
	
	public void GoToExpensePage()
	{
		expensePage.clickFullMenuDropDown();	
		expensePage.clickOnExpense();	
		
		
	}
	/*Method  for Click testing of Expense */
	public void GoToAddExpensePage()
	{
		
		expensePage.clickOnAddExpense();	
		expensePage.clickOnContextMenuAddExpense();
		expensePage.clickOnBulkUploadExpense();
		expensePage.clickOnExpenseTrip();
		expensePage.clickOnExpenseApproval();
		expensePage.clickOnExpenseReport();
		
	}
}
