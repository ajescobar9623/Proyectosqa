package Scripie;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class screen {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com.co");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium gets screenshot");
		driver.findElement(By.name("btnK")).submit();;
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		try {
		FileUtils.copyFile(src, new File("C:\\Selenium\\image2.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		
	}	
}
