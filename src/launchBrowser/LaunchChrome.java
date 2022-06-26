package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgera\\QA Feb 2022-Selenium\\1st_Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	
	
}
