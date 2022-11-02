package n3exercici7;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class n3exercici7Test {
	Optional<String> optional;
	 
	@Test
	void test() {
		 Optional<Object> emptyOptional = Optional.empty();
		    assertThat(emptyOptional).isEmpty();
	}

}
