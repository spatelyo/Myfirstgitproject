package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class DataEntryFormDemoqua {
	WebDriver driver;
  @Test
  public void DataEntryForm() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/automation-practice-form");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sweta");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Patel");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']")).sendKeys("swetapatel@gmail.com");
	  Thread.sleep(2000);
	
	  driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][2]")).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("123546");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	  Thread.sleep(2000);
	  Actions action = new Actions(driver); 
	  action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("24 June 1989").perform();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='subjectsInput' and @type='text']")).sendKeys("My Details");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline'][3]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//label[@class='form-file-label'][1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Telok blangah , Sentosa ,Singapore");
	  
	  Thread.sleep(2000);
	  //WebElement MyDropdwon=driver.findElement(By.name("make"));
	  //Select MakeDropDown=new Select(MyDropdwon);
	  //String expectedSelectedItem="BMW";
	  
	
	  
	  
	  
	  
	  
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
