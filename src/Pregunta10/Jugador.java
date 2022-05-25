package Pregunta10;

public class Jugador extends Persona {
	
	public String numFed;

	public Jugador(String nombre, String nif, String fechaNac, String numFed) {
		super(nombre, nif, fechaNac);
		this.numFed="integer";
	}

}
