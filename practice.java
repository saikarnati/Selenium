package seleniumtutorials;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class HiddenElements {
private String baseurl1;
private String baseurl2;
private WebDriver driver;
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		baseurl1="http://letskodeit.teachable.com/p/practice";
		baseurl2="http://www.expedia.com";
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	

	}
	@Test
	public void Letskodeit() throws InterruptedException {
		driver.get(baseurl1);
		WebElement textbox=driver.findElement(By.id("displayed-text")); 
		System.out.println("text box is displayed :"+textbox.isDisplayed());
		Thread.sleep(2000);
		WebElement hide=driver.findElement(By.id("hide-textbox"));
		hide.click();
		System.out.println("the element is displayed :"+textbox.isDisplayed());
		Thread.sleep(2000);
		WebElement show=driver.findElement(By.id("show-textbox"));
		show.click();
		System.out.println("the element is dsplayed :"+textbox.isDisplayed());
	}
	
	

	@Test
	public void Expedia() {
driver.get(baseurl2);
	}
	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

}
