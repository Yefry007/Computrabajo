package co.com.computrabajo.qa.utils;

public class sleepUtil {
	 public static void sleepSeconds(int seconds) {
	        try {
	            Thread.sleep(seconds * 1000);
	        } catch (InterruptedException e) {
	            // Manejo de excepciones si es necesario
	            e.printStackTrace();
	        }
	 }
}
