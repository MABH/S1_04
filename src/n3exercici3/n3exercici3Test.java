package n3exercici3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import static org.assertj.core.util.Arrays.array;
import static org.assertj.core.api.Assertions.*;

class n3exercici3Test {

	int[] arr1 = {1,2,3};
	int[] arr2 = {1,2,3};
	
	@Test
	void test() {
		 Assertions.assertThat(arr1).containsExactly(arr2);
	}

}
