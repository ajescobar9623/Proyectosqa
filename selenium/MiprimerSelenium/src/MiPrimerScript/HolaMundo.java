package MiPrimerScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HolaMundo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
		
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.navigate().to("https://www.tumoto.com.co");
		 String actualTitle = driver.getTitle();
		 driver.manage().window().maximize();
		 String expectedTitle = "selenium";
		 String yourtext= driver.findElement(By.className("breadcrumb__title")).getText() ; 
		 Thread.sleep(3000);
		 if(yourtext.equals("Motos"))
		 System.out.println("Esta en la pagina corecta");
		 
		 else
		 System.out.println("No esta en la pagina");
		 driver.close();
	}
	}