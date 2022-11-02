package n1exercici3;

public class ErrorArray {
	private int[] array = {0, 1, 2, 3, 4};

	public ErrorArray() {
		for (int i=0; i<=5; i++) {
			System.out.println("posición "+i+" elemento "+array[i]);
		}
	}	
}
