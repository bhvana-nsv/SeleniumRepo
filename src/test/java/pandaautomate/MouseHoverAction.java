package pandaautomate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  ChromeDriver driver = new ChromeDriver();
	        driver.navigate().to("https://vinothqaacademy.com/tutorials/");
	        driver.manage().window().maximize();
	        //driver.getCurrentUrl();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement demo=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[7]/a"));
	        
	        WebElement button=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[7]/ul/li[1]/a/text()]"));
	        
	        Actions act= new Actions(driver);
	        
	        act.moveToElement(demo).moveToElement(button).perform();
	         
	        Thread.sleep(3000);
	        driver.quit();
	           
	 }

}
