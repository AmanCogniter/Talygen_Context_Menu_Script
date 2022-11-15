package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class FSMPage extends WebBasePage{
	WebDriver driver ;
	public FSMPage(WebDriver driver) {
		super(driver, "FSMPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of FSM
	 */
     public void clickOnFSMLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='FSM']/span"),"FSM", 30);
    	 
     }
     public void clickOnAddTicket()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Ticket'])[2]"),"Add Ticket", 30);
    	
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
     public void clickOnFieldServiceTicket()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Field Service Ticket'])[last()]"),"Field Service Ticket", 30);
    	
    	 try {
    		 WebElement fieldServiceTicket = driver.findElement(By.xpath("//div/span[text()='Field Service Ticket']"));
    		 if (fieldServiceTicket.isDisplayed()) {
				logger.info("Field Service Ticket Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Field Service Ticket Page not opened succesfully");
		}
     }
     public void clickOnRuleEngine()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Rule Engine'])[last()]"),"Rule Engine", 30);
    	
    	 try {
    		 WebElement ruleEngine = driver.findElement(By.xpath("//div/span[text()='Rule Engine']"));
    		 if (ruleEngine.isDisplayed()) {
				logger.info("Rule Engine Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Rule Engine Page not opened succesfully");
		}
     }
     public void clickOnManageServiceBoard()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Service Board'])[last()]"),"Manage Service Board", 30);
    	
    	 try {
    		 WebElement manageServiceBoard = driver.findElement(By.xpath("//div/span[text()='Ticket Service Board']"));
    		 if (manageServiceBoard.isDisplayed()) {
				logger.info("Ticket Service Board Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticket Service Board Page not opened succesfully");
		}
     }
     public void clickOnZoneManagement()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Zone Management'])[last()]"),"Zone Management", 30);
    	
    	 try {
    		 WebElement zoneManagement = driver.findElement(By.xpath("//div/span[text()='Zone Management']"));
    		 if (zoneManagement.isDisplayed()) {
				logger.info("Zone Management Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Zone Management Page not opened succesfully");
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
}
