package kavya;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class week10 {
 public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chromedriver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://gmail.com/");
 Thread.sleep(1000);
 WebElement createAccount = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span"));
 createAccount.click();
 Thread.sleep(1000);
 WebElement mySelft = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]"));
 mySelft.click();
 Thread.sleep(1000);
 WebElement firstName = driver.findElement(By.name("firstName"));
 firstName.sendKeys("abc");
 Thread.sleep(1000);
 WebElement lastName = driver.findElement(By.name("lastName"));
 lastName.sendKeys("xyz");
 Thread.sleep(1000);
 WebElement bn1 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
 bn1.click();
 Thread.sleep(1000);
 Select month = new Select(driver.findElement(By.xpath("(//select[@id='month'])[1]")));
 month.selectByValue("JANUARY");
 Thread.sleep(1000);
 WebElement day = driver.findElement(By.xpath("(//input[@id='day'])[1]"));
 day.sendKeys("6");
 Thread.sleep(1000);
 WebElement year = driver.findElement(By.xpath("(//input[@id='year'])[1]"));
 year.sendKeys("2006");
 Select gender = new
 Select(driver.findElement(By.xpath("(//select[@id='gender'])[1]")));
 gender.selectByValue("1");
 Thread.sleep(1000);
 WebElement bn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div/div/div/button/span"));
 bn.click();
 Thread.sleep(1000);
 WebElement uid=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[1]/div[1]/div/span/div[1]/div/div[1]/div/div[3]/div"));
 uid.click();
//WebElement un=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div/div[1]/div/div[1]/div/div[1]/input"));
//un.sendKeys("1234567890");
 Thread.sleep(1000);
 WebElement bn3 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
 bn3.click();
 Thread.sleep(2000);
 WebElement pswd = driver.findElement(By.name("Passwd"));
 pswd.sendKeys("abcdef123.");
 WebElement cpswd = driver.findElement(By.name("PasswdAgain"));
 cpswd.sendKeys("abcdef123.");
 WebElement bn4 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));
 bn4.click();
 }
 }