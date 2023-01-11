package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Learnxpath {


public static void main(String[] args) {
		
	
	//browser notification
    ChromeOptions option = new ChromeOptions();
    option.addArguments("--disable-notifications");
    //will open chrome browser
    ChromeDriver driver=new ChromeDriver(option);
    //maximize the window
    driver.manage().window().maximize();
    //load the url
    driver.get("http://leaftaps.com/opentaps/control/login") ;
		
	
	//browser notification
   
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
   
}
	
   
  
}