package n3exercici4;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;

class n3exercici4Test {

	ArrayList<Object> arrayL = new ArrayList<Object>();
	Objecte1 objecte1 = new Objecte1("Objecte1", 1);
	Objecte2 objecte2 = new Objecte2(3.45f);
	Objecte3 objecte3 = new Objecte3('H','o','l','a');
	
	
	@Test
	void conteObjectes() {
		arrayL.add(objecte1);
		arrayL.add(objecte2);
		arrayL.add(objecte3);
		
		 assertThat(arrayL).contains(objecte1, objecte2, objecte3);
	}
	
	@Test
	void conteUnaVegada() {	
		arrayL.add(objecte1);
		arrayL.add(objecte2);
		arrayL.add(objecte3);
		
		Condition condition = new Condition() {	//Condició que retorna si l'objecte es de la classe Objecte2
		    @Override
		    public boolean matches(Object o) {
		        return o.getClass() == Objecte2.class;
		    }
		};

		assertThat(arrayL).areExactly(1, condition);
	}
	
	@Test
	void noConte() {	
		arrayL.add(objecte1);
		arrayL.add(objecte2);
		
		Condition condition = new Condition() {	//Condició que retorna si l'objecte es de la classe Objecte3
		    @Override
		    public boolean matches(Object o) {
		        return o.getClass() == Objecte3.class;
		    }
		};

		assertThat(arrayL).areExactly(0, condition);
	}
	


	class Objecte1 {
		String nom;
		int id;
		
		public Objecte1(String nom, int id)
		{
			this.nom = nom;
			this.id = id;
		}
	}
	
	class Objecte2 {		
		float mesura;
		
		public Objecte2(float mesura)
		{
			this.mesura = mesura;
		}
	}
	
	class Objecte3 {		
		char[] lletres = new char[4];
		
		public Objecte3(char lletra1, char lletra2, char lletra3, char lletra4)
		{
			this.lletres = new char[]{lletra1, lletra2, lletra3, lletra4};
		}
	}
}
