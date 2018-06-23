package seleniumtutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.event.ListDataListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prac11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select oselect=new Select(driver.findElement(By.id("selenium_commands")));
		oselect.selectByIndex(0);
		Thread.sleep(1000);
		oselect.deselectByIndex(0);
		oselect.selectByVisibleText("Navigation Commands");
		Thread.sleep(1000);
		oselect.deselectByVisibleText("Navigation Commands");
		List<WebElement> lislen=oselect.getOptions();
		int size=lislen.size();
		for(int i=0;i<size;i++) {
			String values=lislen.get(i).getText();
			System.out.println(values);
		}
		
		oselect.selectByIndex(0);
		oselect.selectByIndex(1);
		oselect.selectByIndex(2);
		oselect.selectByIndex(3);
		oselect.selectByIndex(4);
		Thread.sleep(1000);
		oselect.deselectAll();
        Thread.sleep(1000);
        driver.close();
	}

}
