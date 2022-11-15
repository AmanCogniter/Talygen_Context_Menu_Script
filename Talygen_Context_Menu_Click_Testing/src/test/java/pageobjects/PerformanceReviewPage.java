package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class PerformanceReviewPage extends WebBasePage{
	 WebDriver driver ;
		
		public PerformanceReviewPage(WebDriver driver) {
			super(driver, "PerformanceReviewPage");
			this.driver=driver;
			// TODO Auto-generated constructor stub
		}
		public void clickFullMenuDropDown() {
			staticWait(3000);
	        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
	        
	    }
		/*
		 * Code for Context menu click testing of Performance Review Module
		 */
	     public void clickOnPerformanceReview()
	     {		staticWait(2000);
	    	 click(By.xpath("//div/ul/li[@data-name='Performance Review']/span"),"Performance Review", 30);
	    	 
	     }
	     public void clickOnPerformanceReviewSubModule()
	     {		staticWait(2000);
	     click(By.xpath("//div/ul/li/a[@data-original-title='Performance Review']"),"Performance Review sub Module", 30);
	    	
	    	 try {
	    		 WebElement performanceReview = driver.findElement(By.xpath("//div/span[text()='Performance Review']"));
	    		 if (performanceReview.isDisplayed()) {
					logger.info("Performance Review Page opened succesfully");
				}
	    	 }
			 catch (Exception e) {
				// TODO: handle exception
				logger.info("Performance Review Page not opened succesfully");
			}
	    	 
	     }
	     public void clickOnProvideReview()
	     {		staticWait(2000);
	     click(By.xpath("(//div/ul/li/a[@data-original-title='Provide Review'])[last()]"),"Provide Review", 30);
	    	
	    	 try {
	    		 WebElement provideReview = driver.findElement(By.xpath("//div/input[@id='search']"));
	    		 if (provideReview.isDisplayed()) {
					logger.info("Provide Review Page opened succesfully");
				}
	    	 }
			 catch (Exception e) {
				// TODO: handle exception
				logger.info("Provide Review Page not opened succesfully");
			}
	    	 
	     }
	     public void clickOnReview()
	     {		staticWait(2000);
	     click(By.xpath("(//div/ul/li/a[@data-original-title='Review'])[last()]"),"Review", 30);
	    	
	    	 try {
	    		 WebElement review = driver.findElement(By.xpath("//div/span[text()='Review']"));
	    		 if (review.isDisplayed()) {
					logger.info("Review Page opened succesfully");
				}
	    	 }
			 catch (Exception e) {
				// TODO: handle exception
				logger.info("Review Page not opened succesfully");
			}
	    	 
	     }
	     public void clickOnProvideFeedback()
	     {		staticWait(2000);
	     click(By.xpath("(//div/ul/li/a[@data-original-title='Provide Feedback'])[last()]"),"Provide Feedback", 30);
	    	
	    	 try {
	    		 WebElement feedbackListing = driver.findElement(By.xpath("//div/span[text()='Feedback Listing']"));
	    		 if (feedbackListing.isDisplayed()) {
					logger.info("Feedback Listing Page opened succesfully");
				}
	    	 }
			 catch (Exception e) {
				// TODO: handle exception
				logger.info("Feedback Listing Page not opened succesfully");
			}
	    	 
	     }
	     public void clickOnGoal()
	     {		staticWait(2000);
	     click(By.xpath("(//div/ul/li/a[@data-original-title='Goal'])[last()]"),"Goal", 30);
	    	
	    	 try {
	    		 WebElement goal = driver.findElement(By.xpath("//div/span[text()='Goal']"));
	    		 if (goal.isDisplayed()) {
					logger.info("Goal Page opened succesfully");
				}
	    	 }
			 catch (Exception e) {
				// TODO: handle exception
				logger.info("Goal Page not opened succesfully");
			}
	    	 
	     }
	     public void clickOnCompanyDirectory ()
	     {		staticWait(2000);
	     click(By.xpath("(//div/ul/li/a[@data-original-title='Company Directory '])[last()]"),"Company Directory ", 30);
	    	
	    	 try {
	    		 WebElement companyDirectory  = driver.findElement(By.xpath("//div/span[text()='Company Directory ']"));
	    		 if (companyDirectory.isDisplayed()) {
					logger.info("Company Directory  Page opened succesfully");
				}
	    	 }
			 catch (Exception e) {
				// TODO: handle exception
				logger.info("Company Directory  Page not opened succesfully");
			}
	    	 
	     }
	     
	     public void clickOnCompanyNotifications ()
	     {		staticWait(2000);
	     click(By.xpath("(//div/ul/li/a[@data-original-title='Company Notifications'])[last()]"),"Company Notifications ", 30);
	    	
	    	 try {
	    		 WebElement companyNotifications  = driver.findElement(By.xpath("//div/span[text()='Notification']"));
	    		 if (companyNotifications.isDisplayed()) {
					logger.info("Company Notifications  Page opened succesfully");
				}
	    	 }
			 catch (Exception e) {
				// TODO: handle exception
				logger.info("Company Notifications  Page not opened succesfully");
			}
	    	 
	     }
	     
	     public void clickOnPerformanceReviewOfContextMenu ()
	     {		staticWait(2000);
	     click(By.xpath("(//div/ul/li/a[@data-original-title='Performance Review'])[last()]"),"Performance Review Of Context menu", 30);
	    	
	    	 try {
	    		 WebElement performanceReview  = driver.findElement(By.xpath("//div/span[text()='Performance Review']"));
	    		 if (performanceReview.isDisplayed()) {
					logger.info("Performance Review Page opened succesfully");
				}
	    	 }
			 catch (Exception e) {
				// TODO: handle exception
				logger.info("Performance Review Page not opened succesfully");
			}
	    	 
	     }
	     public void clickOnCompanySetup()
	     {		staticWait(2000);
	     click(By.xpath("(//div/ul/li/a[@data-original-title='Company Setup'])[last()]"),"Company Setup", 30);
	    	
	    	 try {
	    		 WebElement companySetup  = driver.findElement(By.xpath("//div/span[text()='Company Setup']"));
	    		 if (companySetup.isDisplayed()) {
					logger.info("Company Setup Page opened succesfully");
				}
	    	 }
			 catch (Exception e) {
				// TODO: handle exception
				logger.info("Company Setup Page not opened succesfully");
			}    	 
	     }
	     public void clickOnPerformanceReviewReport()
	     {		staticWait(2000);
	     click(By.xpath("(//div/ul/li/a[@data-original-title='Performance Review Report'])[last()]"),"Performance Review Report", 30);
	    	
	    	 try {
	    		 WebElement performanceReviewReport  = driver.findElement(By.xpath("//div/span[text()='Skill Report']"));
	    		 if (performanceReviewReport.isDisplayed()) {
					logger.info("Skill Report Page opened succesfully");
				}
	    	 }
			 catch (Exception e) {
				// TODO: handle exception
				logger.info("Skill Report Page not opened succesfully");
			}    	 
	     }
	     public void clickOnStorage()
	     {		staticWait(2000);
	     click(By.xpath("(//div/ul/li/a[@data-original-title='Storage'])[last()]"),"Storage", 30);
	    	
	    	 try {
	    		 WebElement storage  = driver.findElement(By.xpath("//div/span[text()='Manage Storage']"));
	    		 if (storage.isDisplayed()) {
					logger.info("Manage Storage Page opened succesfully");
				}
	    	 }
			 catch (Exception e) {
				// TODO: handle exception
				logger.info("Manage Storage Page not opened succesfully");
			}    	 
	     }
}
