package action;

import org.openqa.selenium.WebDriver;

import pageobjects.VendorPage;

public class VendorAction {
	WebDriver driver ; 
	VendorPage vendorPage;
	
	public VendorAction(WebDriver driver)
	{
		this.driver= driver;
		vendorPage= new VendorPage(driver);
	}
	
	public void GoToVendorPage()
	{
		vendorPage.clickFullMenuDropDown();	
		vendorPage.clickOnVendor();	
		
		
	}
	/*Method  for Context menu Click testing of Vendor */
	public void GoToServicePage()
	{
		
		vendorPage.clickOnService();
		vendorPage.clickOnServiceOfContextMenu();
		vendorPage.clickOnResourceApprovalOfContextMenu();
		vendorPage.clickOnProjectOfContextMenu();
		vendorPage.clickOnToDoList();
		vendorPage.clickOnInvoice();
	
	}
}
