package Clasespom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPom {
	
	public WebDriver driver;
	public WebElement loginLink;
		 
	
	
	public SearchPom(WebDriver Driver) {
		
		this.driver=Driver;	
	}
	
	public void ingresarGoogle(String paginaWeb) {
		driver.get(paginaWeb);
	}
	
	public void digitartextoaBuscar(By txtBuscar,String texto) {
		
		driver.findElement(txtBuscar).sendKeys(texto);
	}
	
	public void hacerClickenBuscar(By btnBuscar) {
		driver.findElement(btnBuscar).submit();
	}
	public void verificarBusqueda(String texto) {
		
	}

}
