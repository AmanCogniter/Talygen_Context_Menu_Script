package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class VendorPage extends WebBasePage{
	WebDriver driver ;
	public VendorPage(WebDriver driver) {
		super(driver, "VendorPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of Vendor
	 */
     public void clickOnVendor()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Vendor']/span"),"Vendor", 30);
    	 
     }
     public void clickOnService()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Service']"),"Service", 30);
    	
    	 try {
    		 WebElement servicePage = driver.findElement(By.xpath("//div/span[contains(text(),'Vendor Services')]"));
    		 if (servicePage.isDisplayed()) {
				logger.info("Vendor Services Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Vendor Services Page not opened succesfully");
		}
     }
     public void clickOnServiceOfContextMenu()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Service'])[last()]"),"Context Menu's Service", 30);
    	
    	 try {
    		 WebElement servicePage = driver.findElement(By.xpath("//div/span[contains(text(),'Vendor Services')]"));
    		 if (servicePage.isDisplayed()) {
				logger.info("Vendor Services Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Vendor Services Page not opened succesfully");
		}
     }
     public void clickOnResourceApprovalOfContextMenu()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title=' Resource Approval'])[last()]"),"Context Menu's  Resource Approval", 30);
    	
    	 try {
    		 WebElement resourceApprovalPage = driver.findElement(By.xpath("//div/span[contains(text(),'Resource Approval')]"));
    		 if (resourceApprovalPage.isDisplayed()) {
				logger.info("Resource Approval Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Resource Approval Page not opened succesfully");
		}
     }
     public void clickOnProjectOfContextMenu()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Project'])[last()]"),"Context Menu's Project", 30);
    	
    	 try {
    		 WebElement projectPage = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Projects')]"));
    		 if (projectPage.isDisplayed()) {
				logger.info("Manage Projects Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Projects Page not opened succesfully");
		}
     }
     public void clickOnToDoList()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='To Do List'])[last()]"),"Context Menu's To Do List", 30);
    	
    	 try {
    		 WebElement workLoadPage = driver.findElement(By.xpath("//div/span[contains(text(),'Work Load')]"));
    		 if (workLoadPage.isDisplayed()) {
				logger.info("Work Load Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Work Load Page not opened succesfully");
		}
     }
     public void clickOnInvoice()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Invoice'])[last()]"),"Context Menu's Invoice", 30);
    	
    	 try {
    		 WebElement invoicePage = driver.findElement(By.xpath("//div/span[contains(text(),'Invoice')]"));
    		 if (invoicePage.isDisplayed()) {
				logger.info("Invoice Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Invoice Page not opened succesfully");
		}
     }
}
