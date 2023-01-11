package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

public static void main(String[] args) {
		
	
	//browser notification
    ChromeOptions option = new ChromeOptions();
    option.addArguments("--disable-notifications");
    //will open chrome browser
    ChromeDriver driver=new ChromeDriver(option);
    //maximize the window
    driver.manage().window().maximize();
    //load the url
    driver.get("http://en-gb.facebook.com/") ;
		
	//browser notification
   
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sharmila");
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Aravind");
    driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("sarmila.eee@gmail.com");
    driver.findElement(By.xpath("//div[text()='Re-enter email address']/following-sibling::input")).sendKeys("sarmila.eee@gmail.com");
    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("sarmi");
    driver.findElement(By.xpath("//option[text()='26']")).click();
    driver.findElement(By.xpath("//option[text()='May']")).click();
    driver.findElement(By.xpath("//option[text()='1988']")).click();
    driver.findElement(By.xpath("//label[text()='Female']")).click();
    
    
    
}
}
    