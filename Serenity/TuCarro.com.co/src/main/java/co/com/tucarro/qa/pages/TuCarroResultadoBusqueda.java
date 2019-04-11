package co.com.tucarro.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TuCarroResultadoBusqueda extends PageObject {

	 @FindBy(xpath="//section[@id='results-section']//li[30]")
	    private WebElementFacade vehiculo;
	
	 public void escogerVehiculo() {
	    	vehiculo.click();
	    }
}
