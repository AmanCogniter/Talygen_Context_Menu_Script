package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class DisplayScreenPage extends WebBasePage{
	WebDriver driver ;
	public DisplayScreenPage(WebDriver driver) {
		super(driver, "DisplayScreenPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context menu ,click testing of C DisplayScreen
	 */
     public void clickOnDisplayScreen()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Display Screen']/span"),"Display Screen", 30);
    	 
     }
     public void clickOnCounter()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Counter']"),"Counter", 30);
    	
    	 try {
    		 WebElement CounterPage = driver.findElement(By.xpath("//div/span/a[text()='Add Counter']"));
    		 if (CounterPage.isDisplayed()) {
				logger.info("Counter Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Counter Page not opened succesfully");
		}
     }
     public void clickOnDigitalScreens()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Digital Screens']"),"Digital Screens", 30);
    	
    	 try {
    		 WebElement digitalScreensPage = driver.findElement(By.xpath("//div/span/span[contains(text(),'Digital Screens')]"));
    		 if (digitalScreensPage.isDisplayed()) {
				logger.info("Digital Screens Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Digital Screens Page not opened succesfully");
		}
     }
     public void clickOnContextMenuCounter()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Counter'])[last()]"),"Counter", 30);
    	
    	 try {
    		 WebElement CounterPage = driver.findElement(By.xpath("//div/span/a[contains(text(),'Add Counter')]"));
    		 if (CounterPage.isDisplayed()) {
				logger.info("Counter Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Counter Page not opened succesfully");
		}
     }
     public void clickOnToken()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Token'])[last()]"),"Token", 30);
    	
    	 try {
    		 WebElement tokenPage = driver.findElement(By.xpath("//div/span/a[contains(text(),'Add Token')]"));
    		 if (tokenPage.isDisplayed()) {
				logger.info("Token Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Token Page not opened succesfully");
		}
     }
     public void clickOnCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Company Setup'])[last()]"),"Company Setup", 30);
    	
    	 try {
    		 WebElement companySetupPage = driver.findElement(By.xpath("//div/span[contains(text(),'Company Setup')]"));
    		 if (companySetupPage.isDisplayed()) {
				logger.info("Company Setup Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company Setup Page not opened succesfully");
		}
     }
     public void clickOnConfiguration()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Configuration'])[last()]"),"Configuration", 30);
    	
    	 try {
    		 WebElement configurationPage = driver.findElement(By.xpath("//div/span[contains(text(),'Configuration')]"));
    		 if (configurationPage.isDisplayed()) {
				logger.info("Configuration Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Configuration Page not opened succesfully");
		}
     }
}
