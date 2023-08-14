package interview_questions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicPageValidations {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//capture the title
		String actualTitle=driver.getTitle();
		String expectedTitle="Your Store";
		Assert.assertEquals(actualTitle, expectedTitle);
		
		// capture the url
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://naveenautomationlabs.com/opencart/";
		Assert.assertEquals(actualUrl, expectedUrl);
		
		// capture the page resource
		String actualPageSource=driver.getPageSource();
		System.out.println(actualPageSource);
		
		
		//closing the browser
		Thread.sleep(5000);
		driver.close();
		
		
	
		
		
		
		
		
		
		
	}
	

}
