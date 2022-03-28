package scripts;
import java.util.List;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//this is added as  part of git demo
public class FlipkartAllLinks {
	WebDriver driver;
  @Test
  public void FlipkartLinks() {
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
      List<WebElement> flipkartlinks = driver.findElements(By.tagName("a"));
	  for(WebElement element:flipkartlinks){
		   System.out.println(element.getText()+"-"+element.getAttribute("href"));
	   }
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am in before method");
	  String browser;
	  System.setProperty("webdriver.chrome.driver","tests\\resourses\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

 
}
