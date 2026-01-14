package pandaautomate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoDropdwn { 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.navigate().to("https://www.google.com/");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.name("q")).sendKeys("Selenium");
	     Thread.sleep(3000);
	      
	     List<WebElement> Autolist=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role='option']"));
	    
	     System.out.println(Autolist.size());
	     
	     for(int i=0;i<Autolist.size();i++)
	     {
	    	 System.out.println(Autolist.get(i).getText());
	    	 if(Autolist.get(i).getText().equals("Selenium"));
	    	 { 
	    		 Autolist.get(i).click(); 
	    		 break;
	    	 }
	     }
	     
	     Thread.sleep(5000);
	     driver.quit();  
	     
	}

}
