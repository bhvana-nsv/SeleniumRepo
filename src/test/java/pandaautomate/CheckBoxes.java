package pandaautomate;

import java.util.List;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes{

	public static void main(String[] args) throws InterruptedException 
	{      // TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Harhar");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Vriihs");
        driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("V.P.O-nbsdhjdbjh,Ambhsgdvg,134234");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sdhgdhg@gmail.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8905899587");
        
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        Thread.sleep(3000);
        
        for(int i=1;i<3;i++) 
        {
        	checkboxes.get(i).click();
        }
        Thread.sleep(3000);
        
        for(int i=1;i<checkboxes.size();i++) 
        {
        	if(checkboxes.get(i).isSelected()) {
        checkboxes.get(i).click();
        	}
        }
        driver.quit();
       
	}
 
}
