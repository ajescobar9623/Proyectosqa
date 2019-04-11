package proyecto;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TuCarroHomePage {

	private WebDriver Driver;
	private JavascriptExecutor js;

	public TuCarroHomePage(WebDriver Driver) {
		this.Driver = Driver;
	}
	public void Controlador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		Driver.get("http:\\www.tucarro.com.co");
		Driver.manage().window().maximize();
	}
}
