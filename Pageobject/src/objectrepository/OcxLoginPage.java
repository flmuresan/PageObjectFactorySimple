package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OcxLoginPage {
	
	WebDriver driver;
	public  OcxLoginPage (WebDriver driver)
	{
		this.driver=driver;
	}
	//this was the constructor (the one above)
	By username = By.xpath(".//*[@id='username']");
	By password = By.xpath(".//*[@id='password']");
	By btnLogIn = By.xpath(".//*[@class='login']//*[@class='form-validate form-horizontal well']//*[@type='submit']");
	By btnHome = By.xpath(".//*[@class='row-fluid']//li[2]//a[@class='pathway']");

	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement btnLogIn()
	{
		return driver.findElement(btnLogIn);
	}
	
	public WebElement btnHome()
	{
		return driver.findElement(btnHome);
	}
}
