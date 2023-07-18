package co.com.computrabajo.qa.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.computrabajo.qa.userinterface.ComputrabajoHomePage;
import co.com.computrabajo.qa.utils.sleepUtil;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginHomePage implements Task {
	@SuppressWarnings("unused")
	private PageObject page;
	
	public LoginHomePage(PageObject page) {
		this.page = page;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		System.out.println("Seleccione la opcion para autenticar el usuario ");
		sleepUtil.sleepSeconds(5);
		System.out.println("Ingresa mail de usuario");
		actor.attemptsTo(Click.on(ComputrabajoHomePage.COMPUTRABAJO_EMAIL));
		actor.attemptsTo(Enter.theValue("yefrycespedes14@gmail.com").into(ComputrabajoHomePage.COMPUTRABAJO_EMAIL));
		sleepUtil.sleepSeconds(5);
		System.out.println("Seleccionar opcion continuar");
		actor.attemptsTo(Click.on(ComputrabajoHomePage.COMPUTRABAJO_CONTINUARBUTTON));
		sleepUtil.sleepSeconds(5);
		
		
		System.out.println("Ingresar el password");
		actor.attemptsTo(Click.on(ComputrabajoHomePage.COMPUTRABAJO_PASSWORD));
		actor.attemptsTo(Enter.theValue("").into(ComputrabajoHomePage.COMPUTRABAJO_PASSWORD));
		sleepUtil.sleepSeconds(5);
		System.out.println("Seleccionar opcion Iniciar Sesion");
		actor.attemptsTo(Click.on(ComputrabajoHomePage.COMPUTRABAJO_INICIARBUTTON));
		sleepUtil.sleepSeconds(5);
		
	}

	public static LoginHomePage at(PageObject page) {
		// TODO Auto-generated method stub
		return instrumented(LoginHomePage.class, page);
	}

	

}
