package eCommarceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Snapdeal {
  @Test
  public void snapdealtest() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening snapdeal", true);
	  driver.get("https://www.snapdeal.com/");
	  Thread.sleep(7000);
	  driver.close(); 

  }
}
