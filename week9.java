package kavya;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week9 {
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chromedriver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.justdial.com/Hyderabad/Bakeries/nct-10033880");
Thread.sleep(2000);
List<WebElement> m = driver.findElements(By.xpath("/html/body/div/section/section/div/div[5]/div[1]/div/main/div[1]/div/div/div[2]/h2/a"));
for(int i = 0; i< m.size(); i++) {
String s = m.get(i).getText();
System.out.println("Text is: " + s);
 }
//driver.quit();
 } 
}