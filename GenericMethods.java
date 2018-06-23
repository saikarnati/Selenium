import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumtutorials.GenericMethods;
import org.openqa.selenium.chrome.ChromeDriver;

class GenericMethodDemo {
private String baseurl;
private WebDriver driver;
private GenericMethods gm;
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		baseurl="http://letskodeit.teachable.com/p/practice";
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		gm=new GenericMethods(driver);
		
	
	}
	@Test
	void test() throws InterruptedException {
		WebElement element=gm.getelement("name","id");
		element.sendKeys("hello");
		Thread.sleep(2000);
		
