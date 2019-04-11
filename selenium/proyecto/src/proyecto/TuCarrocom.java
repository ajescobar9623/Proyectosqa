/**
 * Reto automatizacion
 *
 * @author Andres Escobar
 * @version 1, 03/24/2019
 */

package proyecto;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

import net.bytebuddy.implementation.ExceptionMethod;

import org.openqa.selenium.WebElement;

public class TuCarrocom {
	static WebDriver Driver;
	static int Imagen = 0;
	By categoria = (By.xpath("//*[@id='category']"));
	
	public static void Conexion() {
		try {
			int timeOutInMilliSec = 5000;
			URL url = new URL("http://www.tucarro.com.co/");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("HEAD");
			conn.setConnectTimeout(timeOutInMilliSec);
			conn.setReadTimeout(timeOutInMilliSec);
			int responseCode = conn.getResponseCode();
			if (200 <= responseCode && responseCode <= 399) {
				System.out.println("Conectado a internet");
			}
		} catch (Exception ex) {
			System.out.println("sin conexion a internet");
		}
	}

	public static void Proceso() throws InterruptedException, IOException {

		try {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver Driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) Driver;
			Conexion();
			Driver.get("http:\\www.tucarro.com.co");
			Driver.manage().window().maximize();

			Print(Driver);
			Driver.findElement(By.xpath("//*[@id='category']")).click();
			Driver.findElement(By.xpath("//*[@id=\"category\"]/option[1]")).click();
			Thread.sleep(500);

			Driver.findElement(By.xpath("//*[@id=\"category__l2\"]")).click();
			Driver.findElement(By.xpath("//option[@value='9991744-AMCO_1744_1-MMCO16948']")).click();
			Thread.sleep(500);

			Select referencia = new Select(Driver.findElement(By.xpath("//*[@id=\"category__l3\"]")));
			referencia.selectByVisibleText("911");
			Thread.sleep(500);

			Select listbo3 = new Select(Driver.findElement(By.xpath("//*[@id=\"price-filter-from\"]")));
			listbo3.selectByValue("60000000");
			Thread.sleep(500);

			Select listbox = new Select(Driver.findElement(By.xpath("//*[@id=\"price-filter-to\"]")));
			listbox.selectByValue("510000000");
			Thread.sleep(500);

			Select listbox2 = new Select(Driver.findElement(By.xpath("//*[@id=\"year-filter-from\"]")));
			listbox2.selectByValue("2015");
			Thread.sleep(500);

			Select listbox3 = new Select(Driver.findElement(By.xpath("//*[@id=\"year-filter-to\"]")));
			listbox3.selectByValue("2018");
			Thread.sleep(500);
			Print(Driver);

			Driver.findElement(By.xpath(" /html/body/main/section/form/button")).click();
			Thread.sleep(500);

			Print(Driver);
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//*[@id=\"searchResults\"]/li[2]")).click();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy (0,600)");

			WebElement Marca = Driver.findElement(By.xpath("//span[contains(text(),'Porsche')]"));
			WebElement Referencia = Driver.findElement(By.xpath("//span[contains(text(),'911')]"));
			js.executeScript("arguments[0].setAttribute('style','border: solid 2px orange');", Marca);
			js.executeScript("arguments[0].setAttribute('style','border: solid 2px orange');", Referencia);
			Thread.sleep(3000);
			Print(Driver);

			String Texto = Marca.getText();

			if (Texto.contentEquals("Porsche")) {

				System.out.print("Vehiculo encontrado");
				Driver.close();
			} else {
				System.out.print("No se encontro el vehiculo");
				Driver.close();
			}
		} catch (RuntimeException e) {

			System.out.print("Error en la busqueda");
			
		}

	}

	public static void Print(WebDriver Driver) throws IOException {

		Imagen++;
		File f1 = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\Selenium\\proyecto\\imagen" + Imagen + ".png"));

	}

	public static void main(String[] args) throws Exception {
		Proceso();
	}
}
