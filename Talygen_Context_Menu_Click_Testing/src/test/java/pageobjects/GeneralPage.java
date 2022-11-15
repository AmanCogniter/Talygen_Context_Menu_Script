package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class GeneralPage extends WebBasePage{
	WebDriver driver ;
	public GeneralPage(WebDriver driver) {
		super(driver, "GeneralPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of General
	 */
     public void clickOnGeneral()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='General']/span"),"General", 30);
    	 
     }
     public void clickOnAddReport()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Add Report']"),"Add Report", 30);
    	
    	 try {
    		 WebElement addReport = driver.findElement(By.xpath("//div/a/span[text()='GENERAL']"));
    		 if (addReport.isDisplayed()) {
				logger.info("Add report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Report Page not opened succesfully");
		}
     }
     public void clickOnAutoResponder()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Auto Responder'])[last()]"),"Auto Responder", 30);
    	
    	 try {
    		 WebElement autoResponder = driver.findElement(By.xpath("//div/span[text()='Auto Responder']"));
    		 if (autoResponder.isDisplayed()) {
				logger.info("Auto Responder Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Auto Responder Page not opened succesfully");
		}
     }
     public void clickOnAddAutoResponder()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Auto-Responder'])[last()]"),"Add Auto Responder", 30);
    	
    	 try {
    		 WebElement addAutoResponder = driver.findElement(By.xpath("//div/span[text()='Manage Auto Responder']"));
    		 if (addAutoResponder.isDisplayed()) {
				logger.info("Manage Add Auto Responder Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Add Auto Responder Page not opened succesfully");
		}
     }
     public void clickOnRoles()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Roles'])[last()]"),"Roles", 30);
    	
    	 try {
    		 WebElement roles = driver.findElement(By.xpath("//div/span[text()='Roles']"));
    		 if (roles.isDisplayed()) {
				logger.info("Roles Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Roles Page not opened succesfully");
		}
     }
     public void clickOnRuleEngine()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Rule Engine'])[last()]"),"Rule Engine", 30);
    	
    	 try {
    		 WebElement ruleEngine = driver.findElement(By.xpath("//div/span[text()='Rule Engine']"));
    		 if (ruleEngine.isDisplayed()) {
				logger.info("Rule Engine Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Rule Engine Page not opened succesfully");
		}
     }
     public void clickOnOrganizationChart()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Organization Chart'])[last()]"),"Organization Chart", 30);
    	
    	 try {
    		 WebElement organizationChart = driver.findElement(By.xpath("//div/span[text()='Organization Chart']"));
    		 if (organizationChart.isDisplayed()) {
				logger.info("Organization Chart Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Organization Chart Page not opened succesfully");
		}
     }
     public void clickOnManageTags()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Tags'])[last()]"),"Manage Tags", 30);
    	
    	 try {
    		 WebElement manageTags = driver.findElement(By.xpath("//div/span[text()='Tag']"));
    		 if (manageTags.isDisplayed()) {
				logger.info("Manage Tags Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Tags Page not opened succesfully");
		}
     }
     public void clickOnProvisionalRights()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Provisional Rights'])[last()]"),"Provisional Rights", 30);
    	
    	 try {
    		 WebElement provisionalRights = driver.findElement(By.xpath("//div/span[text()='Provisional Rights']"));
    		 if (provisionalRights.isDisplayed()) {
				logger.info("Provisional Rights Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Provisional Rights Page not opened succesfully");
		}
     }
     public void clickOnAddProvisionalRights()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Provisional Rights'])[last()]"),"Add Provisional Rights", 30);
    	
    	 try {
    		 WebElement provisionalRights = driver.findElement(By.xpath("//div/span[text()='Add Provisional Rights']"));
    		 if (provisionalRights.isDisplayed()) {
				logger.info("Add Provisional Rights Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Provisional Rights Page not opened succesfully");
		}
     }
     public void clickOnWorkingDay()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Working Day'])[last()]"),"Working Day", 30);
    	
    	 try {
    		 WebElement workingDay = driver.findElement(By.xpath("//div/span[text()='Working/Non-Working Day']"));
    		 if (workingDay.isDisplayed()) {
				logger.info("Working/Non-Working Day Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Working/Non-Working Day Page not opened succesfully");
		}
     }
     public void clickOnWorkingWeek()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Working Week'])[last()]"),"Working Week", 30);
    	
    	 try {
    		 WebElement workingWeek = driver.findElement(By.xpath("//div/span[text()='Setup for the working week']"));
    		 if (workingWeek.isDisplayed()) {
				logger.info("Working/Non-Working Week Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Working/Non-Working Week Page not opened succesfully");
		}
     }
}
