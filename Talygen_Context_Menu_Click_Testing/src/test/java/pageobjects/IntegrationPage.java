package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.StopWatch;
import utils.WebBasePage;

public class IntegrationPage extends WebBasePage{
WebDriver driver ;
	
	public IntegrationPage(WebDriver driver) {
		super(driver, "IntegrationPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of External Link for Integration Page
	 */
     public void clickOnIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Integration']/span"),"Integration", 30);
    	 
     }
     public void clickOnTwilioforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Twilio'])[2]"),"Twilio", 30);
    	
    	 try {
    		 WebElement twilioList = driver.findElement(By.xpath("//div/span[contains(text(),'Twilio List')]"));
    		 if (twilioList.isDisplayed()) {
				logger.info("Twilio List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Twilio List Page not opened succesfully");
		}
     }
     public void clickOnCompanyDirectory ()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Company Directory '])[last()]"),"Company Directory ", 30);
    	
    	 try {
    		 WebElement companyDirectory = driver.findElement(By.xpath("//div/span[contains(text(),'Company Directory ')]"));
    		 if (companyDirectory.isDisplayed()) {
				logger.info("Company Directory Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company Directory Page not opened succesfully");
		}
     }
     public void clickOnCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Company Setup'])[last()]"),"Company Setup ", 30);
    	
    	 try {
    		 WebElement companySetup = driver.findElement(By.xpath("//div/span[contains(text(),'Company Setup')]"));
    		 if (companySetup.isDisplayed()) {
				logger.info("Company Setup Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company Setup Page not opened succesfully");
		}
     }
     public void clickOnUser()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='User'])[last()]"),"User", 30);
    	
    	 try {
    		 WebElement user = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Users')]"));
    		 if (user.isDisplayed()) {
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
    		 WebElement roles = driver.findElement(By.xpath("//div/span[contains(text(),'Roles')]"));
    		 if (roles.isDisplayed()) {
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
    		 WebElement storage = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Storage')]"));
    		 if (storage.isDisplayed()) {
				logger.info("Manage Storage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Storage Page not opened succesfully");
		}
     }
}
