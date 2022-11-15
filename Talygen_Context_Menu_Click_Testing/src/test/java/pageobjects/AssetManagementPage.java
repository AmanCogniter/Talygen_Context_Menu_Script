package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class AssetManagementPage extends WebBasePage{
	WebDriver driver ;
	public AssetManagementPage(WebDriver driver) {
		super(driver, "AssetManagementPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Context Menu for Asset Management
	 */
     public void clickAssetManagementLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Asset Management ']/span"),"Asset Management", 30);
    	 
     }
     public void clickOnGroupList()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Group List'])[3]"),"Group List", 30);
    	
    	 try {
    		 WebElement productsGroupList = driver.findElement(By.xpath("//div/span[text()='Products Group List']"));
    		 if (productsGroupList.isDisplayed()) {
				logger.info("Group List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Group List Page not opened succesfully");
		}
     }
     public void clickOnAssetDashboard()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Asset Dashboard']"),"Asset Dashboard", 30);
    	
    	 try {
    		 WebElement assetDashboard = driver.findElement(By.xpath("//div/span[text()='Asset Dashboard']"));
    		 if (assetDashboard.isDisplayed()) {
				logger.info("Asset Dashboard Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Asset Dashboard Page not opened succesfully");
		}
     }
     public void clickOnBarcodeSearch()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Barcode Search']"),"Barcode Search", 30);
    	
    	 try {
    		 WebElement barcodeSearch = driver.findElement(By.xpath("//div/span[text()='Product History']"));
    		 if (barcodeSearch.isDisplayed()) {
				logger.info("Barcode Search Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Barcode Search Page not opened succesfully");
		}
     }
     public void clickOnMaintenanceSchedule()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Maintenance Schedule'])[2]"),"Maintenance Schedule", 30);
    	
    	 try {
    		 WebElement maintenanceSchedule = driver.findElement(By.xpath("//div/span[text()='Maintenance Schedule']"));
    		 if (maintenanceSchedule.isDisplayed()) {
				logger.info("Maintenance Schedule Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Maintenance Schedule Page not opened succesfully");
		}
     }
     public void clickOnAddProductType()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Add Product Type']"),"Add Product Type", 30);
    	
    	 try {
    		 WebElement addProductType = driver.findElement(By.xpath("//div/span[text()='Add Product Type']"));
    		 if (addProductType.isDisplayed()) {
				logger.info("Add Product Type Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Product Type Page not opened succesfully");
		}
     }
     public void clickOnProductType()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Product Type'])[last()]"),"Product Type", 30);
    	
    	 try {
    		 WebElement productType = driver.findElement(By.xpath("//div/span[text()='Product Type']"));
    		 if (productType.isDisplayed()) {
				logger.info("Product Type Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Type Page not opened succesfully");
		}
     }
     public void clickOnNewProductTypeRequest()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='New Product Type Request'])[last()]"),"New Product Type Request", 30);
    	
    	 try {
    		 WebElement newProductTypeRequest = driver.findElement(By.xpath("//div/span[text()='New Product Type Request']"));
    		 if (newProductTypeRequest.isDisplayed()) {
				logger.info("New Product Type Request Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("New Product Type Request Page not opened succesfully");
		}
     }
     public void clickOnAddProduct()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Product'])[last()]"),"Add Product", 30);
    	
    	 try {
    		 WebElement addProduct = driver.findElement(By.xpath("//div/h5/span[text()='Create Product']"));
    		 if (addProduct.isDisplayed()) {
				logger.info("Add Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Product Page not opened succesfully");
		}
     }
     public void clickOnManageProduct()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Product'])[last()]"),"Manage Product", 30);
    	
    	 try {
    		 WebElement manageProduct = driver.findElement(By.xpath("//div/span[text()='Product List']"));
    		 if (manageProduct.isDisplayed()) {
				logger.info("Manage Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Product Page not opened succesfully");
		}
     }
     public void clickOnMyProducts()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='My Products'])[last()]"),"My Products", 30);
    	
    	 try {
    		 WebElement myProduct = driver.findElement(By.xpath("//div/span[text()='My Products ']"));
    		 if (myProduct.isDisplayed()) {
				logger.info("My Products Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("My Products Page not opened succesfully");
		}
     }
     public void clickOnAddProductAssignment()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Product Assignment'])[last()]"),"Add Product Assignment", 30);
    	
    	 try {
    		 WebElement addProductAssignment = driver.findElement(By.xpath("//div/span[text()='Product Assignment']"));
    		 if (addProductAssignment.isDisplayed()) {
				logger.info("Add Product Assignment Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Product Assignment Page not opened succesfully");
		}
     }
     public void clickOnProductAssignment()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Product Assignment'])[last()]"),"Product Assignment", 30);
    	
    	 try {
    		 WebElement productAssignment = driver.findElement(By.xpath("//div/span[text()='Product Assignment']"));
    		 if (productAssignment.isDisplayed()) {
				logger.info("Product Assignment Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Assignment Page not opened succesfully");
		}
     }
     public void clickOnProductTransfer()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Product Transfer'])[last()]"),"Product Transfer", 30);
    	
    	 try {
    		 WebElement productTransfer = driver.findElement(By.xpath("//div/span[text()='Product Transfer']"));
    		 if (productTransfer.isDisplayed()) {
				logger.info("Product Transfer Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Transfer Page not opened succesfully");
		}
     }
     public void clickOnProductReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Product Report'])[last()]"),"Product Report", 30);
    	
    	 try {
    		 WebElement productReport = driver.findElement(By.xpath("//div/span[text()='Product Assignment Report']"));
    		 if (productReport.isDisplayed()) {
				logger.info("Product Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Report Page not opened succesfully");
		}
     }
     public void clickOnPendingRequests()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Pending Requests'])[last()]"),"Pending Requests", 30);
    	
    	 try {
    		 WebElement pendingRequests = driver.findElement(By.xpath("//div/span[text()='Pending Request']"));
    		 if (pendingRequests.isDisplayed()) {
				logger.info("Pending Requests Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Pending Requests Page not opened succesfully");
		}
     }
     public void clickOnCheckOutRequestList()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Check Out Request List'])[last()]"),"Check Out Request List", 30);
    	
    	 try {
    		 WebElement checkOutRequestList = driver.findElement(By.xpath("//div/span[contains(text(),'Check-Out List')]"));
    		 if (checkOutRequestList.isDisplayed()) {
				logger.info("Check Out Request List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Check Out Request List Page not opened succesfully");
		}
     }
}
