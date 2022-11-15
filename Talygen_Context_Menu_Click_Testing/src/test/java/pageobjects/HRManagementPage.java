package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class HRManagementPage extends WebBasePage{
	WebDriver driver ;
	public HRManagementPage(WebDriver driver) {
		super(driver, "HRManagementPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of HR Management
	 */
     public void clickOnHRManagement()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='HR Management']/span"),"HR Management", 30);
    	 
     }
     public void clickOnAttendanceforHRManagement()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Attendance'])[2]"),"Attendance", 30);
    	
    	 try {
    		 WebElement attendance = driver.findElement(By.xpath("//div/span[text()='Attendance']"));
    		 if (attendance.isDisplayed()) {
				logger.info("Attendance Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Attendance Page not opened succesfully");
		}
     }
     public void clickOnApplyLeave()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Apply Leave']"),"Apply Leave", 30);
    	
    	 try {
    		 WebElement applyLeave = driver.findElement(By.xpath("//div/span[text()='Apply Leave']"));
    		 if (applyLeave.isDisplayed()) {
				logger.info("Apply Leave Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Apply Leave Page not opened succesfully");
		}
     }
     public void clickOnLeave()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Leave'])[last()]"),"Leave", 30);
    	
    	 try {
    		 WebElement leave = driver.findElement(By.xpath("//div/span[contains(text(),'Leave')]"));
    		 if (leave.isDisplayed()) {
				logger.info("Leave Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Leave Page not opened succesfully");
		}
     }
     public void clickOnAttendance()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Attendance'])[last()]"),"Attendance", 30);
    	
    	 try {
    		 WebElement attendance = driver.findElement(By.xpath("//div/span[contains(text(),'Attendance')]"));
    		 if (attendance.isDisplayed()) {
				logger.info("Attendance Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Attendance Page not opened succesfully");
		}
     }
     public void clickOnCheckInFlagList()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Check-In Flag List'])[last()]"),"Check-In Flag List", 30);
    	
    	 try {
    		 WebElement checkInFlagList = driver.findElement(By.xpath("//div/span[contains(text(),'Flag List')]"));
    		 if (checkInFlagList.isDisplayed()) {
				logger.info("Flag List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Flag List Page not opened succesfully");
		}
     }
     public void clickOnCheckInOut()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Check-In/Out'])[last()]"),"Check-In/Out", 30);
    	
    	 try {
    		 WebElement checkInOut = driver.findElement(By.xpath("//div/span[contains(text(),'Check-In/Out')]"));
    		 if (checkInOut.isDisplayed()) {
				logger.info("Check-In/Out Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Check-In/Out Page not opened succesfully");
		}
     }
     public void clickOnManageCheckIn()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Check-In'])[last()]"),"Manage Check-In", 30);
    	
    	 try {
    		 WebElement manageCheckIn = driver.findElement(By.xpath("//div/span[contains(text(),'List Check-In/Out')]"));
    		 if (manageCheckIn.isDisplayed()) {
				logger.info("Manage Check-In Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Check-In Page not opened succesfully");
		}
     }
     public void clickOnLeaveApproval()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Leave Approval'])[last()]"),"Leave Approval", 30);
    	
    	 try {
    		 WebElement leaveApproval = driver.findElement(By.xpath("//div/span[contains(text(),'Leave Approval')]"));
    		 if (leaveApproval.isDisplayed()) {
				logger.info("Leave Approval Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Leave Approval Page not opened succesfully");
		}
     }
     public void clickOnAttendanceApproval()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Attendance Approval'])[last()]"),"Attendance Approval", 30);
    	
    	 try {
    		 WebElement attendanceApproval = driver.findElement(By.xpath("//div/span[contains(text(),'Leave Approval')]"));
    		 if (attendanceApproval.isDisplayed()) {
				logger.info("Attendance Approval Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Attendance Approval Page not opened succesfully");
		}
     }
     public void clickOnCheckInOutDispute()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Check-In/Out Dispute'])[last()]"),"Check-In/Out Dispute", 30);
    	
    	 try {
    		 WebElement checkInOutDispute = driver.findElement(By.xpath("//div/span[contains(text(),'Dispute List')]"));
    		 if (checkInOutDispute.isDisplayed()) {
				logger.info("Dispute List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Dispute List Page not opened succesfully");
		}
     }
     public void clickOnDisputeApproval()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Dispute Approval'])[last()]"),"Dispute Approval", 30);
    	
    	 try {
    		 WebElement disputeApproval = driver.findElement(By.xpath("//div/span[contains(text(),'Dispute Approval')]"));
    		 if (disputeApproval.isDisplayed()) {
				logger.info("Dispute Approval Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Dispute Approval Page not opened succesfully");
		}
     }
}
