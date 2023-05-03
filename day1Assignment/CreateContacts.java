package week2.day1Assignment;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacts 
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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Prem");
		driver.findElement(By.id("lastNameField")).sendKeys("Anand");
		driver.findElement(By.name("submitButton")).click();
		WebElement firstName = driver.findElement(By.id("viewContact_firstName_sp"));
		String text1 = firstName.getText();
		System.out.println(text1);
		String title1=driver.getTitle();
		System.out.println(title1);
        driver.close();
		}
	}
