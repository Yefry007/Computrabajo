package co.com.computrabajo.qa.computrabajo.stepdefinitions;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import co.com.computrabajo.qa.tasks.LoginHomePage;
import co.com.computrabajo.qa.tasks.OpenTheAunthenticate;

//11 - Crear la clase o refactorizar la calase stepdefinitions.
//12 - Adicionar Los stepdefinitions.
//13 - Importar todos los Parametros. Verificar se encuentren los import de io.cucumber.java
//14 - Comentar los Throw
//15 - Eliminar los Underline
//17 - Inicializamos el Driver
//18 - Agregamos el @Managed(driver = "chrome") y lo imporrtamos
//19 - Importar ek Actor de SerenityBDD
//20 - Instanciar nuestra Page Inicial
//21 - BrowseTheWeb de Serenity
//22 - Crear la primer User Interface
//23 - Implementar los pasos y tareas del given Actor.wasAbleTo
//24 - Importar la Task y el Userinterface
//25 - Creamos el metodo AT en la Clase Task definida.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




import co.com.computrabajo.qa.tasks.OpenTheBrowser;
import co.com.computrabajo.qa.tasks.OpenTheCountry;
import co.com.computrabajo.qa.tasks.OpenThePanel;
import co.com.computrabajo.qa.userinterface.ComputrabajoHomePage;
import co.com.computrabajo.qa.utils.sleepUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
//import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;

public class LoginStep {
	
	@Managed(driver = "chrome")
	private WebDriver  hisBrowser;
	
	private Actor yefry = Actor.named("yefry");
	private ComputrabajoHomePage ComputrabajoHomePage;
	//private PageObject ComputrabajoHomePage;
	
	
	@Before
	public void setup() {
		yefry.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().window().maximize();
	}
	
	
	@Given("that the User want do login in the application")
	public void thattheuserwantdologinintheapplication() {
	    // Write code here that turns the phrase above into concrete actions
		
		yefry.wasAbleTo(OpenTheBrowser.at(ComputrabajoHomePage));
		yefry.wasAbleTo(OpenTheCountry.at(ComputrabajoHomePage));
		yefry.wasAbleTo(OpenThePanel.at(ComputrabajoHomePage));
		yefry.wasAbleTo(OpenTheAunthenticate.at(ComputrabajoHomePage));
	}
	@When("he enter credentials")
	public void heentercredentials(/*io.cucumber.datatable.DataTable dataTable*/) {
		sleepUtil.sleepSeconds(5);
		yefry.wasAbleTo(LoginHomePage.at(ComputrabajoHomePage));
	    // Write code here that turns the phrase above into concrete actions
		/*System.out.println("Seleccione la opcion para autenticar el usuario ");
		sleepUtil.sleepSeconds(5);
		System.out.println("Ingresa mail de usuario");
		hisBrowser.findElement(By.id("LoginModel_Email")).click();
		hisBrowser.findElement(By.id("LoginModel_Email")).sendKeys("yefrycespedes14@gmail.com");
		sleepUtil.sleepSeconds(5);
		System.out.println("Seleccionar opcion continuar");
		yefry.attemptsTo(Click.on(co.com.computrabajo.qa.userinterface.ComputrabajoHomePage.COMPUTRABAJO_CONTINUARBUTTON));
		sleepUtil.sleepSeconds(5);
		
		
		System.out.println("Ingresar el password");
		hisBrowser.findElement(By.id("LoginModel_Password")).click();
		hisBrowser.findElement(By.id("LoginModel_Password")).sendKeys("");
		sleepUtil.sleepSeconds(5);
		System.out.println("Seleccionar opcion Iniciar Sesion");
		yefry.attemptsTo(Click.on(co.com.computrabajo.qa.userinterface.ComputrabajoHomePage.COMPUTRABAJO_INICIARBUTTON));
		sleepUtil.sleepSeconds(5);*/
	}
	@Then("he must access the homepage")
	public void hemustaccessthehomepage() {
	    // Write code here that turns the phrase above into concrete actions
	}
}