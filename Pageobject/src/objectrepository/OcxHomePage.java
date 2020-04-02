package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OcxHomePage {
	
	WebDriver driver;
	public  OcxHomePage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	By inputSearchKeyword = By.xpath(".//*[@id='input_search211']");
	By btnSearch = By.xpath(".//*[@class='search_buttons']//*[@type='submit']");
	
	public WebElement inputSearchKeyword ()
	{
		return driver.findElement(inputSearchKeyword);
	}
	
	public WebElement btnSearch()
	{
		return driver.findElement(btnSearch);
	}
}

