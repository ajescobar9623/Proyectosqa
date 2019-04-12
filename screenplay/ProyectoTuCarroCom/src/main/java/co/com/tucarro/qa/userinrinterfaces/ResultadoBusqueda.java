package co.com.tucarro.qa.userinrinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadoBusqueda {

	 public static final Target BARRA_DE_BUSQUEDA = Target.the("Barra para digitar")    		
	            .located(By.xpath(" //input[@name='as_word']"));
}
