package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver1;
	
	@FindBy(xpath="//textarea[@id='APjFqb']")
	private WebElement search;
	
	public void enterText(String text) {
		
		search.clear();
		
		search.sendKeys(text);
	}
	
	
	
	
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver1=driver;
		PageFactory.initElements(driver, this);
	}
}
