import java.util.ArrayList;

/**la clase Jugador se encarga de manejar las 2 cartas con las que se juegan, tambien administra el dinero
 * del jugador y maneja los metodos de interaccion con el usuario
 */

public class Jugador {
	
	//se instancia el dinero con el que inicia el jugador para apostar
	int dineroJugador = 1000000;
	
	//se declara la mano de tamaño indefido
	ArrayList<Carta> mano = new ArrayList<Carta>();

	public Jugador() {
		// TODO Auto-generated constructor stub
	}

}
