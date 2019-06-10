
import java.util.ArrayList;

public class Baraja {
	
	static ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	public static Carta elegirCarta() {
		double cartaAleatoria = Math.ceil(Math.random() * 52);
		int numeroCarta = (int) cartaAleatoria;
		return cartas.get(numeroCarta - 1);
	}
	
	public static void asignarCartas() {
		String[] palos = { "Treboles" , "Diamantes" , "Corazones" , "Picas" };
		
		
		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add( new Carta( palos[i-1] , "As", 1));
		}
		
		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add( new Carta( palos[i-1] , "J", 10));
		}
		
		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add( new Carta( palos[i-1] , "Q", 10));
		}
		
		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add( new Carta( palos[i-1] , "K", 10));
		}
		
		
		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add(new Carta(palos[i-1], "Dos", 2));
		}
		
		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add(new Carta(palos[i-1], "Tres", 3));
		}
		
		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add(new Carta(palos[i-1], "Cuatro", 4));
		}
		
		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add(new Carta(palos[i-1], "Cinco", 5));
		}

		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add(new Carta(palos[i-1], "Seis", 6));
		}
		
		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add(new Carta(palos[i-1], "Siete", 7));
		}
		
		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add(new Carta(palos[i-1], "Ocho", 8));
		}
		
		for ( int i = 1 ; i < 5 ; i++ ) {
			cartas.add(new Carta(palos[i-1], "Nueve", 9));
		}
	}
	

}
