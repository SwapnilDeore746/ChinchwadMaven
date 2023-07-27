package eCommarceProject;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajiotest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening ajio", false);
	  driver.get("https://www.ajio.com/");
	  Thread.sleep(7000);
	  driver.close();
  }
}
