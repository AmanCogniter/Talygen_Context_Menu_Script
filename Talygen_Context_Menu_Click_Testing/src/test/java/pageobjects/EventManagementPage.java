package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class EventManagementPage extends WebBasePage{
	WebDriver driver ;
	public EventManagementPage(WebDriver driver) {
		super(driver, "EventManagementPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of Event Management
	 */
     public void clickOnEventMangement()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Event Management']/span"),"Event Management", 30);
    	 
     }
     public void clickOnCalenderforEventMangement()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Calendar']"),"Calendar", 30);
    	
    	 try {
    		 WebElement calendar = driver.findElement(By.xpath("//div/span[text()='Calendar']"));
    		 if (calendar.isDisplayed()) {
				logger.info("Calendar Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Calendar Page not opened succesfully");
		}
     }
     public void clickOnAddUserAvailability ()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Add User Availability ']"),"Add User Availability ", 30);
    	
    	 try {
    		 WebElement addUserAvailability  = driver.findElement(By.xpath("//div/span[text()='Add New User Status']"));
    		 if (addUserAvailability .isDisplayed()) {
				logger.info("Add User Availability  Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add User Availability  Page not opened succesfully");
		}
     }
     public void clickOnUserAvailability ()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='User Availability '])[last()]"),"User Availability ", 30);
    	
    	 try {
    		 WebElement userAvailability  = driver.findElement(By.xpath("//div/span[text()='User Availability ']"));
    		 if (userAvailability .isDisplayed()) {
				logger.info("User Availability  Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User Availability  Page not opened succesfully");
		}
     }
     public void clickOnCalendar()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Calendar'])[last()]"),"Calendar", 30);
    	
    	 try {
    		 WebElement calendar  = driver.findElement(By.xpath("//div/span[text()='Calendar']"));
    		 if (calendar .isDisplayed()) {
				logger.info("Calendar Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Calendar Page not opened succesfully");
		}
     }
     public void clickOnGoogleCalendar()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Google Calendar'])[last()]"),"Google Calendar", 30);
    	
    	 try {
    		 WebElement googleCalendar  = driver.findElement(By.xpath("//div/span[text()='Manage Calendar']"));
    		 if (googleCalendar .isDisplayed()) {
				logger.info("Manage Calendar Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Calendar Page not opened succesfully");
		}
     }
     public void clickOnUser()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='User'])[last()]"),"User", 30);
    	
    	 try {
    		 WebElement user = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Users')]"));
    		 if (user .isDisplayed()) {
				logger.info("Manage Users Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Users Page not opened succesfully");
		}
     }
     public void clickOnLocation()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Location'])[last()]"),"Location", 30);
    	
    	 try {
    		 WebElement location = driver.findElement(By.xpath("//div/span[contains(text(),'Location')]"));
    		 if (location .isDisplayed()) {
				logger.info("Location Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Location Page not opened succesfully");
		}
     }
     public void clickOnUserNotifications()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='User Notifications'])[last()]"),"User Notifications", 30);
    	
    	 try {
    		 WebElement userNotifications = driver.findElement(By.xpath("//table/thead/tr/th[text()='Manage Notifications']"));
    		 if (userNotifications .isDisplayed()) {
				logger.info("Notifications Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Notifications Page not opened succesfully");
		}
     }
     public void clickOnCompanyNotifications()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Company Notifications'])[last()]"),"Company Notifications", 30);
    	
    	 try {
    		 WebElement companyNotifications = driver.findElement(By.xpath("//div/span[text()='Notification']"));
    		 if (companyNotifications .isDisplayed()) {
				logger.info("Company Notifications Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company Notifications Page not opened succesfully");
		}
     }
     public void clickOnStorage()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Storage'])[last()]"),"Storage", 30);
    	
    	 try {
    		 WebElement storage = driver.findElement(By.xpath("//div/span[text()='Manage Storage']"));
    		 if (storage .isDisplayed()) {
				logger.info("Storage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Storage Page not opened succesfully");
		}
     }
     public void clickOnRoles()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Roles'])[last()]"),"Roles", 30);
    	
    	 try {
    		 WebElement roles = driver.findElement(By.xpath("//div/span[text()='Roles']"));
    		 if (roles .isDisplayed()) {
				logger.info("Roles Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Roles Page not opened succesfully");
		}
     }
}
