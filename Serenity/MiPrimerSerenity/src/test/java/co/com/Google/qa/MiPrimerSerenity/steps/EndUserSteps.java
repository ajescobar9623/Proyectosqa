package co.com.Google.qa.MiPrimerSerenity.steps;

import co.com.Google.qa.MiPrimerSerenity.pages.GoogleHomePage;
import co.com.Google.qa.MiPrimerSerenity.pages.TucarroResultadoBusqueda;
import net.thucydides.core.annotations.Step;


public class EndUserSteps {
	
    GoogleHomePage googlePage;
    TucarroResultadoBusqueda  TucarroResultadoBusqueda;

    @Step
    public void is_the_home_page() {
        googlePage.open();
    }
    @Step
    public void clickEnBoton() {
    	googlePage.clickrr();
    }
    
    @Step
    public void enters(String keyword) {
        googlePage.enter_keywords(keyword);
       
    }

    @Step
    public void startsSearch() {
    	googlePage.lookup_terms();
    }
    
    @Step
    public void looks_for(String term) {
        enters(term);
        startsSearch();
    }
    @Step
    public void escogerv() {
    	TucarroResultadoBusqueda.escogerVehiculo();
    }
}