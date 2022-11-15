package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class TrainingPage extends WebBasePage{
	WebDriver driver ;
	public TrainingPage(WebDriver driver) {
		super(driver, "TrainingPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of Training
	 */
     public void clickOnTraining()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Training']/span"),"Training", 30);
    	 
     }
     public void clickOnTrainingSubModule()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Training']"),"Training SubModule", 30);
    	
    	 try {
    		 WebElement trainingPage = driver.findElement(By.xpath("//div/span[contains(text(),'Training')]"));
    		 if (trainingPage.isDisplayed()) {
				logger.info("Training Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Training Page not opened succesfully");
		}
     }
     public void clickOnAddTraining()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Add Training']"),"Add Training", 30);
    	
    	 try {
    		 WebElement manageTraining = driver.findElement(By.xpath("//div/span[contains(text(),'Training')]"));
    		 if (manageTraining.isDisplayed()) {
				logger.info("Manage Training Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Training Page not opened succesfully");
		}
     }
     public void clickOnTrainingOfContextmenu()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Training'])[last()]"),"Training", 30);
    	
    	 try {
    		 WebElement training = driver.findElement(By.xpath("//div/span[contains(text(),'Training')]"));
    		 if (training.isDisplayed()) {
				logger.info("Training Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Training Page not opened succesfully");
		}
     }
     public void clickOnUser()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='User'])[last()]"),"User", 30);
    	
    	 try {
    		 WebElement manageUsers = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Users')]"));
    		 if (manageUsers.isDisplayed()) {
				logger.info("Manage Users Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Users Page not opened succesfully");
		}
     }
     public void clickOnCompanyDirectory ()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Company Directory '])[last()]"),"Company Directory ", 30);
    	
    	 try {
    		 WebElement companyDirectory  = driver.findElement(By.xpath("//div/span[contains(text(),'Company Directory ')]"));
    		 if (companyDirectory.isDisplayed()) {
				logger.info("Company Directory Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company Directory Page not opened succesfully");
		}
     }
     public void clickOnTrainingReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Training Report'])[last()]"),"Training Report", 30);
    	
    	 try {
    		 WebElement trainingReport  = driver.findElement(By.xpath("//div/span[contains(text(),'User Training Report')]"));
    		 if (trainingReport.isDisplayed()) {
				logger.info("User Training Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User Training Report Page not opened succesfully");
		}
     }
}
