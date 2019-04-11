package co.com.google.qa.mirpimerscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://carros.tucarro.com.co/")
public class GoogleHomePage extends PageObject {
    public static final Target SEARCH_BAR = Target.the("la barra de busqueda")    		
            .located(By.name("as_word"));
    
    public static final Target SEARCH_BUTTON = Target.the("boton buscar")
            .located(By.xpath("//form[@class='nav-search']//button[@type='submit']"));
}
