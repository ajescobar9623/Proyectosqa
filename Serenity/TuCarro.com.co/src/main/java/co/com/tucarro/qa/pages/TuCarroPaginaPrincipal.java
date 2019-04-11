package co.com.tucarro.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import co.com.tucarro.qa.utils.TuCarroHighlight;

@DefaultUrl("https://www.tucarro.com.co/")
public class TuCarroPaginaPrincipal extends PageObject {

	@FindBy(xpath = "//span[contains(text(),'Buscar')]")
	private WebElementFacade botonBuscar;

	@FindBy(name = "as_word")
	private WebElementFacade barraParaDigitar;

	public void digitarVehiculoParaBuscar(String keyword) {
		barraParaDigitar.typeAndEnter(keyword);
	}
	public void clickBotonBuscar() {
		botonBuscar.click();
	}
}
