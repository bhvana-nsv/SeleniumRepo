package pandaautomate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          //Handling Frames and iFrames
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.navigate().to("https://vinothqaacademy.com/iframe/");
	     driver.manage().window().maximize();
	     
	     WebElement frame=driver.findElement(By.xpath("//iframe[@src='https://vinothqaacademy.com/webtable/']")); //passed frame as a Web element
	     
	     driver.switchTo().frame(frame);
	     
	     driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Haermmhan");
	     //driver.findElement(By.xpath("//input[@placeholder='Role']")).sendKeys("QA Tester");
	     Thread.sleep(3000);
             
	     List <WebElement> checkboxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
	     
	     for(int i=0;i<10;i++) 
	        { 
	        	checkboxes.get(i).click();
	        }  
	     Thread.sleep(3000);
	     
	    //driver.switchTo().defaultContent();
	     driver.quit();
	     
	     }
	
}

