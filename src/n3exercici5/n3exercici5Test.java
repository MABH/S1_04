package n3exercici5;

import java.util.HashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class n3exercici5Test {
	Map<Integer, String> map = new HashMap<Integer, String>();
	
	@Test
	void test() {
		map.put(0, "element 1");
		map.put(1, "element 2");
		map.put(2, "element 3");
		assertThat(map).containsKey(1);
	}

}
