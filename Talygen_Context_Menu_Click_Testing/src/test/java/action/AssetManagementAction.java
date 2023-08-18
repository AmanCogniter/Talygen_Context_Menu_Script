package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AssetManagementPage;

public class AssetManagementAction {
	WebDriver driver ; 
	AssetManagementPage assetManagementPage;
	
	public AssetManagementAction(WebDriver driver)
	{
		this.driver= driver;
		assetManagementPage= new AssetManagementPage(driver);
	}
	
	public void GoToAssetManagementPage()
	{
		assetManagementPage.clickFullMenuDropDown();	
		assetManagementPage.clickAssetManagementLink();	
		
		
	}
	/*Meatod  for Group List for AssetManagement*/
	public void GoToGroupListPage()
	{
		
		assetManagementPage.clickOnGroupList();	
		assetManagementPage.clickOnProductDashboard();
		assetManagementPage.clickOnBarcodeSearch();
		assetManagementPage.clickOnMaintenanceSchedule();
		assetManagementPage.clickOnAddProductType();
		assetManagementPage.clickOnProductType();
		assetManagementPage.clickOnNewProductTypeRequest();
		assetManagementPage.clickOnAddProduct();
		assetManagementPage.clickOnManageProduct();
		assetManagementPage.clickOnMyProducts();
		assetManagementPage.clickOnAddProductAssignment();
		assetManagementPage.clickOnProductAssignment();
		assetManagementPage.clickOnProductTransfer();
		assetManagementPage.clickOnProductReport();
		assetManagementPage.clickOnPendingRequests();
		assetManagementPage.clickOnCheckOutRequestList();
		
		
	}
}
