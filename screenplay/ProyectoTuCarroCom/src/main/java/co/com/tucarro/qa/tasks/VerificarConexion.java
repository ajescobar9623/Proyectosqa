package co.com.tucarro.qa.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.net.HttpURLConnection;
import java.net.URL;
import co.com.tucarro.qa.exceptions.ConexionInternet;
import co.com.tucarro.qa.models.ModelVehiculo;
import kotlin.jvm.Throws;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static co.com.tucarro.qa.exceptions.ConexionInternet.Conexionred;

public class VerificarConexion implements Task {
	private final static String palabra="fail";
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			int timeOutInMilliSec = 5000;
			URL url = new URL("http://www.tucarro.com.co/");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("HEAD");
			conn.setConnectTimeout(timeOutInMilliSec);
			conn.setReadTimeout(timeOutInMilliSec);
			int responseCode = conn.getResponseCode();
			if (200 <= responseCode && responseCode <= 399) {
				System.out.println("Conectado a internet");
			}
		} catch (Exception ex) {
	
			System.out.println("sin conexion a internet");
		}
	}
	public static VerificarConexion conexionurl() {
		return instrumented(VerificarConexion .class);
	}
}
