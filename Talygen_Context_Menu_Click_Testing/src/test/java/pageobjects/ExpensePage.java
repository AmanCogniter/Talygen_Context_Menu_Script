package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class ExpensePage extends WebBasePage{
	WebDriver driver ;
	public ExpensePage(WebDriver driver) {
		super(driver, "ExpensePage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of Expense
	 */
     public void clickOnExpense()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Expense ']/span"),"Expense", 30);
    	 
     }
     public void clickOnAddExpense()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Add Expense']"),"Add Expense", 30);
    	
    	 try {
    		 WebElement addExpense = driver.findElement(By.xpath("//div/span[text()='Manage Expenses']"));
    		 if (addExpense.isDisplayed()) {
				logger.info("Manage Expense Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Expense Page not opened succesfully");
		}
     }
     public void clickOnContextMenuAddExpense()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Expense'])[last()]"),"Context Menu's Add Expense", 30);
    	
    	 try {
    		 WebElement addExpense = driver.findElement(By.xpath("//div/span[text()='Manage Expenses']"));
    		 if (addExpense.isDisplayed()) {
				logger.info("Manage Expense Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Expense Page not opened succesfully");
		}
     }
     public void clickOnBulkUploadExpense()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Bulk Upload Expense'])[last()]"),"Bulk Upload Expense", 30);
    	
    	 try {
    		 WebElement bulkUploadExpense = driver.findElement(By.xpath("//div/span[text()='Bulk Upload']"));
    		 if (bulkUploadExpense.isDisplayed()) {
				logger.info("Bulk Upload Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Bulk Upload Page not opened succesfully");
		}
     }
     public void clickOnExpenseTrip()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Expense Trip'])[last()]"),"Expense Trip", 30);
    	
    	 try {
    		 WebElement expenseTrip = driver.findElement(By.xpath("//div/span[text()='Trip']"));
    		 if (expenseTrip.isDisplayed()) {
				logger.info("Expense Trip Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Expense Trip Page not opened succesfully");
		}
     }
     public void clickOnExpenseApproval()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Expense Approval'])[last()]"),"Expense Approval", 30);
    	
    	 try {
    		 WebElement expenseApproval = driver.findElement(By.xpath("//div/span[contains(text(),'Expense Approval')]"));
    		 if (expenseApproval.isDisplayed()) {
				logger.info("Expense Approval Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Expense Approval Page not opened succesfully");
		}
     }
     public void clickOnExpenseReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Expense Report'])[last()]"),"Expense Report", 30);
    	
    	 try {
    		 WebElement expenseReport = driver.findElement(By.xpath("//div/span[contains(text(),'Expense Report')]"));
    		 if (expenseReport.isDisplayed()) {
				logger.info("Expense Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Expense Report Page not opened succesfully");
		}
     }
}
