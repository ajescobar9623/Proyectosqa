package co.com.tucarro.qa.steps;

import co.com.tucarro.qa.pages.TuCarroPaginaPrincipal;
import co.com.tucarro.qa.pages.TuCarroResultadoBusqueda;
import co.com.tucarro.qa.tasks.TuCarroExtraerTexto;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import co.com.tucarro.qa.exceptions.ConexionInternet;


public class TuCarroSteps {
	private static final int SECONDS = 3;
	TuCarroExtraerTexto extraer;
	TuCarroPaginaPrincipal tuCarroPagina ;
	TuCarroResultadoBusqueda tuCarroResultado;
	ConexionInternet conec;
	
	
	    @Step
	    public void ingresoPagianaWeb() {
	    	tuCarroPagina.open();
	    	extraer.marcar();
	    }
	    @Step
	    public void clickEnBoton() {
	    	tuCarroPagina.clickBotonBuscar();
	    	extraer.highlightBarra();
	    	//Serenity.takeScreenshot();
	    	
	    }
	    
	    @Step
	    public void ingresarDatos(String keyword) {
	        tuCarroPagina.digitarVehiculoParaBuscar(keyword);  
	        Serenity.takeScreenshot();
	    }
	    
	    @Step
	    public void buscarVehiculo(String palabra) {
	        ingresarDatos(palabra);
	        //startsSearch();
	    }
	    @Step
	    public void seleccionaVehiculo() {
	    	tuCarroResultado.escogerVehiculo();
	    }
	    @Step
	    public void sacart() {
	    	extraer.extraertext();
	    }
	    @Step
	    public void indicarbuscar() {
	    	extraer.marcar();
	    }
	    @Step
	    public void verificar() {
	    	conec.VerificarConexion();
	    }
	    
}
