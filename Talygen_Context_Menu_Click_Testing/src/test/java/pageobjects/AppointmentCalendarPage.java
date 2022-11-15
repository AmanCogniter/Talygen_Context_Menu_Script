package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class AppointmentCalendarPage extends WebBasePage{
	WebDriver driver ;
	public AppointmentCalendarPage(WebDriver driver) {
		super(driver, "AppointmentCalendarPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of External Link for appoitment
	 */
     public void clickAppoitmentCalendarLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Appointment Calendar']/span"),"Appoitment Calendar", 30);
    	 
     }
     public void clickOnExternalLinkforAppointment()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='External Link for Appointment ']"),"External Link for Appointment", 30);
    	
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div/span[text()='Manage External Link']"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Manage External Link Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage External Link Page not opened succesfully");
		}
     }
     public void clickOnScheduleAppointment()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Schedule Appointment'])[2]"),"Schedule Appointment", 30);
    	
    	 try {
    		 WebElement scheduleAppointment = driver.findElement(By.xpath("//div/span[text()='Schedule Appointment']"));
    		 if (scheduleAppointment.isDisplayed()) {
				logger.info("Schedule Appointment Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Schedule Appointment Page not opened succesfully");
		}
     }
     public void clickOnCourse()
     {		staticWait(3000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Course'])[2]"),"Course", 30);
    	
    	 try {
    		 WebElement course = driver.findElement(By.xpath("//div/span[text()='Course']"));
    		 if (course.isDisplayed()) {
				logger.info("Course Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Course Page not opened succesfully");
		}
     }
     public void clickOnConsumerList()
     {		staticWait(3000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Consumer List'])[2]"),"Consumer List", 30);
    	
    	 try {
    		 WebElement consumerList = driver.findElement(By.xpath("//div/span[text()='Consumer List']"));
    		 if (consumerList.isDisplayed()) {
				logger.info("Consumer List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Consumer List Page not opened succesfully");
		}
     }
     public void clickOnExternallinkforAppointment()
     {		staticWait(3000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='External Link for Appointment '])[2]"),"External Link for Appointment ", 30);
    	
    	 try {
    		 WebElement externalLinkforAppointment = driver.findElement(By.xpath("//div/span[text()='Manage External Link']"));
    		 if (externalLinkforAppointment.isDisplayed()) {
				logger.info("External Link for Appointment  Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("External Link for Appointment  Page not opened succesfully");
		}
     }
     public void clickOnSaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnSave']"),"Save Button", 30);
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div/span[contains(text(),'External Link has been successfully updated')]"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Save button clicked succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Save button not clicked");
		}
    	 
     }
     public void clickOnPreviewButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@data-original-title='Preview']"),"Preview Button", 30);
    	 try {
    		 WebElement preview = driver.findElement(By.xpath("//div/h5[text()='Preview']"));
    		 if (preview.isDisplayed()) {
				logger.info("Preview Page displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Preview Page not displayed");
		}
    	 click(By.xpath("(//div/button[@data-original-title='Close'])[1]"),"Close Button", 30);
    	 
     }
     public void clickOnAppointmentReport()
     {		staticWait(3000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Appointment Report'])[2]"),"Appointment Report ", 30);
    	
    	 try {
    		 WebElement appointmentReport = driver.findElement(By.xpath("//div/span[text()='Appointment Service Report ']"));
    		 if (appointmentReport.isDisplayed()) {
				logger.info("Appointment Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Appointment Report Page not opened succesfully");
		}
     }
     
}
