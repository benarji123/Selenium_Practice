package SeleniumPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Child extends Pareant{

	WebDriver driver;
	int i=8;
	
	
	@Test
	public void test() {
		setUp();
		System.out.println(i);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("flipkart");
		
		
	}
}
