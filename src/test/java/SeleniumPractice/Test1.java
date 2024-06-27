package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.HomePage;



public class Test1 {
	
	String name=null;
	@BeforeMethod
	@Parameters("Chrome")
	public void setUp(@Optional("Chrome") String Browser) {
		DriverManager.setDriver(Browser);
		System.out.println(name);
	}
	@Test
	public void test1() {
		WebDriver driver=DriverManager.getDriver();
		driver.get("https://google.com");
		
		HomePage h=new HomePage(driver);
		h.enterText("flipkart.com");
	}
    @AfterMethod
	public void tearUp() {
		DriverManager.quitDriver();
	}
}
