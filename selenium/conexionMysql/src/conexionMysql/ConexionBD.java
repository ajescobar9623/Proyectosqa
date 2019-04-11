package conexionMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConexionBD {

	private static final String CONTROLADOR = ("com.mysql.jdbc.Driver");
	private static final String URL = ("jdbc:mysql://localhost:3306/bd_java");
	private static final String USUARIO = "root";
	private static final String CLAVE = "andres1234";
	Statement sql = null;
	ResultSet rs;
	int a = 0;
	int cont = 0;
	WebDriver driver;

	public Connection conectar() {

		Connection conexion = null;

		try {
			Class.forName(CONTROLADOR);
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("conectado con la base de datos");
			Statement s = (Statement) conexion.createStatement();

			ResultSet rs = s.executeQuery("select * from usuario");

			while (rs.next()) {
				cont = cont + 1;
				try {

					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
					System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
					String nombre1 = rs.getString(2);

					WebDriver driver = new ChromeDriver();
					driver.get("http:\\www.google.com.co");
					driver.findElement(By.name("q")).sendKeys(nombre1);
					driver.findElement(By.name("btnK")).submit();

					WebElement loginLink = driver.findElement(By.partialLinkText(nombre1));
					boolean status = loginLink.isDisplayed();

					if (status) {
						PreparedStatement ps = conexion
								.prepareStatement("UPDATE usuario SET resultado='encontrado' WHERE idusuario =" + cont);
						ps.executeUpdate();
						ps.close();
						System.out.println("encontrado");

					}
				} catch (Exception e) {
					PreparedStatement ps = conexion
							.prepareStatement("UPDATE usuario SET resultado='noencontrado' WHERE idusuario =" + cont);
					ps.executeUpdate();
					ps.close();
					System.out.println("no encontrado");
				}
			}

		} catch (ClassNotFoundException e) {
			System.out.print("error al cargar controlador");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("error al conectar con usuario");
			e.printStackTrace();
		}
		return conexion;
	}

	public static void main(String[] args) {
		ConexionBD myClase = new ConexionBD();
		myClase.conectar();

	}
}