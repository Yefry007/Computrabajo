package co.com.computrabajo.qa.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.computrabajo.qa.userinterface.ComputrabajoHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenTheCountry implements Task {
	@SuppressWarnings("unused")
	private PageObject page;
	
	public OpenTheCountry(PageObject page) {
		this.page = page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		System.out.println("Selecciona la opcion al Pais correspondiente");
		actor.attemptsTo(Click.on(ComputrabajoHomePage.COMPUTRABAJO_LINKPAIS));
			try {
				Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static OpenTheCountry at(PageObject page) {
		// TODO Auto-generated method stub
		return instrumented(OpenTheCountry.class, page);
	}

	
	

}
