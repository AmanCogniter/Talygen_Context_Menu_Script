package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class HiringPage extends WebBasePage{
	WebDriver driver ;
	public HiringPage(WebDriver driver) {
		super(driver, "HiringPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of Hiring Page
	 */
     public void clickOnHiring()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Hiring']/span"),"Hiring", 30);
    	 
     }
     public void clickOnCandidateListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Candidate List']"),"Candidate List", 30);
    	
    	 try {
    		 WebElement candidateList = driver.findElement(By.xpath("//div/span[text()='Candidate List']"));
    		 if (candidateList.isDisplayed()) {
				logger.info("Candidate List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Candidate List Page not opened succesfully");
		}
     }
     public void clickOnManageTalentPool()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage Talent Pool']"),"Manage Talent Pool", 30);
    	
    	 try {
    		 WebElement manageTalentPool = driver.findElement(By.xpath("//div/span[text()='Add Talent Pool']"));
    		 if (manageTalentPool.isDisplayed()) {
				logger.info("Manage Talent Pool Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Talent Pool Page not opened succesfully");
		}
     }
     public void clickOnManageCandidate()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage Candidate']"),"Manage Candidate", 30);
    	
    	 try {
    		 WebElement manageCandidate = driver.findElement(By.xpath("//div/span[text()='Add Candidate']"));
    		 if (manageCandidate.isDisplayed()) {
				logger.info("Add Candidate Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Candidate Page not opened succesfully");
		}
     }
     public void clickOnCandidateList()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Candidate List'])[last()]"),"Candidate List", 30);
    	
    	 try {
    		 WebElement candidateList = driver.findElement(By.xpath("//div/span[text()='Candidate List']"));
    		 if (candidateList.isDisplayed()) {
				logger.info("Candidate List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Candidate List Page not opened succesfully");
		}
     }
     public void clickOnManageJob()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Job'])[last()]"),"Manage Job", 30);
    	
    	 try {
    		 WebElement manageJob = driver.findElement(By.xpath("//div/span[text()='Add a Job']"));
    		 if (manageJob.isDisplayed()) {
				logger.info("Add a Job Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add a Job Page not opened succesfully");
		}
     }
     public void clickOnJobPostReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Job Post Report'])[last()]"),"Job Post Report", 30);
    	
    	 try {
    		 WebElement jobPostReport = driver.findElement(By.xpath("//div/span[text()='Hiring Reports']"));
    		 if (jobPostReport.isDisplayed()) {
				logger.info("Hiring Reports Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Hiring Reports Page not opened succesfully");
		}
     }
}
