package co.com.tucarro.qa.userinrinterfaces;

import java.util.Random;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SelecciondeVehiculo {
	
	int id = Math.abs(new Random(2).nextInt(7));
	 public static final Target SELECCIONAR_VEHICULO = Target.the("Seleccionar vehiculo")    		
			 .located(By.xpath(" //ol[@id='searchResults']//li[8]"));
	 
	 
	 public static final Target DESCRIPCION_VEHICULO_ = Target.the("Seleccionar vehiculo")    		
			 .located(By.xpath("//h1[contains(@class,'item-title__primary')]"));
}


