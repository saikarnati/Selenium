package seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumFirstClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("fname")).sendKeys("my first name");
		driver.findElement(By.id("submitButton")).click();
		driver.getTitle();
		driver.getCurrentUrl();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(url);
		}

}
