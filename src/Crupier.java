/**la clase Crupier es donde se crea la baraja con sus 52 cartas, importandolas de la clase Carta, 
 * tambien se encuentran todos los metodos que barajan las cartas y se encargan del juego
 */

import java.util.ArrayList;

public class Crupier {
	
	//se instancia la baraja con la que va a repartir en crupier
	Carta baraja[] = new Carta[52];
	//se declara el inero con el que comienza la casa para pagar las apuestas;
	int dineroCrupier = 1000000;
	
	

	//creacion de las 2 cartas iniciales con las que cuenta el Jugador
	Carta cartaJ1 = new Carta();
	Carta cartaJ2 = new Carta();
	
	//creacion de las 2 cartas iniciales con las que cuenta el Crupier 
	Carta cartaC1 = new Carta();
	Carta cartaC2 = new Carta();
	
	public Crupier() {
		// TODO Auto-generated constructor stub
	}
	
}
