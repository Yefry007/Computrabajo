package co.com.computrabajo.qa.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.computrabajo.com")
public class ComputrabajoHomePage extends PageObject {
	
	
	public static final Target COMPUTRABAJO_LOGO = Target.the("computrabajo logo").located(By.xpath("//header/div[1]/a[1]/img[1]"));
	public static final Target COMPUTRABAJO_LINKPAIS = Target.the("computrabajo Pais link").located(By.id("Colombialink"));
	public static final Target COMPUTRABAJO_PANELBUTTON = Target.the("computrabajo Panel").located(By.id("open_menu"));
	
	public static final Target COMPUTRABAJO_INGRESAR = Target.the("computrabajo ingresar").located(By.xpath("(//a[@href=\"https://candidato.co.computrabajo.com/Acceso/?af=2\"])[3]"));
	public static final Target COMPUTRABAJO_CONTINUARBUTTON = Target.the("boton para continuar").located(By.id("continueWithMailButton"));
	public static final Target COMPUTRABAJO_INICIARBUTTON = Target.the("ingresar sesion").located(By.id("btnSubmitPass"));
	public static final Target COMPUTRABAJO_EMAIL = Target.the("label email").located(By.id("LoginModel_Email"));
	public static final Target COMPUTRABAJO_PASSWORD = Target.the("label contraseña").located(By.id("LoginModel_Password"));
}
