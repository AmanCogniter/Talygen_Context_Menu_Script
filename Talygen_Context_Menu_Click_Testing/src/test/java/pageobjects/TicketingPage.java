package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class TicketingPage extends WebBasePage{
	WebDriver driver ;
	public TicketingPage(WebDriver driver) {
		super(driver, "TicketingPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of Ticketing
	 */
     public void clickOnTicketingLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Ticketing']/span"),"Ticketing", 30);
    	 
     }
     public void clickOnTicketing()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Ticketing']"),"Ticketing Sub Module", 30);
    	
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div/span[text()='Ticketing']"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Ticketing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticketing Page not opened succesfully");
		}
     }
     public void clickOnTicketingDashboard()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Ticketing Dashboard']"),"Ticketing Dashboard", 30);
    	
    	 try {
    		 WebElement ticketingDashboard = driver.findElement(By.xpath("//div/span[text()='Ticketing Dashboard']"));
    		 if (ticketingDashboard.isDisplayed()) {
				logger.info("Ticketing Dashboard Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticketing Dashboard Page not opened succesfully");
		}
     }
     public void clickOnInbox()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Inbox']"),"Inbox", 30);
    	
    	 try {
    		 WebElement inbox = driver.findElement(By.xpath("//div/h5/span[text()='Reports']"));
    		 if (inbox.isDisplayed()) {
				logger.info("Reports Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Reports Page not opened succesfully");
		}
     }
     public void clickOnAddTicket()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Ticket'])[last()]"),"Add Ticket", 30);
    	
    	 try {
    		 WebElement addTicket = driver.findElement(By.xpath("//div/span[text()='Add Ticket']"));
    		 if (addTicket.isDisplayed()) {
				logger.info("Add Ticket Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Ticket Page not opened succesfully");
		}
     }
     public void clickOnTicketingOfContextMenu()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Ticket'])[last()]"),"Ticketing", 30);
    	
    	 try {
    		 WebElement ticketing = driver.findElement(By.xpath("//div/span[text()='Ticketing']"));
    		 if (ticketing.isDisplayed()) {
				logger.info("Ticketing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticketing Page not opened succesfully");
		}
     }
     public void clickOnAddArticle()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Article'])[last()]"),"Add Article", 30);
    	
    	 try {
    		 WebElement addArticle = driver.findElement(By.xpath("//div/span[text()='Add Article']"));
    		 if (addArticle.isDisplayed()) {
				logger.info("Add Article Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Article Page not opened succesfully");
		}
     }
     public void clickOnMyArticle()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='My Articles'])[last()]"),"My Article", 30);
    	
    	 try {
    		 WebElement myArticle = driver.findElement(By.xpath("//div/span[text()='Manage Articles']"));
    		 if (myArticle.isDisplayed()) {
				logger.info("Manage Articles Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Articles Page not opened succesfully");
		}
     }
     public void clickOnSLA()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='SLA'])[last()]"),"SLA", 30);
    	
    	 try {
    		 WebElement sLA = driver.findElement(By.xpath("//div/span[text()='SLA']"));
    		 if (sLA.isDisplayed()) {
				logger.info("SLA Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("SLA Page not opened succesfully");
		}
     }
     public void clickOnCannedReply()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Canned Reply'])[last()]"),"Canned Reply", 30);
    	
    	 try {
    		 WebElement cannedReply = driver.findElement(By.xpath("//div/span[text()='Canned Reply Template']"));
    		 if (cannedReply.isDisplayed()) {
				logger.info("Canned Reply Template Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Canned Reply Template Page not opened succesfully");
		}
     }
     public void clickOnTicketReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Ticket Report'])[last()]"),"Ticket Report", 30);
    	
    	 try {
    		 WebElement ticketReport = driver.findElement(By.xpath("//div/span[text()='Ticket Detail Report']"));
    		 if (ticketReport.isDisplayed()) {
				logger.info("Ticket Detail Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticket Detail Report Page not opened succesfully");
		}
     }
     public void clickOnKnowledgeBase()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Knowledge Base'])[last()]"),"Knowledge Base", 30);
    	
    	 try {
    		 WebElement knowledgeBase = driver.findElement(By.xpath("//div/span[text()='Knowledge Base']"));
    		 if (knowledgeBase.isDisplayed()) {
				logger.info("Knowledge Base Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Knowledge Base Page not opened succesfully");
		}
     }
}
