package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class n1exercici3Test {
	//ErrorArray=errorArrray;
	
	@Test() 
	public void TestArray() {
		
		ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()-> {
			ErrorArray errorArray=new ErrorArray();});
		
		Assertions.assertEquals("Index 5 out of bounds for length 5", thrown.getMessage());
		
		/*Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			ErrorArray errorArray=new ErrorArray();
		});*/
	}
}
