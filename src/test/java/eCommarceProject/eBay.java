package eCommarceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class eBay {
  @Test
  public void eBaytest() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening eBay", true);
	  driver.get("https://www.ebay.com/");
	  Thread.sleep(7000);
	  driver.close(); 
  }
}
