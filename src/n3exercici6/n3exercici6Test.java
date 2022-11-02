package n3exercici6;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class n3exercici6Test {
	
	@Test
	void test() {
		ArrayIndexOutOfBoundsException e = 
				assertThrows(ArrayIndexOutOfBoundsException.class, 
						() -> {Qualsevol qualsevol= new Qualsevol();});		
	}
}
