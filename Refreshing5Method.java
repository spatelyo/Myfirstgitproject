package scripts;
//5th assign. 13feb
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Refreshing5Method {
	WebDriver driver;
  @Test
  public void RefreshMethods() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  Thread.sleep(3000);
	  //1
	  driver.navigate().refresh();
	  //2
	  Actions actions=new Actions(driver);
	  actions.sendKeys(Keys.F5);
	  //3
	  JavascriptExecutor jse= (JavascriptExecutor) driver;
	  jse.executeScript("window.location.reload();");
	  //4
	  driver.get(driver.getCurrentUrl());
	  //5
	  driver.navigate().to(driver.getCurrentUrl());
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am in before method");
	  System.setProperty("webdriver.chrome.driver","tests\\resourses\\chromedriver.exe");
			 driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
