package kavya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class week3 {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chromedriver", "C:\\Users\\student\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(200);
driver.findElement(By.partialLinkText("Create new account")).click();
Thread.sleep(500);
WebElement fn= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
fn.sendKeys("XXXXXX");
Thread.sleep(500);
WebElement surName = driver.findElement(By.name("lastname"));
surName.sendKeys("XXXXX");
Thread.sleep(500);
WebElement mobileNoOrEmailId= driver.findElement(By.name("reg_email__"));
mobileNoOrEmailId.sendKeys("1234567890");
Thread.sleep(500);
WebElement password = driver.findElement(By.name("reg_passwd__"));
password.sendKeys("1234");
Select dateDropdown = new Select(driver.findElement(By.name("birthday_day")));
dateDropdown.selectByValue("09");
Thread.sleep(500);
Select monthDropdown = new Select(driver.findElement(By.name("birthday_month")));
monthDropdown.selectByValue("01");
Thread.sleep(500);
Select yearDropdown = new Select(driver.findElement(By.name("birthday_year")));
yearDropdown.selectByValue("2003");
Thread.sleep(500);
WebElement femaleRadioBtn = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input"));
femaleRadioBtn.click();
Thread.sleep(500);
WebElement signUpBtn = driver.findElement(By.name("websubmit"));
signUpBtn.click();
 }
}