package co.com.Google.qa.MiPrimerSerenity.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

public class TucarroResultadoBusqueda extends PageObject{
	
	 @FindBy(xpath="//section[@id='results-section']//li[6]")
	    private WebElementFacade seleccion;
	
	 public void escogerVehiculo() {
	    	seleccion.click();
	    }
}
