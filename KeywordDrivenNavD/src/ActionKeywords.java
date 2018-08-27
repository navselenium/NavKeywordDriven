import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeywords {
static WebDriver driver;
	
	public static void openbrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
	}
	public static void navigate() {
		driver.navigate().to("https://www.gapcanada.ca/");
		
	}
	public static void click_link() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/header/div[3]/span/a[1]")).click();
	   	}
}
