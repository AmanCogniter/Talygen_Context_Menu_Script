package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class CommunicationPage extends WebBasePage{
	WebDriver driver ;
	public CommunicationPage(WebDriver driver) {
		super(driver, "CommunicationPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context menu click testing of Communication module
	 */
     public void clickOnCommunicationLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Communication']/span"),"Communication", 30);
    	 
     }
     public void clickOnIVR()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='IVR']"),"IVR", 30);
    	
    	 try {
    		 WebElement ivr = driver.findElement(By.xpath("//div/span[text()='Add IVR']"));
    		 if (ivr.isDisplayed()) {
				logger.info("IVR Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("IVR Page not opened succesfully");
		}
     }
     public void clickOnIVRContextMenu()
     {		staticWait(2000);
    	 click(By.xpath("(//ul/li/a[@data-original-title='IVR'])[last()]"),"IVR Context Menu", 30);
    	
    	 try {
    		 WebElement ivr = driver.findElement(By.xpath("//div/span[text()='Add IVR']"));
    		 if (ivr.isDisplayed()) {
				logger.info("Context menu IVR Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Context menu IVR Page not opened succesfully");
		}
     }
     public void clickOnContacts()
     {		staticWait(2000);
    	 click(By.xpath("(//ul/li/a[@data-original-title='Contacts'])[last()]"),"Contacts", 30);
    	
    	 try {
    		 staticWait(2000);
    		 WebElement contacts = driver.findElement(By.xpath("//div/h2[text()='Chat']"));
    		 if (contacts.isDisplayed()) {
				logger.info("Chat Page opened succesfully");
				driver.navigate().back();
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Chat Page not opened succesfully");
		}
     }
     public void clickOnMeetingRecordingList()
     {		staticWait(2000);
    	 click(By.xpath("(//ul/li/a[@data-original-title='Meeting Recording List'])[last()]"),"Meeting Recording List", 30);
    	
    	 try {
    		 WebElement meetingRecordingList = driver.findElement(By.xpath("//div/span[contains(text(),'Video Recording List')]"));
    		 if (meetingRecordingList.isDisplayed()) {
				logger.info("Meeting Recording List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Meeting Recording List Page not opened succesfully");
		}
     }
     public void clickOnMeeting()
     {		staticWait(2000);
    	 click(By.xpath("(//ul/li/a[@data-original-title='Meetings'])[last()]"),"Meeting Recording List", 30);
    	
    	 try {
    		 WebElement meetingRecordingList = driver.findElement(By.xpath("//div/span[contains(text(),'Calendar')]"));
    		 if (meetingRecordingList.isDisplayed()) {
				logger.info("Calendar Page opened succesfully");
				driver.navigate().back();
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Calendar Page not opened succesfully");
		}
     }
     public void clickOnVideoRecordingList()
     {		staticWait(2000);
    	 click(By.xpath("(//ul/li/a[@data-original-title='Video Recording List'])[last()]"),"Video Recording List", 30);
    	
    	 try {
    		 WebElement meetingRecordingList = driver.findElement(By.xpath("//div/span[contains(text(),'Video Recording List')]"));
    		 if (meetingRecordingList.isDisplayed()) {
				logger.info("Video Recording List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Video Recording List Page not opened succesfully");
		}
     }
}
