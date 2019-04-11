package co.com.tucarro.qa.exceptions;

import java.net.HttpURLConnection;
import java.net.URL;

public class ConexionInternet extends Exception {

	public void VerificarConexion() {
		try {
			int timeOutInMilliSec = 5000;
			URL url = new URL("http://www.tucarro.com.co/");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("HEAD");
			conn.setConnectTimeout(timeOutInMilliSec);
			conn.setReadTimeout(timeOutInMilliSec);
			int responseCode = conn.getResponseCode();
			if (200 <= responseCode && responseCode <= 399) {
				System.out.println("ConexionOk");
			}
		} catch (Exception ex) {
			System.out.println("SinConexion");
		}
	}

}
