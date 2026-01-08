package pandaautomate;

import java.util.List;

import java.time.Duration;

import org.openqa.selenium.Alert;
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
        
        // using xpath finding elements and fill the  register form 
        
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Harhar"); //entering First name 
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Vriihs");  //Last name
        driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("V.P.O-nbsdhjdbjh,Ambhsgdvg,134234");  //Address
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sdhgdhg@gmail.com");   //email
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8905899587");         //Phone number
        // Using commands to handle checkboxes using different ways
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
        // Using alert command to accept 
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[@data-toggle='tab']")).click();
        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        //Using alert command to dismiss the pop-up 
        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        
      //Using prompt alert
        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        
        Alert myalert= driver.switchTo().alert();
        
        Thread.sleep(3000);
        myalert.sendKeys("Welcome to Automation");
        Thread.sleep(3000);
        myalert.accept();
        Thread.sleep(3000);
        
        driver.quit();
       
	 }
 
}
