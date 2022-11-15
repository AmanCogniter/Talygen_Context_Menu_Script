package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class ApprovalPage extends WebBasePage{
	WebDriver driver ;
	public ApprovalPage(WebDriver driver) {
		super(driver, "ApprovalPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Approval Chain for Approval
	 */
     public void clickOnApprovalLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Approval']/span"),"Approval", 30);
    	 
     }
     public void clickOnApprovalChain()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Approval Chain ']"),"Approval chain", 30);
    	
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div/span[contains(text(),'Approval Chain')]"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Approval chain Page displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval chain Page not displayed succesfully");
		}
     }
     public void clickOnApprovalGroup()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Approval Group'])[2]"),"Approval Group", 30);
    	
    	 try {
    		 WebElement approvalGroup = driver.findElement(By.xpath("//div/span[contains(text(),'Approval Group')]"));
    		 if (approvalGroup.isDisplayed()) {
				logger.info("Approval Group Page displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Group Page not displayed succesfully");
		}
     }
     public void clickOnApprovalchain()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Approval Chain '])[2]"),"Approval Chain", 30);
    	
    	 try {
    		 WebElement approvalChain = driver.findElement(By.xpath("//div/span[contains(text(),'Approval Chain')]"));
    		 if (approvalChain.isDisplayed()) {
				logger.info("Approval Chain Page displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Chain Page not displayed succesfully");
		}
     }
     public void clickOnApprovalRule()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Approval Rule'])[2]"),"Approval Rule", 30);
    	
    	 try {
    		 WebElement approvalRule = driver.findElement(By.xpath("//div/span[contains(text(),'Approval Rule')]"));
    		 if (approvalRule.isDisplayed()) {
				logger.info("Approval Rule Page displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Rule Page not displayed succesfully");
		}
     }
     public void clickOnApprovalApprovalReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Approval Report'])[2]"),"Approval Report", 30);
    	
    	 try {
    		 WebElement approvalReport = driver.findElement(By.xpath("//div/span[contains(text(),'Approval Reports')]"));
    		 if (approvalReport.isDisplayed()) {
				logger.info("Approval Report Page displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Report Page not displayed succesfully");
		}
     }
     public void clickOnApprovalCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Company Setup'])[2]"),"Company Setup", 30);
    	
    	 try {
    		 WebElement companySetup = driver.findElement(By.xpath("//div/span[contains(text(),'Company Setup')]"));
    		 if (companySetup.isDisplayed()) {
				logger.info("Company Setup Page displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company Setup Page not displayed succesfully");
		}
     }
}
