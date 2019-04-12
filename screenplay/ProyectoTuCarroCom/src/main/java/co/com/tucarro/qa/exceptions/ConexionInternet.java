package co.com.tucarro.qa.exceptions;

import java.net.HttpURLConnection;
import java.net.URL;

public class ConexionInternet extends AssertionError {
	
	public static final String Conexionred ="No cuenta con conexion a internet";
	public ConexionInternet (String mensaje, Throwable cause) {
	super(mensaje,cause);
	}
	
}	
	

