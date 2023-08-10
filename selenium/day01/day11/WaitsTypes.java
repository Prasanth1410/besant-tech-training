package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsTypes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationTestingB6\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		// Implicit wait - 
		
		// Once my dom structure is alive it will directly jump in finding the web element 
		
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		
		// Explict Wait - We need to create object for Webdriverwait 
		// If wait finds the web element in 5 seconds it will wait untill 10 seconds 
		// Rest of the 5 seconds will be skipped 
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.visibilityOf(login));
		 */

		
	
		username.sendKeys("standard_user");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
