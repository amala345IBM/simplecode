package SPB8.sp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest_Test {
  
  private WebDriver driver;
  @Test
  public void LoginTestCase() {
      driver.findElement(By.name("q")).sendKeys("manzoor");
      
  }
  @BeforeTest
  public void beforeTest() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmalaMallavarapu\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("http://www.google.com");
      System.out.println("searching");
  }
  @AfterTest
  public void afterTest() {
      driver.close();
      
  }
}
