package co.com.tucarro.qa.userinrinterfaces;


import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://www.tucarro.com.co")

public class PaginaPrincipalTucarro extends PageObject  {
	
	 public static final Target BOTON_BUSCAR = Target.the("Boton para buscar")    		
	            .located(By.xpath("//button[@type='submit']"));
}

