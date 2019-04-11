package co.com.google.qa.miprimerabusqueda.stepsdefinitions;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import SearchGoogle.SearchGooglePom;

public class BuscarEnGoogleStepDefinition {

	WebDriver Driver;
	private Scenario scenario;
	private SearchGooglePom searchGooglePom;
	WebElement loginLink;
	String paginaWep = ("http:\\\\www.google.com.co");
	By txtBuscar = By.xpath("//input[@title='Buscar']");
	By btnBuscar = By.name("btnK");
	String texto = ("selenium");

	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;

	}

	@Given("Jhobany am on the google home page")
	public void jhobany_am_on_the_google_home_page() {
		
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		Driver = new ChromeDriver();
		searchGooglePom = new SearchGooglePom(Driver);
		searchGooglePom.ingresarGoogle(paginaWep);
		Driver.manage().window().maximize();
		System.out.println("Jhobany abre su navegador");
		System.out.println("Jhobany abre la pagina inicio google");

	}

	@When("He does the search")
	public void he_does_the_search() {

		// Write code here that turns the phrase above into concrete actions
		System.out.println("En la barra de busqueda Jhobany escribe una palabra");
		searchGooglePom.digitartextoaBuscar(txtBuscar, texto);
		searchGooglePom.hacerClickenBuscar(btnBuscar);
		System.out.println("Jhobany da click en el boton buscar");

	}

	@Then("He validate that result is succes")
	public void he_validate_that_result_is_succes() {
		// Write code here that turns the phrase above into concrete actions
		WebElement loginLink = Driver.findElement(By.partialLinkText(texto));
		boolean status = loginLink.isDisplayed();
		System.out.println("Jhobany verifica que la busqueda sea exitosa");
		assertEquals(status, true);
		System.out.println("Exitossa");
		final byte[] screenshot = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
		Driver.close();
	}

	
}


