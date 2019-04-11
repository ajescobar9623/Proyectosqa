package co.com.tucarro.qa.utils;
import org.openqa.selenium.JavascriptExecutor;

import co.com.tucarro.qa.pages.TuCarroPaginaPrincipal;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TuCarroHighlight extends PageObject{
	
	@FindBy(xpath="//span[contains(text(),'Buscar')]")
	private WebElementFacade botonBuscar;
	
	public void highlight() {
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",botonBuscar );
	}
	
	

	// 
	
}
