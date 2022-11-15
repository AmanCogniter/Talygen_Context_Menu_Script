package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class VDeskPage extends WebBasePage{
	WebDriver driver ;
	public VDeskPage(WebDriver driver) {
		super(driver, "VDeskPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Application Settings for VDesk
	 */
     public void clickOnVDeskPage()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='vDesk']/span"),"VDesk", 30);
    	 
     }
     public void clickOnApplicationSettings()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Application Settings']"),"Application Settings", 30);
    	
    	 try {
    		 WebElement applicationSettingsPage = driver.findElement(By.xpath("//div/span[text()='Application Settings']"));
    		 if (applicationSettingsPage.isDisplayed()) {
				logger.info("Application Settings Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Application Settings Page not opened succesfully");
		}
     }
     public void clickOnApplicationSettingsOfContextMenu()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Application Settings'])[last()]"),"Context Menu's Application Settings", 30);
    	
    	 try {
    		 WebElement applicationSettingsPage = driver.findElement(By.xpath("//div/span[text()='Application Settings']"));
    		 if (applicationSettingsPage.isDisplayed()) {
				logger.info("Application Settings Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Application Settings Page not opened succesfully");
		}
     }
     public void clickOnClientLogIn()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Client Log In'])[last()]"),"Client Log In", 30);
    	
    	 try {
    		 WebElement applicationSettingsPage = driver.findElement(By.xpath("//div/span[text()='Client Login ']"));
    		 if (applicationSettingsPage.isDisplayed()) {
				logger.info("Client Login Page opened succesfully");
				//driver.navigate().back();
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Client Login Page not opened succesfully");
		}
     }
     public void clickOnDesktopClients()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Desktop Clients'])[last()]"),"Desktop Clients", 30);
    	
    	 try {
    		 WebElement desktopClientsPage = driver.findElement(By.xpath("//div/span[text()='Desktop Clients']"));
    		 if (desktopClientsPage.isDisplayed()) {
				logger.info("Desktop Clients Page opened succesfully");
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Desktop Clients Page not opened succesfully");
		}
     }
     public void clickOnvDeskDashboard()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='vDesk Dashboard'])[last()]"),"vDesk Dashboard", 30);
    	
    	 try {
    		 WebElement vDeskDashboardPage = driver.findElement(By.xpath("//div/span[text()='Dashboard']"));
    		 if (vDeskDashboardPage.isDisplayed()) {
				logger.info("vDesk Dashboard Page opened succesfully");
		
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("vDesk Dashboard Page not opened succesfully");
		}
     }
     public void clickOnJobsReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Jobs Report'])[last()]"),"Jobs Report", 30);
    	
    	 try {
    		 WebElement jobsReportPage = driver.findElement(By.xpath("//div/span[text()='Jobs Report']"));
    		 if (jobsReportPage.isDisplayed()) {
				logger.info("Jobs Report Page opened succesfully");
		
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Jobs Report Page not opened succesfully");
		}
     }
}
