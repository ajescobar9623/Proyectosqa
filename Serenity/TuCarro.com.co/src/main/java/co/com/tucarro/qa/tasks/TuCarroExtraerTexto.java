package co.com.tucarro.qa.tasks;

import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TuCarroExtraerTexto extends PageObject {

	@FindBy(xpath = "//h1[contains(@class,'item-title__primary')]")
	private WebElementFacade textoes;
	@FindBy(name = "as_word")
	private WebElementFacade barraParaDigitar;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElementFacade botonBuscar;
	
	public void extraertext() {
		String r = textoes.getText();
		System.out.println(r);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid red;');", textoes);
	}
	public void marcar() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid red;');", botonBuscar);
	}
	public void highlightBarra() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid red;');",
				barraParaDigitar);
	}
}
