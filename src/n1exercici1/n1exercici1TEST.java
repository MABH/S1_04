package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashSet;

import org.junit.jupiter.api.Test;

class n1exercici1TEST {

	Mesos mesos= new Mesos();
	
	@Test
	public void testPosicions() {
		int esperat = 12;
		int resultat = mesos.getMesos().size();	
		assertEquals(esperat, resultat);
	}

	@Test
	public void testNoNull() {
		assertNotNull(mesos.getMesos());
	}
	
	@Test
	public void testAgost() {		
		String esperat = "Agost";		
		//String resultat = mesos.getMesos().get(8);--Mostra que no es correcte perque el mes d'agot correspon a la posicio 7 de la llista
		
		String resultat = mesos.getMesos().get(7);
		assertEquals(esperat, resultat);
	}
}
