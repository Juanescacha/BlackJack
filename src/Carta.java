/**la clase carta es donde se define una carta como tal, con sus tres variables que son palo, nombre y valor
 */

public class Carta {
	
	private String palo;
	private String nombre;
	private int valor;
	
	
	public Carta(String palo , String nombre , int valor) {
		this.palo = palo;
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public String formato() {
		String nombreCompleto = nombre + " de " + palo;
		return nombreCompleto;
	}
	
	public int getValor() {
		return valor;
	}

	
}
