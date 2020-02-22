package firstTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest1 {
@Test
public void logintest() throws IOException, InterruptedException{
	WebDriver wd =new FirefoxDriver();
	wd.get("https://www.google.com/");
	WebElement input= wd.findElement(By.name("q"));
	input.sendKeys("Chennai");
	input.submit();
	File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\Dharsh\\workspace\\GitHubTest\\Screenshot"));
	Thread.sleep(5000);
	wd.quit();
}

}
