package n1exercici2;

public class CalculoDni {
	
	private String nombresDNI;
	private char lletraDNI;
	
	public CalculoDni(String nombresDNI) {
		
		this.nombresDNI = nombresDNI;
		this.lletraDNI = ' ';
		if (!nombresDNI.matches("\\d{8}")) {
			System.out.println(nombresDNI+" - Parametre DNI incorrecte");
			nombresDNI="Parametre DNI incorrecte";
		}
		else lletraDNI = calculoLletra(nombresDNI);
	}
	
	private char calculoLletra(String nombres) {
		String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";		
		int dni=Integer.parseInt(nombres);
		int modul = dni%23;
		
		return caracteres.charAt(modul);
	}

	public char getLletraDNI() {
		return lletraDNI;
	}

}
