package n3exercici2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;

class n3exercici2Test {

	Objeto objeto1 = new Objeto("Grande", 500);
	Objeto objeto2 = new Objeto("Grande", 500);
	
	@Test
	void test1() {	//Comparacion por referencia: Falla porque son diferentes objetos
		assertThat(objeto1).isEqualTo(objeto2);
	}

	@SuppressWarnings("deprecation")
	@Test
	void test2() {	//Comparacion por campos: Es correcto porque el valor de sus campos son iguales
		assertThat(objeto1).isEqualToComparingFieldByFieldRecursively(objeto2);		
	}
	
	
}

class Objeto{
	private String tamaño; 
	private int peso;

	public Objeto (String tamaño, int peso) {
		this.tamaño = tamaño;
		this.peso = peso;
	}
}

