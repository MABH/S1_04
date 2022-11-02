package n1exercici2;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class n1exercici2Test {
	CalculoDni calculoDNI;
	
	@ParameterizedTest
	@ValueSource(strings = { "12345678", "34576899", " 1234567", "665y8322", "45812093", "65239866H", "E4576099" , "E4576099", "32457612", "09745726"})
	void calculoDNI(String nombre) {
		calculoDNI = new CalculoDni(nombre);
		char lletra = calculoDNI.getLletraDNI();
		
		assertTrue(Character.toString(lletra).matches("[TRWAGMYFPDXBNJZSQVHLCKE ]"));
	}
}
