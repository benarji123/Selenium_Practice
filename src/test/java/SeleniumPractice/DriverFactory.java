package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	
	
	public static WebDriver createBrowser(String browserType) {
		
	   WebDriver driver=null;
		if(browserType.equalsIgnoreCase("Chrome")) {
			 
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
		}
		else if(browserType.equalsIgnoreCase("Edge")) {
			 
		   driver=new EdgeDriver();
		   driver.manage().window().maximize();
		}else {
			throw new IllegalArgumentException("Browser not supported");
		}
		
		return driver;
	}
	

}
