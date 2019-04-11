package co.com.google.qa.mirpimerscreenplay.questions;

import co.com.google.qa.mirpimerscreenplay.userinterfaces.GoogleResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("validar resultado")
public class ThePhrase implements Question<String>  {
	
	public ThePhrase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String answeredBy(Actor actor) {
		
		// TODO Auto-generated method stub
		return GoogleResultPage.SEARCH_BAR.resolveFor(actor).waitUntilVisible().getValue();
	}
	
	public static ThePhrase searched() {
		return new ThePhrase();//es para evitar instanciar en los steps 
	}
}