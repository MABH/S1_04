package n3exercici1;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class n3exercici1Test {

	float resultIguals = 1.5f, expectedIguals = 1.5f;
	float resultNoIguals = 1.5f, expectedNoIguals = 2.5f;
	
	@Test
	public void EntersIguals() {
	
		assertThat(resultIguals).isEqualTo(expectedIguals);
		
	}	
	
	@Test
	public void EntersNoIguals() {
	
		assertThat(resultNoIguals).isNotEqualTo(expectedNoIguals);
		
	}

}
