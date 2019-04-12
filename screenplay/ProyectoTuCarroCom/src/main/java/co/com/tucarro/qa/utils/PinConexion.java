package co.com.tucarro.qa.utils;

import java.net.HttpURLConnection;
import java.net.URL;

public class PinConexion {
	
	public static boolean ProbarConexion() {
		
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
				return true;
			}
		} catch (Exception ex) {
	
			return false;
		}
		return false;
	}
}
