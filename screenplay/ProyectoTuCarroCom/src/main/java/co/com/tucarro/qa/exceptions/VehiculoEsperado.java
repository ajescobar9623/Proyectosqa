package co.com.tucarro.qa.exceptions;

public class VehiculoEsperado extends AssertionError {

	public static final String detallleVehiculo ="La marca del vehiculo no corresponde a la buscada";
	public VehiculoEsperado (String mensaje, Throwable cause) {
	super(mensaje,cause);
	}	
}
