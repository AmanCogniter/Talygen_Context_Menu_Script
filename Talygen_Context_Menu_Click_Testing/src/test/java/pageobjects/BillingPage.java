package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class BillingPage extends WebBasePage{
	WebDriver driver ;
	public BillingPage(WebDriver driver) {
		super(driver, "BillingPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Automate Flag Processing for Billing
	 */
     public void clickOnBillingLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Billing']/span"),"Billing", 30);
    	 
     }
     public void clickOnAutomateFlagProcessing()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Automate Flag Processing']"),"Automate Flag Processing", 30);
    	
    	 try {
    		 WebElement automateFlagProcessing = driver.findElement(By.xpath("//div/span[text()='Automate Flag Processing']"));
    		 if (automateFlagProcessing.isDisplayed()) {
				logger.info("Automate Flag Processing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Automate Flag Processing Page not opened succesfully");
		}
     }
     public void clickOnAddNewInvoice()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add New Invoice'])[last()]"),"Add New Invoice", 30);
    	
    	 try {
    		 WebElement addNewInvoice = driver.findElement(By.xpath("//div/span[text()=' Add Invoice']"));
    		 if (addNewInvoice.isDisplayed()) {
				logger.info("Add New Invoice Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add New Invoice Page not opened succesfully");
		}
     }
     public void clickOnInvoice()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Invoice'])[last()]"),"Invoice", 30);
    	
    	 try {
    		 WebElement invoice = driver.findElement(By.xpath("//div/span[text()='Invoice']"));
    		 if (invoice.isDisplayed()) {
				logger.info("Invoice Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Invoice Page not opened succesfully");
		}
     }
     public void clickOnClients()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Clients'])[last()]"),"Clients", 30);
    	
    	 try {
    		 WebElement clientsPage = driver.findElement(By.xpath("//div/span[text()='Accounts/Clients']"));
    		 if (clientsPage.isDisplayed()) {
				logger.info("Clients Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Clients Page not opened succesfully");
		}
     }
     public void clickOnClientReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Client Report'])[last()]"),"Client Report", 30);
    	
    	 try {
    		 WebElement clientReportPage = driver.findElement(By.xpath("//div/span[text()='Client Report']"));
    		 if (clientReportPage.isDisplayed()) {
				logger.info("Client Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Client Report Page not opened succesfully");
		}
     }
     public void clickOnMyProfile()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='My Profile'])[last()]"),"My Profile", 30);
    	
    	 try {
    		 WebElement myProfilePage = driver.findElement(By.xpath("//div/span[text()='User Profile']"));
    		 if (myProfilePage.isDisplayed()) {
				logger.info("User Profile Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User Profile Page not opened succesfully");
		}
     }
}
