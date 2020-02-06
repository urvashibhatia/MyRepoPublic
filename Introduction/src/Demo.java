import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author urvashi
 *
 */
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi there\n");

        System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\urvas\\Desktop\\Job and work\\java_selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       /* driver.get("https://www.google.co.in");*/
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

	}

}
