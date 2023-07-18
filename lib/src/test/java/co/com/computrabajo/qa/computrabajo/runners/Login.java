/**
 * 
 */
package co.com.computrabajo.qa.computrabajo.runners;

import org.junit.runner.RunWith;

import io.cucumber.core.cli.Main;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
/**
 * @author yefry.gomez_arbusta
 *
 */
//Adicionar el @RunWith 
//Agregar el @CucumberOptions
//Adicionar el feature
//Adicionar el glue


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/Login.feature",
		glue = "co.com.computrabajo.qa.computrabajo.stepdefinitions"
		)

public class Login {
	 public static void main(String[] args) {
	        byte exitStatus = Main.run(args, Thread.currentThread().getContextClassLoader());
	        System.exit(exitStatus);
	    }

}
