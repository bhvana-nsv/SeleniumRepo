package pandaautomate;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.navigate().to("https://demo.automationtesting.in/Datepicker.html");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[@id='datepicker1']")).click(); 
	     driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	     driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	     //driver.findElement(By.xpath("//a[text()='6']")).click(); 
	     driver.findElement(By.xpath("(//a[@class='ui-state-default'])[8]")).click(); 
	     Thread.sleep(2000); 
	     driver.quit(); 
		 
	} 

}
