package co.com.google.googlesearchwithdata.stepsdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Clasespom.SearchPom;




public class GoogleSearchStepdefinitions {
	public WebDriver Driver;

	@Given("Jhobany esta en el sitio google")
	public void jhobanyEstaEnElSitioGoogle() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("se ejecuto given");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get("https://www.google.com.co/");
		
	    
	}

	@When("el busca la palabra {string} compuesta {string}")
	public void elBuscaLaPalabra(String string,String string2) {
	    // Write code here that turns the phrase above into concrete actions
		
		Driver.findElement(By.name("q")).sendKeys(string+""+string2);
		Driver.findElement(By.name("btnK")).submit();
		System.out.println("se ejecuto when");
	   
	}

	@Then("el verifica que la palabra {string} y {string} este en los resultados")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String string,String string2) {
		
		
		System.out.println("se ejecuto el THEN");
	    // Write code here that turns the phrase above into concrete actions  
	}	
}
