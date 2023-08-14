package interview_questions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ElementsPresentOnWebPage {

	public static void main(String[] args) {

		/**
		 * check elements displayed or selected or enabled on the web page
		 */

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//*[text()='My Account'])[1]")).click();
		driver.findElement(By.xpath("(//*[text()='Register'])[position()=1]")).click();
		
		//check web element is displayed on web page
		WebElement webEle=driver.findElement(By.xpath("(//*[contains(text(), 'Register Account')])[2]"));
		Boolean elestatus=webEle.isDisplayed();
		if(elestatus==true)
			System.out.println("web element is displyed on the web page");
		else
			System.out.println("web element is not displayed on the web page");
		

		// checking the web element is enabled
		WebElement continueBtn = driver.findElement(By.xpath("//*[@type='submit']"));
		Boolean btnStatus = continueBtn.isEnabled();
		//Assert.assertTrue(btnStatus, "Button is enabled");
		if (btnStatus == true)
			System.out.println("Button is enabled");
		else
			System.out.println("Button is disabled");

		// checking the web element is selected
		WebElement eleSelected = driver
				.findElement(By.xpath("(//*[@class='col-sm-10']//*[@name='newsletter'])[position()=2]"));
		Boolean eleStatus = eleSelected.isSelected();
		//Assert.assertTrue(eleStatus, "element is selected");
		if (eleStatus == true)
			System.out.println("element is selected");
		else
			System.out.println("element is not selected");

		// close browser
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
