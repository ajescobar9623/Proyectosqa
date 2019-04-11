package co.com.Google.qa.MiPrimerSerenity.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.tucarro.com.co/")
public class GoogleHomePage extends PageObject {
	
	@FindBy(xpath="//span[contains(text(),'Buscar')]")
	private WebElementFacade Bbuscar;
	
	@FindBy(name="as_word")
    private WebElementFacade searchTerms;
	

    @FindBy(xpath="//form[@class='nav-search']//button[@type='submit']")
    private WebElementFacade lookupButton;
    
    public void enter_keywords(String keyword) {
        searchTerms.typeAndEnter(keyword);
    }
    public void clickrr() {
    	Bbuscar.click();
    }
   
    public void lookup_terms() {
       // lookupButton.waitUntilClickable().click();
    }
}