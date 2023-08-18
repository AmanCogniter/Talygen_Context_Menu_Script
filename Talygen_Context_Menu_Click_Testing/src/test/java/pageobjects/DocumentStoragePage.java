package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class DocumentStoragePage extends WebBasePage{
	WebDriver driver ;
	public DocumentStoragePage(WebDriver driver) {
		super(driver, "DocumentStoragePage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context menu, click testing of  Document Storage
	 */
     public void clickOnDocumentStoragePage()
     {		staticWait(2000);
     JavascriptExecutor js = (JavascriptExecutor) driver;
     WebElement Element = driver.findElement(By.xpath("//ul/li[@data-name='CRM']/span"));
     js.executeScript("arguments[0].scrollIntoView();", Element);
    	 click(By.xpath("//ul/li[@data-name='Document Storage']/span"),"Document Storage", 30);
    	 
     }
     public void clickOnManageClientStorage()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage Client Storage']"),"Manage Client Storage", 30);
    	
    	 try {
    		 WebElement manageClientStoragePage = driver.findElement(By.xpath("//div/span[text()='Manage Client Storage']"));
    		 if (manageClientStoragePage.isDisplayed()) {
				logger.info("Manage Client Storage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Client Storage Page not opened succesfully");
		}
     }
     public void clickOnFileDashboard()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[contains(text(),' File_Dashboard ')]"),"File Dashboard", 30);
    	
    	 try {
    		 WebElement fileDashboardPage = driver.findElement(By.xpath("//div/span[text()='Document Storage']"));
    		 if (fileDashboardPage.isDisplayed()) {
				logger.info("File Dashboard Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("File Dashboard Page not opened succesfully");
		}
     }
     public void clickOnInbox()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[contains(text(),'Inbox')]"),"Inbox", 30);
    	
    	 try {
    		 WebElement inboxPage = driver.findElement(By.xpath("//div/h5/span[text()='Reports']"));
    		 if (inboxPage.isDisplayed()) {
				logger.info("Reports Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Reports Page not opened succesfully");
		}
     }
     public void clickOnContextMenuManageClientStorage()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Client Storage'])[last()]"),"Manage Client Storage", 30);
    	
    	 try {
    		 WebElement manageClientStoragePage = driver.findElement(By.xpath("//div/span[text()='Manage Client Storage']"));
    		 if (manageClientStoragePage.isDisplayed()) {
				logger.info("Manage Client Storage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Client Storage Page not opened succesfully");
		}
     }
     public void clickOnClients()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Clients'])[last()]"),"Clients", 30);
    	
    	 try {
    		 WebElement clientPage = driver.findElement(By.xpath("//div/span[text()='Accounts/Clients']"));
    		 if (clientPage.isDisplayed()) {
				logger.info("Accounts/Clients Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Accounts/Clients Page not opened succesfully");
		}
     }
     public void clickOnManageUserStorage()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage User Storage'])[last()]"),"Manage User Storage", 30);
    	
    	 try {
    		 WebElement manageUserStoragePage = driver.findElement(By.xpath("//div/span[text()='Manage User Storage']"));
    		 if (manageUserStoragePage.isDisplayed()) {
				logger.info("Manage User Storage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage User Storage Page not opened succesfully");
		}
     }
     public void clickOnStorage()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Storage'])[last()]")," Storage", 30);
    	
    	 try {
    		 WebElement storagePage = driver.findElement(By.xpath("//div/span[text()='Manage Storage']"));
    		 if (storagePage.isDisplayed()) {
				logger.info(" Manage Storage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info(" Manage Storage Page not opened succesfully");
		}
     }
     public void clickOnUserStorageReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='User Storage Report'])[last()]")," User Storage Report", 30);
    	
    	 try {
    		 WebElement userStorageReportPage = driver.findElement(By.xpath("//div/span[text()='Storage Capacity']"));
    		 if (userStorageReportPage.isDisplayed()) {
				logger.info("Storage Capacity Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Storage Capacity Page not opened succesfully");
		}
     }
     public void clickOnRoles()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Roles'])[last()]")," Roles", 30);
    	
    	 try {
    		 WebElement rolesPage = driver.findElement(By.xpath("//div/span[text()='Roles']"));
    		 if (rolesPage.isDisplayed()) {
				logger.info("Roles Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Roles Page not opened succesfully");
		}
     }
     public void clickOnUserNotifications()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='User Notifications'])[last()]")," User Notifications", 30);
    	
    	 try {
    		 WebElement userNotificationsPage = driver.findElement(By.xpath("//table/thead/tr/th[contains(text(),'Manage Notifications')]"));
    		 if (userNotificationsPage.isDisplayed()) {
				logger.info("User Notifications Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User Notifications Page not opened succesfully");
		}
     }
     public void clickOnCompanyNotifications()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Company Notifications'])[last()]")," Company Notifications", 30);
    	
    	 try {
    		 WebElement companyNotificationsPage = driver.findElement(By.xpath("//div/span[text()='Notification']"));
    		 if (companyNotificationsPage.isDisplayed()) {
				logger.info("Company Notifications Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company Notifications Page not opened succesfully");
		}
     }
}
