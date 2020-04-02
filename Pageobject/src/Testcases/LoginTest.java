package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.OcxHomePage;
import objectrepository.OcxLoginPage;

public class LoginTest {
	
	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Florin Work\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ocx.lu/index.php/en/login-form?return=aHR0cHM6Ly9vY3gubHUvaW5kZXgucGhwL2VuL215LWFjY291bnQ=");
		
		//if you want to access any method from other class, you have to create an object of this class into your test case
		//driver has all the information on how to execute the test case in chrome browser 
		//if you want to pass the driver as an argument, in the same time,you have to have a constructor with a single argument (constructor can be found in OcxLoginPage)
		OcxLoginPage ocx = new OcxLoginPage(driver);
		
		ocx.username().sendKeys("hello");
		ocx.password().sendKeys("parola1");
		ocx.btnLogIn().click();
		ocx.btnHome().click();
		
		// we create the object for the home page so we can use the home page, where we also have the constructor
		
		OcxHomePage hpage =new OcxHomePage(driver);
		hpage.inputSearchKeyword().sendKeys("camera");
		hpage.btnSearch().click();
		
//		driver.quit();
		
	}
	

	

}
