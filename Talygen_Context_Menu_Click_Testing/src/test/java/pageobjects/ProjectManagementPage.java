package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class ProjectManagementPage extends WebBasePage{
	WebDriver driver ;
	public ProjectManagementPage(WebDriver driver) {
		super(driver, "ProjectManagementPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for Context Menu click testing of Project Management
	 */
     public void clickOnProjectManagement()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Project Management']/span"),"Project Management", 30);
    	 
     }
     public void clickOnGlobalTask()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Global Task']"),"Global Task", 30);
    	
    	 try {
    		 WebElement manageGlobalTasks = driver.findElement(By.xpath("//div/span[text()='Manage Global Tasks']"));
    		 if (manageGlobalTasks.isDisplayed()) {
				logger.info("Manage Global Tasks Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Global Tasks Page not opened succesfully");
		}
     }
     public void clickOnProject()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Project'])[last()]"),"Project", 30);
    	
    	 try {
    		 WebElement project = driver.findElement(By.xpath("//div/span[text()='Manage Projects']"));
    		 if (project.isDisplayed()) {
				logger.info("Manage Projects Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Projects Page not opened succesfully");
		}
     }
     public void clickOnToDoList()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='To Do List'])[last()]"),"To Do List", 30);
    	
    	 try {
    		 WebElement toDoList = driver.findElement(By.xpath("//div/span[text()='Work Load']"));
    		 if (toDoList.isDisplayed()) {
				logger.info("Work Load Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Work Load Page not opened succesfully");
		}
     }
     public void clickOnTask()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Task'])[last()]"),"Task", 30);
    	
    	 try {
    		 WebElement task = driver.findElement(By.xpath("//div/span[text()='Manage Tasks']"));
    		 if (task.isDisplayed()) {
				logger.info("Manage Tasks Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Tasks Page not opened succesfully");
		}
     }
     public void clickOnGlobalTaskOfContextMenu()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Global Task'])[last()]"),"Global Task Of Context Menu", 30);
    	
    	 try {
    		 WebElement globalTask = driver.findElement(By.xpath("//div/span[text()='Manage Global Tasks']"));
    		 if (globalTask.isDisplayed()) {
				logger.info("Manage Global Tasks Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Global Tasks Page not opened succesfully");
		}
     }
     public void clickOnConfiguration()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Configuration'])[last()]"),"Configuration", 30);
    	
    	 try {
    		 WebElement configuration = driver.findElement(By.xpath("//div/span[text()='Configuration']"));
    		 if (configuration.isDisplayed()) {
				logger.info("Configuration Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Configuration Page not opened succesfully");
		}
     }
     public void clickOnUser()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='User'])[last()]"),"User", 30);
    	
    	 try {
    		 WebElement user = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Users')]"));
    		 if (user.isDisplayed()) {
				logger.info("Manage Users Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Users Page not opened succesfully");
		}
     }
     public void clickOnProjectReport()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Project Report'])[last()]"),"Project Report", 30);
    	
    	 try {
    		 WebElement projectReport = driver.findElement(By.xpath("//div/span[contains(text(),'Project Reports')]"));
    		 if (projectReport.isDisplayed()) {
				logger.info("Project Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Project Report Page not opened succesfully");
		}
     }
     public void clickOnResourceScheduling ()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Resource Scheduling '])[last()]"),"Resource Scheduling ", 30);
    	
    	 try {
    		 WebElement resourceScheduling  = driver.findElement(By.xpath("//div/h5[contains(text(),'Resource Filter')]"));
    		 if (resourceScheduling .isDisplayed()) {
				logger.info("Resource Scheduling  Page opened succesfully");
				driver.navigate().back();
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Resource Scheduling  Page not opened succesfully");
		}
     }
     public void clickOnProjectRequest()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Project Request'])[last()]"),"Project Request", 30);
    	
    	 try {
    		 WebElement projectRequest = driver.findElement(By.xpath("//div/span[contains(text(),'Project Request')]"));
    		 if (projectRequest.isDisplayed()) {
				logger.info("Project Request Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Project Request Page not opened succesfully");
		}
     }
     public void clickOnQuotes()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Quotes'])[last()]"),"Quotes", 30);
    	
    	 try {
    		 WebElement quotes = driver.findElement(By.xpath("//div/span[contains(text(),'Quotes')]"));
    		 if (quotes.isDisplayed()) {
				logger.info("Quotest Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Quotes Page not opened succesfully");
		}
     }
}
