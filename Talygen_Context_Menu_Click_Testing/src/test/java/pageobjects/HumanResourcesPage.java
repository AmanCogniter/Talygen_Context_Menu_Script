package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class HumanResourcesPage extends WebBasePage{
	WebDriver driver ;
	public HumanResourcesPage(WebDriver driver) {
		super(driver, "HumanResourcesPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of Human Resources
	 */
     public void clickOnHumanResources()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Human Resources']/span"),"Human Resources", 30);
    	 
     }
     public void clickOnAttendanceforHumanResources()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Attendance']"),"Attendance", 30);
    	
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
     public void clickOnHRReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='HR Report'])[last()]"),"HR Report", 30);
    	
    	 try {
    		 WebElement hRReport = driver.findElement(By.xpath("//div/span[text()='HR Reports']"));
    		 if (hRReport.isDisplayed()) {
				logger.info("HR Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("HR Report Page not opened succesfully");
		}
     }
     public void clickOnAttendanceApproval()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Attendance Approval'])[last()]"),"Attendance Approval", 30);
    	
    	 try {
    		 WebElement attendanceApproval = driver.findElement(By.xpath("//div/span[contains(text(),'Attendance Approval')]"));
    		 if (attendanceApproval.isDisplayed()) {
				logger.info("Attendance Approval Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Attendance Approval Page not opened succesfully");
		}
     }
     public void clickOnTrackAttendance()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Attendance'])[last()]"),"Attendance", 30);
    	
    	 try {
    		 WebElement trackAttendance = driver.findElement(By.xpath("//div/span[contains(text(),'Attendance Approval')]"));
    		 if (trackAttendance.isDisplayed()) {
				logger.info("Attendance Approval Page opened succesfully");
				driver.navigate().back();
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Attendance Approval Page not opened succesfully");
			driver.navigate().back();
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
}
