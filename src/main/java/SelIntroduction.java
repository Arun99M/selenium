
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoking Browser 
		//chrome- ChromeDriver ->Methods close
		//Firefox - FirefoxDriver ->methods close
		//safari SafariDriver ->
		//WebDriver 
		
		//We need to create the object of the class to access the methods present in the class.
			//1. ChromeDriver driver = new ChromeDriver();
			// 1.1 driver object here as access all the methods of chrome driver
		
			//2. WebDriver driver = new ChrimeDriver();
			//2.1 driver object here has access to the methods of Chrome driver which are defined in Web Driver interface
		
		//why web driver using instead of chrome driver answer web driver is interface and chrome driver is implementing and we have to refer only web driver implemented methods  
		
		
		
		//webdriver.chrome.driver->value of path
		WebDriver driver = new ChromeDriver(); 
		
		//chromedriver .exe->Chrome browser
		System.setProperty("Webdriver.chrome.driver", "C:\\Selenium docs\\chromedriver-win64\\chromedriver-win64.exe");
		
		//Firefox launch
		
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("Webdriver.gecko.driver", "C:\\Selenium docs\\chromedriver-win64\\geckodriver-v0.33.0-win64.exe");

		
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();  // current windows will close
		driver.quit(); //all associated windows will close
		
		
		
	}

}
