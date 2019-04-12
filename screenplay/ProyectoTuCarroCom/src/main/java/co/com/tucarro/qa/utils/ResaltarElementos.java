package co.com.tucarro.qa.utils;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class ResaltarElementos implements Interaction {
	
	private Target recuadro;
	public ResaltarElementos(Target recuadro) {
	this.recuadro = recuadro;	
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

	((JavascriptExecutor)BrowseTheWeb.as(actor).getDriver()).executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');",recuadro.resolveFor(actor));
	}
	public static  ResaltarElementos marcarElementos(Target recuadro) {
	return instrumented( ResaltarElementos.class,recuadro);
	}
}

