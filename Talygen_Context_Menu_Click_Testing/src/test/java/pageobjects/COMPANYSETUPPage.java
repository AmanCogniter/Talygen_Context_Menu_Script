package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class COMPANYSETUPPage extends WebBasePage{
	WebDriver driver ;
	public COMPANYSETUPPage(WebDriver driver) {
		super(driver, "COMPANYSETUPPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of Company Setup
	 */
     public void clickOnCOMPANYSETUPLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='COMPANY SETUP']/span"),"COMPANY SETUP", 30);
    	 
     }
     public void clickOnClientforCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Clients']"),"Client", 30);
    	
    	 try {
    		 WebElement client = driver.findElement(By.xpath("//div/span[text()='Accounts/Clients']"));
    		 if (client.isDisplayed()) {
				logger.info("Client Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Client Page not opened succesfully");
		}
     }
     public void clickOnCompanyDirectory ()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Company Directory '])[last()]"),"Company Directory ", 30);
    	
    	 try {
    		 WebElement companyDirectory  = driver.findElement(By.xpath("//div/span[text()='Company Directory ']"));
    		 if (companyDirectory .isDisplayed()) {
				logger.info("Company Directory  Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company Directory  Page not opened succesfully");
		}
     }
     public void clickOnCompanySetup ()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Company Setup'])[last()]"),"Company Setup", 30);
    	
    	 try {
    		 WebElement companySetup  = driver.findElement(By.xpath("//div/span[text()='Company Setup']"));
    		 if (companySetup .isDisplayed()) {
				logger.info("Company Setup  Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company Setup  Page not opened succesfully");
		}
     }
     public void clickOnUser()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='User'])[last()]"),"User", 30);
    	
    	 try {
    		 WebElement userPage  = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Users')]"));
    		 if (userPage .isDisplayed()) {
				logger.info("Manage Users Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Users Page not opened succesfully");
		}
     }
     public void clickOnRoles()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Roles'])[last()]"),"Roles", 30);
    	
    	 try {
    		 WebElement rolesPage  = driver.findElement(By.xpath("//div/span[contains(text(),'Roles')]"));
    		 if (rolesPage .isDisplayed()) {
				logger.info("Roles Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Roles Page not opened succesfully");
		}
     }
     public void clickOnStorage()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Storage'])[last()]"),"Storage", 30);
    	
    	 try {
    		 WebElement manageStoragePage  = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Storage')]"));
    		 if (manageStoragePage .isDisplayed()) {
				logger.info("Manage Storage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Storage Page not opened succesfully");
		}
     }
}
