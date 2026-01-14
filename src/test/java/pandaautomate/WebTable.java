package pandaautomate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable { 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.navigate().to("https://vinothqaacademy.com/webtable/");
	     driver.manage().window().maximize();
	     
	     int rows= driver.findElements(By.xpath("//table[@id=\"myTable\"]//tr")).size();
	     System.out.println("Number of rows:" +rows);
	     
	     int col= driver.findElements(By.xpath("//table[@id=\"myTable\"]//th")).size();
	     System.out.println("Number of Col:" +col);
	     List <WebElement> checkboxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
	     
	     for(int r=2;r<=rows;r++)
	     {
	    	for(int c=1;c<=col;c++)
	    	{
	    		driver.findElement(By.xpath("//table[@id=\"myTable\"]//tr["+r+"]//th[c]")).getText();
	    		//System.out.println("")
	    	}
	     }
		     
		     for(int i=1;i<10;i++) 
		        {  
		        	checkboxes.get(i).click();
		        } 
		      
	     Thread.sleep(3000);
	     driver.quit();
	}

}

 