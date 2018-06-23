package seleniumtutorials;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class DropDown {
	private WebDriver driver;
	private String baseurl;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		baseurl="http://letskodeit.teachable.com/p/practice";
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}
	@Test
	void test() throws InterruptedException {
		WebElement carselect=driver.findElement(By.id("carselect"));
		Select select=new Select(carselect);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		List<WebElement>options=select.getOptions();
		int isize=options.size();
		for(int i=0;i<isize;i++) {
			String elements=options.get(i).getText();
			System.out.println("the elements are "+elements);
		
		}
		
	
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.close();
		
	}

	

}
