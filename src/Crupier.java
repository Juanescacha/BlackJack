import java.util.ArrayList;

/**
 * 
 * @author Juan Esteban Camargo y Juan Camilo Gonzalez
 *
 */

public class Crupier {
	
	public static int[] getValores (ArrayList<Carta> list) {
		// encontrar minimo valor del crupier
		int cuenta = 0;
		for(Carta x: list) {
			cuenta = cuenta + x.getValor();
		}
		
		//encontrar maximo valor del crupier
		int cuenta2 = 0;
		boolean comodin = false;
		
		for(Carta y: list) {
			if(y.getValor() == 1 && !comodin ) {
				cuenta2 = cuenta2 + 11;
			}
			else {
				cuenta2 = cuenta2 + y.getValor();
			}
		}
		
		
		// revisa si usar el as como 11 o como 1
		if ( cuenta2 > 21 ) {
			cuenta2 = cuenta;
		}
		
		// pone los valores en un arreglo y los devuelve
		int[] valores = {cuenta , cuenta2};
		
		return valores;
	}
	
}
