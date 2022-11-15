package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class MSPModulePage extends WebBasePage{
WebDriver driver ;
	
	public MSPModulePage(WebDriver driver) {
		super(driver, "MSPModulePage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of MSPModule Page
	 */
     public void clickOnMSPModule()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='MSP Module']/span"),"MSP Module", 30);
    	 
     }
     public void clickOnAddPackagesforMSPModule()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Add Packages']"),"Add Packages", 30);
    	
    	 try {
    		 WebElement packageDetail = driver.findElement(By.xpath("//div/span[contains(text(),'Package Detail')]"));
    		 if (packageDetail.isDisplayed()) {
				logger.info("Package Detail Page opened succesfully");
				//click(By.xpath("//div/ul/li/a[text()=' My Products']"),"My Products", 30);
				//staticWait(2000);
				//click(By.xpath("//div/ul/li/a[text()=' TALYGEN Package']"),"TALYGEN Package", 30);
				
			}
    		 
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Package Detail Page not opened succesfully");
		}
     }
     public void clickOnAddPackagesOfContextMenu()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Packages'])[last()]"),"Add Packages of Context menu", 30);
    	
    	 try {
    		 WebElement packageDetail = driver.findElement(By.xpath("//div/span[contains(text(),'Package Detail')]"));
    		 if (packageDetail.isDisplayed()) {
				logger.info("Package Detail Page opened succesfully");
				
			}
    		 
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Package Detail Page not opened succesfully");
		}
     }
     public void clickOnAddSubscription()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Subscription'])[last()]"),"Add Subscription", 30);
    	
    	 try {
    		 WebElement addSubscription = driver.findElement(By.xpath("//div/span[contains(text(),'Add Subscription')]"));
    		 if (addSubscription.isDisplayed()) {
				logger.info("Add Subscription Page opened succesfully");
				
			}
    		 
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Subscription Page not opened succesfully");
		}
     }
     public void clickOnManagePackages()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Packages'])[last()]"),"Manage Packages", 30);
    	
    	 try {
    		 WebElement managePackages = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Packages')]"));
    		 if (managePackages.isDisplayed()) {
				logger.info("Manage Packages Page opened succesfully");
				
			}
    		 
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Packages Page not opened succesfully");
		}
     }
     public void clickOnManageSubscription()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Subscription'])[last()]"),"Manage Subscription", 30);
    	
    	 try {
    		 WebElement manageSubscription = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Subscription')]"));
    		 if (manageSubscription.isDisplayed()) {
				logger.info("Manage Subscription Page opened succesfully");
				
			}
    		 
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Subscription Page not opened succesfully");
		}
     }
     public void clickOnMyProducts()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='My Products'])[last()]"),"My Products", 30);
    	
    	 try {
    		 WebElement myProducts = driver.findElement(By.xpath("//div/span[contains(text(),'My Products ')]"));
    		 if (myProducts.isDisplayed()) {
				logger.info("My Products Page opened succesfully");
				
			}
    		 
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("My Products Page not opened succesfully");
		}
     }
}
