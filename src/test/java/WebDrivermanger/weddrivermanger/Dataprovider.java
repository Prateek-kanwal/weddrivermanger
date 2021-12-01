package WebDrivermanger.weddrivermanger;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	static WebDriver  driver;
	
	@BeforeTest
	void before() {
		 ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver(chromeOptions);
			driver.get("https://www.google.com");
		
	}
	 @Test(dataProvider="SearchProvider")
	    public void testMethod(String author,String searchKey,String test) throws InterruptedException{
	    {
	        WebElement searchText = driver.findElement(By.name("q"));
	        //search value in google searchbox
	        searchText.sendKeys(test);
	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	        Thread.sleep(3000);
	        String testValue = searchText.getAttribute("value");
	        System.out.println(testValue +"::::"+test);
	        searchText.clear();
	        //Verify if the value in google search box is correct
	        Assert.assertTrue(testValue.equalsIgnoreCase(test));
	    }
	    }
	    /**
	     * @return Object[][] where first column contains 'author'
	     * and second column contains 'searchKey'
	     */

	    @DataProvider(name="SearchProvider")
	    public Object[][] getDataFromDataprovider(){
	    return new Object[][] 
	    	{
	            { "Guru99", "India" ,"test1"},
	            { "Krishna", "UK" ,"test1"},
	            { "Bhupesh", "USA" ,"test1"}
	        };

	    }
	    
	    @AfterTest
	    void after() {
	    	driver.close();
	    	
	    }
}
