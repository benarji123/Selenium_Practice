package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pareant {
	WebDriver driver;
	int i=9;
	public void setUp() {
	 driver=new ChromeDriver();
	 driver.get("https://google.com");
	}

}
