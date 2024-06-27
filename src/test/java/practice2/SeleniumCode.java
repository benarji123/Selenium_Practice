package practice2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumCode {
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:google.com");
		driver.manage().window().maximize();
	    List<WebElement> els=driver.findElements(By.tagName("a"));
	    
//	    for(WebElement el: els) {
//	    	String url=el.getAttribute("href");
//	    	URL link=new URL(url);
//	    	HttpURLConnection  connection=(HttpURLConnection)link.openConnection();
//	    	
//	    	connection.setConnectTimeout(6);
//	    	connection.connect();
//	    	
//	    	if(connection.getResponseCode()==200) {
//	    		System.out.println(connection.getResponseMessage()+"--"+ "is broken link");
//	    	}
//	       
//	    }
//	    }
	    
	    File f =new File("file.txt");
//	    BufferedReader br=new BufferedReader(new FileReader(f));
//	    String s;
//	    while((s=br.readLine())!=null) {
//	    	System.out.println(s);
//	    }
	
	    
//	    FileReader fr=new FileReader(f);
//	    int i;
//	  while ((i= fr.read())!=-1){
//		  System.out.println((char)i);
//	  }
	    
//	    Scanner s =new Scanner(f);
//	     while(s.hasNextLine()) {
//	    	 System.err.println(s.nextLine());
//	     }
//		
		
		
		
		
//		WebDriverWait wait=new WebDriverWait(driver,java.time.Duration.ofSeconds(5));
//		WebElement el=driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
//		wait.until(ExpectedConditions.visibilityOf(el));
//		el.sendKeys("flipkart");
		
//		FluentWait<WebDriver> w=new FluentWait<WebDriver>(driver);
//		w.withTimeout(java.time.Duration.ofSeconds(5));
//		w.pollingEvery(Duration.ofSeconds(3));
//		w.ignoring(NoSuchElementException.class);
//		
//		w.until(ExpectedConditions.visibilityOf(el));
//		
//		TakesScreenshot s= (TakesScreenshot)driver;
//		File f=s.getScreenshotAs(OutputType.FILE);
//		
////		String projectpath=System.getProperty("user.dir");
////		String d=projectpath+File.pathSeparator+"ScreenShots"+File.pathSeparator+"Sreenshot.png";
////		System.out.println(d);
//		
//		Path projectpath=Paths.get(System.getProperty("user.dir"));
//	 Path sreenshotpath=projectpath.resolve("ScreenShots");
//	Path destination=sreenshotpath.resolve("ScreenShots.png");
//	System.out.println(destination.toString());
//	 
//	 if(Files.notExists(sreenshotpath)) {
//		  Files.createDirectories(sreenshotpath);
//	 }
//	 
//	 
//	//File destination=new File(d);
//	 Files.copy(f.toPath(),destination);
//	//	FileUtils.copyDirectory();
//		driver.quit();
	   
			System.out.println("Hello World");
			String name = "aabbccdd";
	HashSet<Character> s=new HashSet<Character>();
			for(int i=0;i<name.length();i++){
			    s.add(name.charAt(i)) ;
			    
			}
			
			for(char c:s){https://www.onlinegdb.com/online_java_compiler#tab-stderr
			    System.out.print(c);
			    
			}
			  
			   
		
			}
		
	

}
