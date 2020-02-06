import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
/*import org.openqa.selenium.ie.InternetExplorerDriver;*/

public class firefoxtestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver.driver","C:\\Users\\urvas\\Desktop\\Job and work\\java_selenium\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		/*System.setProperty("webdriver.ie.driver","C:\\Users\\urvas\\Desktop\\msedgedriver.exe");
		WebDriver driver = new InternetExplorerDriver();*/
		driver.get("http://google.com");
		
		

	}

}
