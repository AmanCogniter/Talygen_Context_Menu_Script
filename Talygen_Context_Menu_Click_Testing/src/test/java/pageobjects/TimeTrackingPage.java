package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class TimeTrackingPage extends WebBasePage{
	WebDriver driver ;
	public TimeTrackingPage(WebDriver driver) {
		super(driver, "TimeTrackingPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of Time Tracking
	 */
     public void clickOnTimeTracking()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Time Tracking']/span"),"Time Tracking", 30);
    	 
     }
     public void clickOnAuditRule()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Audit Rule']"),"Audit Rule", 30);
    	
    	 try {
    		 WebElement auditRulePage = driver.findElement(By.xpath("//div/span[contains(text(),'Audit Rule')]"));
    		 if (auditRulePage.isDisplayed()) {
				logger.info("Audit Rule Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Audit Rule Page not opened succesfully");
		}
     }
     public void clickOnTimeTrack()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Time Track'])[last()]"),"Time Track", 30);
    	
    	 try {
    		 WebElement timeTrack = driver.findElement(By.xpath("//div/span[contains(text(),'Track Time')]"));
    		 if (timeTrack.isDisplayed()) {
				logger.info("Track Time Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Track Time Page not opened succesfully");
		}
     }
     public void clickOnBulkTimeEntry()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Bulk Time Entry'])[last()]"),"Bulk Time Entry", 30);
    	
    	 try {
    		 WebElement bulkTimeEntry = driver.findElement(By.xpath("//div/span[contains(text(),'Bulk Time Entry')]"));
    		 if (bulkTimeEntry.isDisplayed()) {
				logger.info("Bulk Time Entry Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Bulk Time Entry Page not opened succesfully");
		}
     }
     public void clickOnTimesheet()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Timesheet'])[last()]"),"Timesheet", 30);
    	
    	 try {
    		 WebElement generalTimesheet = driver.findElement(By.xpath("//div/span[contains(text(),'General Timesheet')]"));
    		 if (generalTimesheet.isDisplayed()) {
				logger.info("General Timesheet Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("General Timesheet Page not opened succesfully");
		}
     }
     public void clickOnTimeApproval()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Time Approval'])[last()]"),"Time Approval", 30);
    	
    	 try {
    		 WebElement timesheetApprovals = driver.findElement(By.xpath("//div/span[contains(text(),'Timesheet Approvals')]"));
    		 if (timesheetApprovals.isDisplayed()) {
				logger.info("Timesheet Approvals Page opened succesfully");
				driver.navigate().back();
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Timesheet Approvals Page not opened succesfully");
		}
     }
     public void clickOnWorkDiary()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Work Diary'])[last()]"),"Work Diary", 30);
    	
    	 try {
    		 WebElement workDiary = driver.findElement(By.xpath("//div/span[contains(text(),'Work Diary')]"));
    		 if (workDiary.isDisplayed()) {
				logger.info("Work Diary Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Work Diary Page not opened succesfully");
		}
     }
     public void clickOnFlagTrackEntry()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Flag Track Entry'])[last()]"),"Flag Track Entry", 30);
    	
    	 try {
    		 WebElement flagTrackEntry = driver.findElement(By.xpath("//div/span[contains(text(),'Flag Track Entry')]"));
    		 if (flagTrackEntry.isDisplayed()) {
				logger.info("Flag Track Entry Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Flag Track Entry Page not opened succesfully");
		}
     }
     public void clickOnProjectReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Project Report'])[last()]"),"Project Report", 30);
    	
    	 try {
    		 WebElement projectReports = driver.findElement(By.xpath("//div/span[contains(text(),'Project Reports')]"));
    		 if (projectReports.isDisplayed()) {
				logger.info("Project Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Project Report Page not opened succesfully");
		}
     }
     public void clickOnTimeReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Time Report'])[last()]"),"Time Report", 30);
    	
    	 try {
    		 WebElement projectReports = driver.findElement(By.xpath("//div/span[contains(text(),'Project Reports')]"));
    		 if (projectReports.isDisplayed()) {
				logger.info("Project Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Project Report Page not opened succesfully");
		}
     }
     public void clickOnClients()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Clients'])[last()]"),"Clients", 30);
    	
    	 try {
    		 WebElement clients = driver.findElement(By.xpath("//div/span[contains(text(),'Accounts/Clients')]"));
    		 if (clients.isDisplayed()) {
				logger.info("Accounts/Clients Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Accounts/Clients Page not opened succesfully");
		}
     }
     public void clickOnUser()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='User'])[last()]"),"User", 30);
    	
    	 try {
    		 WebElement manageUsers = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Users')]"));
    		 if (manageUsers.isDisplayed()) {
				logger.info("Manage Users Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Users Page not opened succesfully");
		}
     }
}
