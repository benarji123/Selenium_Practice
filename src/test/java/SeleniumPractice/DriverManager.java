package SeleniumPractice;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	private static ThreadLocal<WebDriver>driverThreadLoacl=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return driverThreadLoacl.get();
	}
   public static void setDriver(String browser ) {
	   WebDriver driver=DriverFactory.createBrowser(browser);
	   driverThreadLoacl.set(driver);
	   
   }
   
   public static void quitDriver() {
	  WebDriver driver= getDriver();
	  if(driver!=null) {
		  driver.quit();
		  driverThreadLoacl.remove();
	  }
   }
}
