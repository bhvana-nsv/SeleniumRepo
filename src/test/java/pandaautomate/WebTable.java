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
	     
	     int rows= driver.findElements(By.xpath("//table[@id='myTable']//tr")).size();
	     System.out.println("Number of rows:" +rows);
	     
	     int col= driver.findElements(By.xpath("//table[@id='myTable']//th")).size();
	     System.out.println("Number of Col:" +col);
	    
	     driver.findElement(By.xpath("//input[@id='nameInput']")).sendKeys("Hhsgdub Jasue");
	     driver.findElement(By.xpath("//input[@id='roleInput']")).sendKeys("Project Manager"); 
	     driver.findElement(By.xpath("//input[@id='emailInput']")).sendKeys("shhgdj@gm.com");
	     driver.findElement(By.xpath("//input[@id='locationInput']")).sendKeys("New york");
	     driver.findElement(By.xpath("//input[@id='departmentInput']")).sendKeys("QA Testing");
	     driver.findElement(By.xpath("//button[@id='addBtn']")).click(); 
	     
	     
	     List <WebElement> checkboxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
	      
	     for(int i=1;i<6;i++) 
	        {  
	        	checkboxes.get(i).click();
	        } 
	     
	     for(int r=1;r<=rows;r++)
	     {
	    	for(int c=2;c<=col;c++)
	    	{
	    		String value= driver.findElement(By.xpath("//table[@id='myTable']//tr["+r+"]//td["+c+"]")).getText();
	    		System.out.println(value);
	    	}
	     }
	     
	     Thread.sleep(3000); 
	     driver.quit(); 
	 }

}

 