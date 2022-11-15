package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class CRMPage extends WebBasePage{
	WebDriver driver ;
	public CRMPage(WebDriver driver) {
		super(driver, "CRMPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of  Crm
	 */
     public void clickOnCRM()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='CRM']/span"),"CRM", 30);
    	 
     }
     public void clickOnAccounts()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Accounts']"),"Accounts", 30);
    	
    	 try {
    		 WebElement accountsPage = driver.findElement(By.xpath("//div/span[text()='Accounts']"));
    		 if (accountsPage.isDisplayed()) {
				logger.info("Accounts Page opened succesfully");
				click(By.xpath("//div/a/span[@id='showHideMenuParent']"),"Expand Context menu", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Accounts Page not opened succesfully");
		}
     }
     public void clickOnLead()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Lead'])[last()]"),"Lead", 30);
    	
    	 try {
    		 WebElement leadPage = driver.findElement(By.xpath("//div/span[text()='Leads']"));
    		 if (leadPage.isDisplayed()) {
				logger.info("Lead Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Lead Page not opened succesfully");
		}
     }
     public void clickOnDeal()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Deal'])[last()]"),"Deal", 30);
    	
    	 try {
    		 WebElement dealPage = driver.findElement(By.xpath("//div/span[text()='Deals']"));
    		 if (dealPage.isDisplayed()) {
				logger.info("Deal Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Deal Page not opened succesfully");
		}
     }
     public void clickOnProductType()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Product Type'])[last()]"),"Product Type", 30);
    	
    	 try {
    		 WebElement productTypePage = driver.findElement(By.xpath("//div/span[text()='Product Type']"));
    		 if (productTypePage.isDisplayed()) {
				logger.info("Product Type Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Type Page not opened succesfully");
		}
     }
     public void clickOnProduct()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Product'])[last()]"),"Product", 30);
    	
    	 try {
    		 WebElement productPage = driver.findElement(By.xpath("//div/span[text()='Product']"));
    		 if (productPage.isDisplayed()) {
				logger.info("Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Page not opened succesfully");
		}
     }
     public void clickOnPurchaseOrder()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Purchase Order'])[last()]"),"Purchase Order", 30);
    	
    	 try {
    		 WebElement purchaseOrderPage = driver.findElement(By.xpath("//div/span[text()='Purchase Order']"));
    		 if (purchaseOrderPage.isDisplayed()) {
				logger.info("Purchase Order Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Purchase Order Page not opened succesfully");
		}
     }
     public void clickOnSalesOrder()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Sales Order'])[last()]"),"Sales Order", 30);
    	
    	 try {
    		 WebElement salesOrderPage = driver.findElement(By.xpath("//div/span[text()='Sales Order']"));
    		 if (salesOrderPage.isDisplayed()) {
				logger.info("Sales Order Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Sales Order Page not opened succesfully");
		}
     }
     public void clickOnStage()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Stage'])[last()]"),"Stage", 30);
    	
    	 try {
    		 WebElement stagePage = driver.findElement(By.xpath("//div/span[text()='Stage']"));
    		 if (stagePage.isDisplayed()) {
				logger.info("Stage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Stage Page not opened succesfully");
		}
     }
     public void clickOnManageLayout()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Layout'])[last()]"),"Manage Layout", 30);
    	
    	 try {
    		 WebElement manageLayoutPage = driver.findElement(By.xpath("//div/span[text()='Manage Layout']"));
    		 if (manageLayoutPage.isDisplayed()) {
				logger.info("Manage Layout Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Layout Page not opened succesfully");
		}
     }
     public void clickOnCRMReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='CRM Report'])[last()]"),"CRM Report", 30);
    	
    	 try {
    		 WebElement cRMReportPage = driver.findElement(By.xpath("//div/span[text()='CRM Reports']"));
    		 if (cRMReportPage.isDisplayed()) {
				logger.info("CRM Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("CRM Report Page not opened succesfully");
		}
     }
     public void clickOnCRMDashboard()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='CRM Dashboard'])[last()]"),"CRM Dashboard", 30);
    	
    	 try {
    		 WebElement cRMDashboardPage = driver.findElement(By.xpath("//div/span[text()=' Dashboard']"));
    		 if (cRMDashboardPage.isDisplayed()) {
				logger.info("CRM Dashboard Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("CRM Dashboard Page not opened succesfully");
		}
     }
}
