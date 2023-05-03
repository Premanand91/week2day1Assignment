package week2.day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead
{

	public static void main(String[] args)
	{
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/login");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("username")).sendKeys("demosalesManager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     driver.findElement(By.partialLinkText("SFA")).click();
	     driver.findElement(By.linkText("Leads")).click();
	     driver.findElement(By.linkText("Create Lead")).click();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prem");	
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anand");
	     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sumeshkumar");
	     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	     driver.findElement(By.id("createLeadForm_description")).sendKeys("Learing Automation Testing");
         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Premanandmurugesan836@gmail.com");
         driver.findElement(By.name("submitButton")).click();
         
	}

}
