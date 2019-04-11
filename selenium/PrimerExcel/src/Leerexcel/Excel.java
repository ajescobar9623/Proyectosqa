package Leerexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		try {
			File src = new File("C:\\Selenium\\prueba.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheetAt(0);
			int rowcount = sh1.getLastRowNum();

			int colum = 0;

			for (int i = 0; i <= rowcount; i++) {

				Row row = sh1.getRow(i);

				for (int j = 0; j <= colum; j++) {
					try {
						System.out.print(row.getCell(j).getStringCellValue());
						String dato = row.getCell(j).getStringCellValue();

						WebDriver driver = new ChromeDriver();
						driver.get("http:\\www.google.com.uy");
						driver.findElement(By.name("q")).sendKeys(dato);

						driver.findElement(By.name("btnK")).submit();

						WebElement loginLink = driver.findElement(By.partialLinkText(dato));
						driver.quit();
						driver.close();
						boolean status = loginLink.isDisplayed();

						if (status) {
							Cell t = row.createCell(row.getLastCellNum());
							t.setCellValue("Dato encontrado");
							System.out.println("encontrado");
						}
					} catch (RuntimeException e) {
						Cell t = row.createCell(row.getLastCellNum());
						t.setCellValue("Dato no encontrado");

					}
				}
				wb.write(new FileOutputStream(src));
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
}