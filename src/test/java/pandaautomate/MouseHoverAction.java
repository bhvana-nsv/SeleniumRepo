package pandaautomate;

import java.time.Duration;
//import java.util.List;

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
	        Thread.sleep(2000);
	        // Mouse Hover Action
	        Actions act= new Actions(driver);
	        WebElement demo=driver.findElement(By.xpath("(//a[text()='Demo Sites'])[2]"));	        
	        WebElement button=driver.findElement(By.xpath("(//a[text()='Practice Automation'])[2]")); 
	        WebElement Mouse= driver.findElement(By.xpath("(//a[text()='Mouse Event'])[2]"));
	        act.moveToElement(demo).moveToElement(button).moveToElement(Mouse).click().build().perform(); 
	         
	        Thread.sleep(3000);
	        driver.quit();
	        
	 }
}
