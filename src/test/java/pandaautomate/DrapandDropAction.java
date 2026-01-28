package pandaautomate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapandDropAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://vinothqaacademy.com/mouse-event/");
        driver.manage().window().maximize();
        //driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
        // Double Click
        Actions act= new Actions(driver);
        WebElement drag= driver.findElement(By.xpath("//div[@class='draggable']"));
        WebElement drop= driver.findElement(By.xpath("//div[@class='droppable']"));
        
        act.dragAndDrop(drag, drop).perform();
        Thread.sleep(2000);
        driver.quit();
        
        
	}

}
