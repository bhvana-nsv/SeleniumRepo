package pandaautomate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException 
	{ 
		ChromeDriver driver = new ChromeDriver();
		 driver.navigate().to("https://demo.automationtesting.in/Register.html");
	     driver.manage().window().maximize();
	     
		driver.get("https://demo.automationtesting.in/Alerts.html");
		  driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
	        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	        
	        Alert myalert= driver.switchTo().alert();
	        myalert.getText();
	        Thread.sleep(3000);
	        myalert.sendKeys("Welcome to Automation");
	        myalert.accept();
	        Thread.sleep(3000);
		
	}
}
