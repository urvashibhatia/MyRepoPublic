import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author urvashi
 *
 */
public class Demo 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			System.out.println("hi there\n");
	        System.setProperty("webdriver.chrome.driver", 
	        "C:\\Users\\urvas\\Desktop\\Job and work\\java_selenium\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        var urvashi = "Urvashi hi hai";
	       /* driver.get("https://www.google.co.in");*/
	        /*driver.get("https://www.google.com");*/
	       /* System.out.println(driver.getTitle());*/
	        //driver.get("https://www.lowes.com");;
			//driver.findElement(By.linkText("Order Status")).click();
	        //driver.findElement(By.id("email-input")).sendKeys("UrvashiBhatia@gmail.com");
	        //driver.findElement(By.xpath("//*[@id=\'email-input\']")).sendKeys(urvashi);
	        
	        //*[@id="emailSignUpDialog"]/div[2]/div/div/div/button/i
	        //driver.findElement(By.className("close")).click();
			
			/*Alert alert = driver.switchTo().alert();
			alert.dismiss();
			driver.close();*/
		}
		catch (Exception ex)
		{
			throw ex;
		}
		finally
		{
		}
	}
}


