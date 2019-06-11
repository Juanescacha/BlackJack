import java.util.ArrayList;
import java.util.Scanner;

/**en la clase Control se encuentran todos los validadores utilizados en el codigo de todas las clases, 
 * los cuales luego serán heredados a la clase Crupier para dar continuidad al juego
 */

public class Control {

	
	ArrayList<Carta> cartas = new ArrayList<Carta>();
	int ganadas;
	int perdidas;
	
	//Crea una nueva baraja cada sesion, reinicia juego cada ronda pero sigue el conteo de ganadas y perdidas
	public void iniciarJuego() {
		Baraja.asignarCartas();
		while(true) iniciarRonda();
		
	}
	
	public void iniciarRonda() {
		
		int crupierMinValor = 0;
		int crupierMaxValor = 0;
		int jugadorMinValor = 0;
		int jugadorMaxValor = 0;
		
		System.out.println("Bienvenido al BlackJack");
		System.out.println("Iniciar Juego?");
		System.out.println("1. Si");
		System.out.println("2. No");
		System.out.println("3. Reglas");
		System.out.println("4. Estadisticas");
		System.out.println("");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("R/. ");
		String respuesta = entrada.nextLine();
		System.out.println("_____________________________________");
		System.out.println("");
		System.out.println("");

		switch(respuesta) {
			case "1" :
				break;
	
			case "2" :
				System.out.println("");
				System.out.println("Bye..."); 
				terminar();
	
			case "3" :
				System.out.println("");
				System.out.println("El jugador Pierde en Empate");
				System.out.println("El que saque AS mas una Figura hace BlackJack y gana automaticamente");
				System.out.println("Crupier se Planta con 17 o mas");
				System.out.println("El conteo de Partidas Ganadas y Perdidas durante todas las rondas seran guardadas");
				System.out.println("El jugador no podra seguir jugando si pierde su dinero o decide retirarse");
				System.out.println("El jugador tiene la posibilidad de plantarse o de pedir más cartas hasta alcanzar los 21 puntos. Si al pedir una nueva carta se pasa de 21, pierde automáticamente la apuesta y sus cartas retiradas por el crupier");
				System.out.println("El crupier reparte dos cartas a cada jugador. El jugador verá sus dos cartas pero solo una del crupier.  La otra carta del crupier se verá cubierta");
				System.out.println("El jugador debera apostar un monto minimo para entrar a la mesa");
				iniciarRonda();
	
			case "4" :
				System.out.println("");
				System.out.println("Estadisticas del Juego");
				System.out.println("Partidas Ganadas: " + ganadas);
				System.out.println("Partidas Perdidas: " + perdidas + "\n");
	
				iniciarRonda();
	
			default :
				System.out.println("");
				System.out.println("Ingresaste una Opcion Invalida \n");
				iniciarRonda();
		}
		
		ArrayList<Carta> cartasCrupier = new ArrayList<Carta>();
		ArrayList<Carta> cartasJugador = new ArrayList<Carta>();
		
		cartasCrupier.add(Baraja.elegirCarta());
		
		System.out.println("El Crupier ha sacado " + cartasCrupier.get(0).formato() );
		int[] valorManoCrupier = Crupier.getValores(cartasCrupier);
		crupierMinValor = valorManoCrupier[0];
		crupierMaxValor = valorManoCrupier[1];
		
		if(crupierMinValor == crupierMaxValor) System.out.println("El Crupier tiene " + crupierMinValor );
		else System.out.println("El Crupier tiene " + crupierMinValor + " o " + crupierMaxValor + " debido al As");
		
		boolean rondaFinalizada = false;
		boolean turnoDelJugadorFinalizado = false;
		
		cartasJugador.add(Baraja.elegirCarta());
		cartasJugador.add(Baraja.elegirCarta());
		
		int[] valorManoJugador = Crupier.getValores(cartasJugador);
		jugadorMinValor = valorManoJugador[0];
		jugadorMaxValor = valorManoJugador[1];
		System.out.println("Has sacado " + cartasJugador.get(0).formato());
		System.out.println("Has sacado " + cartasJugador.get(1).formato());
		
		if(jugadorMinValor == jugadorMaxValor) System.out.println("Tienes " + jugadorMinValor + " Puntos");
		else System.out.println("Tienes " + jugadorMinValor + " o " +  jugadorMaxValor + " Puntos");
		
		if(crupierMaxValor == 21) {
			System.out.println("Has sacado BlackJack!!!");
			ganadas++;
			System.out.println("Partidas Ganadas: " + ganadas);
			System.out.println("Partidas Perdidas: " + perdidas + "\n");
			
			rondaFinalizada = true;
			turnoDelJugadorFinalizado = true;
		}
		
		if(!turnoDelJugadorFinalizado && !rondaFinalizada) {
			System.out.println("Que deseas hacer?");
			System.out.println("1. Pedir una Carta");
			System.out.println("2. Plantarte \n");
			
			System.out.print("R/. ");
			respuesta = entrada.nextLine();
			System.out.println("_____________________________________");
			System.out.println("");
			System.out.println("");

		}
		
		
		while(!turnoDelJugadorFinalizado && !rondaFinalizada) {
			if(respuesta.equals("1")) {
				cartasJugador.add(Baraja.elegirCarta());
				valorManoJugador = Crupier.getValores(cartasJugador);
				jugadorMinValor = valorManoJugador[0];
				jugadorMaxValor = valorManoJugador[1];
				System.out.println("Has sacado " + cartasJugador.get(cartasJugador.size()-1).formato());
				if(jugadorMinValor == jugadorMaxValor) System.out.println("Tienes " + jugadorMinValor + " Puntos");
				else System.out.println("Tienes " + jugadorMinValor +  " o " + jugadorMaxValor + " Puntos");
				
				if(jugadorMaxValor > 21) {
					rondaFinalizada = true;
					turnoDelJugadorFinalizado = true;
					System.out.println("Te pasaste.");
					perdidas++;
					System.out.println();
					System.out.println("Partidas Ganadas: " + ganadas);
					System.out.println("Partidas Perdidas: " + perdidas + "\n");
				}
				
				if(jugadorMaxValor == 21) {
					rondaFinalizada = true;
					turnoDelJugadorFinalizado = true;
					System.out.println("Sacaste BlackJack!!!");
					ganadas++;
					System.out.println("Partidas Ganadas: " + ganadas);
					System.out.println("Partidas Perdidas: " + perdidas + "\n");
				}
			}
			
			
			if(respuesta.equals("2")) {
				System.out.println("Te has Plantado ");
				turnoDelJugadorFinalizado = true;
			}
			
			if(!turnoDelJugadorFinalizado) {
				System.out.println("Que deseas hacer?");
				System.out.println("1. Pedir una Carta");
				System.out.println("2. Plantarte \n");
				
				System.out.print("R/. ");
				respuesta = entrada.nextLine();
				System.out.println("_____________________________________");
				System.out.println("");
				System.out.println("");

			}
			
			// Acaba Turno Jugador
		}
		
		boolean turnoDelCrupier = false;
		
		while(!turnoDelCrupier && !rondaFinalizada) {
			cartasCrupier.add(Baraja.elegirCarta());
			System.out.println("El Crupier ha sacado " + cartasCrupier.get(cartasCrupier.size()-1).formato());
			
			valorManoCrupier = Crupier.getValores(cartasCrupier);
			crupierMinValor = valorManoCrupier[0];
			crupierMaxValor = valorManoCrupier[1];
			
			if(crupierMaxValor == crupierMinValor) System.out.println("El Crupier tiene " + crupierMinValor + " Puntos");
			else System.out.println("El Crupier tiene " + crupierMinValor + " o " + crupierMaxValor + " Puntos");
			
			if(crupierMaxValor >= 17 && crupierMaxValor < 22) {
				
				if(crupierMaxValor == 21) {
					System.out.println("El Crupier ha sacado BlackJack");
					perdidas++;
					System.out.println();
					System.out.println("Partidas Ganadas: " + ganadas);
					System.out.println("Partidas Perdidas: " + perdidas + "\n");
					turnoDelCrupier = true;
					rondaFinalizada = true;
				}
				
				else if(crupierMaxValor < jugadorMaxValor) {
					System.out.println("Ganaste!");
					ganadas++;
					System.out.println();
					System.out.println("Partidas Ganadas: " + ganadas);
					System.out.println("Partidas Perdidas: " + perdidas + "\n");
					turnoDelCrupier = true;
					rondaFinalizada = true;
				}
				
				else if(crupierMaxValor == jugadorMaxValor) {
					System.out.println("Empataste con el Crupier, perdiste");
					perdidas++;
					System.out.println();
					System.out.println("Partidas Ganadas: " + ganadas);
					System.out.println("Partidas Perdidas: " + perdidas + "\n");
					turnoDelCrupier = true;
					rondaFinalizada = true;
				}
				
				else {
					System.out.println("Has Perdido");
					perdidas++;
					System.out.println();
					System.out.println("Partidas Ganadas: " + ganadas);
					System.out.println("Partidas Perdidas: " + perdidas + "\n");
					turnoDelCrupier = true;
					rondaFinalizada = true;
				}
			}
			
			if(crupierMaxValor > 21) {
				System.out.println("El Crupier se ha pasado, Tu Ganaste!!!");
				ganadas++;
				System.out.println();
				System.out.println("Partidas Ganadas: " + ganadas);
				System.out.println("Partidas Perdidas: " + perdidas + "\n");
				turnoDelCrupier = true;
				rondaFinalizada = true;
			}
			
		}
		
	}
	
	public void terminar() {
		System.exit(0);
	}
	
}
