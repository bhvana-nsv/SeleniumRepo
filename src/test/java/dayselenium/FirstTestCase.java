package dayselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase {
	
	int a=10;
	void display(){
	   System.out.println("Number ="+a);
	}

	public static void main(String[] args) {
		
		//FireFoxDriver driver2 = new FireFoxDriver();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.partialLinkText("Reg")).click();
		
		
		  //FirstTestCase num =new FirstTestCase();
		String givetitle= driver.getTitle();
		if(givetitle.equals("Register"))
			
		{
			System.out.println("Test Passed");
 		}
		else {
			System.out.println("Test Failed");
			
		}
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input*[@id='aswift_0']"));
		/*driver.findElement(By.linkText("WebTable")).click();
		driver.findElement(By.cssSelector("form.form-horizontal"));
		driver.findElement(By.cssSelector("img#imagetrgt"));
		driver.findElement(By.cssSelector("form[ng-submit='createdata()']"));
		driver.manage().window().maximize();*/ 
		driver.quit();
	
	}

} 
