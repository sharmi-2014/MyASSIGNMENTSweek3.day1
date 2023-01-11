package week3.day1;
import java.time.Duration;
import java.lang.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class EditLead {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		 ChromeOptions option = new ChromeOptions();
		    option.addArguments("--disable-notifications");

		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    driver.findElement(By.xpath("//div[@id='label']/a")).click();
		//driver.findElement(By.xpath("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sharmila");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//driver.findElement(By.xpath("")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='11337']")).click();
		String title=driver.getTitle();
		if(title.contains("view lead")) {
			System.out.println("yes,view lead");
		}
			else  {
				System.out.println("no");
			}
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CTS");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.close();
		}
			
		
						
	}



