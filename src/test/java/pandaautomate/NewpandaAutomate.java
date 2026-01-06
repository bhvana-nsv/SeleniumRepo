package pandaautomate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewpandaAutomate {
	

	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://automationpanda.com/");
        driver.manage().window().maximize();
        //driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("input[autocomplete='email']")).sendKeys("testinghd@gmail.com");
        driver.findElement(By.cssSelector("button.wp-block-button__link")).click();
        Thread.sleep(3000);
        driver.get("https://automationpanda.com/about/");
        driver.findElement(By.cssSelector("input[autocomplete='email']")).sendKeys("hfsuyrfjhe@gmail.com");
        driver.findElement(By.cssSelector("button.wp-block-button__link")).click(); 
        driver.findElement(By.xpath("//img[@alt='Automation Testing Blogs']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@href='https://automationpanda.com/contact/'])[2]")).click();
        driver.findElement(By.xpath("//input[@name='g3-name']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='g3-email']")).sendKeys("jgjhjhsjjhguy@gmail.com");
        driver.findElement(By.xpath("//textarea[@name='g3-message']")).sendKeys("Tested this form for QA");
        driver.findElement(By.cssSelector("button.wp-block-button__link")).click(); 
        driver.navigate().back();
        driver.navigate().forward();
        driver.findElement(By.xpath("//input[@name='g3-name']")).sendKeys("testing");
        driver.findElement(By.xpath("//input[@id='g3-email']")).sendKeys("jdfhjthy@gmail.com");
        driver.findElement(By.xpath("//textarea[@name='g3-message']")).sendKeys("Tested this form only for QA");
        driver.findElement(By.cssSelector("button.wp-block-button__link")).click(); 
        
        Thread.sleep(5000);
        //driver.findElement(null)
        driver.quit();
	    }
}
