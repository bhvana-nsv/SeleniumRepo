package pandaautomate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {   

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.navigate().to("https://demo.automationtesting.in/Register.html");
	     driver.manage().window().maximize();
	     
	     WebElement drpdwnEle =driver.findElement(By.xpath("//select[@id='Skills']"));
	     Select drpSkill= new Select(drpdwnEle);
	      
	     //drpSkill.selectByIndex(10);
	     drpSkill.selectByValue("Client Support");
	     Thread.sleep(3000);
	     
	     driver.quit();
	}

}
