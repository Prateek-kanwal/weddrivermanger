package WebDrivermanger.weddrivermanger;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent{
  @Test
  public void f() {
	  ExtentReports extent = new ExtentReports();
	  ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	  extent.attachReporter(spark);
	  extent.createTest("MyFirstTest")
	    .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
	  extent.flush();
  }
  
  
  
}
