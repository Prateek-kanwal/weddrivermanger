package WebDrivermanger.weddrivermanger;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
 /* @Test
  public void f() {
	  ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		// Navigate to the demoqa website
		driver.get("https://www.demoqa.com");
		
		driver.quit();
  }
 */ 
	/*  @Test
  public void f1() {
	  
	  String test="Prateek Kanwal Automation Testing";
	  String strArray[] = test.split(" ");


	  for(int i=0;i<strArray.length;i++)
	  {
System.out.println(strArray[i]);
	  {
	  }
  }
	  
	  String string = "Prateek Kanwal Automation Testing";

	  char[] chars = string.toCharArray();
	  Set<Character> charSet = new LinkedHashSet<Character>();
	  for (char c : chars) {
	      charSet.add(c);
	  }

	  StringBuilder sb = new StringBuilder();
	  for (Character character : charSet) {
	      sb.append(character);
	  }
	  System.out.println(sb.toString());



      
      
}
*/
  
/*@Test
public void f2() {
	 ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com");
		List<WebElement> list= driver.findElements(By.xpath("//input[@name='q']"));
	Iterator it=list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());		
	}
	driver.close();
}



@Test
public void test1() {
	
	ChromeOptions chromeoption = new ChromeOptions();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(chromeoption);
	driver.get("https://www.guru99.com/click-on-image-in-selenium.html");
	driver.findElement(By.xpath("//img[@alt=\"Guru99\" and @width=\"300\" and @class=\"custom-logo lazyloaded\"]")).click();
	driver.close();	
}

*/
/*
	@Test
public void test2() {	
	
	ChromeOptions chromeoption = new ChromeOptions();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(chromeoption);
	driver.get("https://www.google.co.in/");
	WebElement input=driver.findElement(By.xpath("//input[@name=\"q\"]"));
	
	Actions action = new Actions(driver);
	
	action.moveToElement(input).click().sendKeys("Test").contextClick().build().perform();
	driver.close();
	
}
*/
/*public void test3() {	
	
	ChromeOptions chromeoption = new ChromeOptions();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(chromeoption);
	driver.get("https://www.google.co.in/");
	WebElement input=driver.findElement(By.xpath("//input[@name=\"q\"]"));
	
	Actions action = new Actions(driver);
	
	action.moveToElement(input).click().sendKeys("Test").contextClick().build().perform();
	driver.close();
	
}
*/
@Test

public void test4() throws IOException {
	
	Properties prop= new Properties();
	FileInputStream file= new FileInputStream(new File("C:\\Users\\Ishan\\Desktop\\Prateek\\ECLIPSE WORKSPACE\\weddrivermanger\\Config\\Testing.properties"));

	prop.load(file);
	
	System.out.println(prop.getProperty("Userid"));
	
}
}
  