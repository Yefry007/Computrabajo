package co.com.computrabajo.qa.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.computrabajo.qa.userinterface.ComputrabajoHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {
	
	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Carga del Browser en la Pagina Principal");
		actor.attemptsTo(Open.browserOn(page));
		try {
				Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static OpenTheBrowser at(PageObject page) {
		// TODO Auto-generated method stub
		return instrumented(OpenTheBrowser.class, page);
	}
	

}
