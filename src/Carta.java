//declaracion de la clase carta

public class Carta {
	
	//creacion de las variables que componen una carta
	String palo[] = { "diamantes", "picas", "treboles", "corazones" };
	String numero[] = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	String num="";	

	public Carta() {
		// TODO Auto-generated constructor stub
		
	}

	public void setPalo(String palo[]) {
		this.palo = palo;
	}
	
	//metodo para obtener los numeros del arrego
	public String getNumero() {
		
		for (int i=0;i<palo.length;i++) {
			
			num = numero[i];
		}
		return num;
	}
	
	//metodo para obtener el valor numerico de cada uno de los valores de la carta
	//retorna un int con el valor
	public int valorCarta() {
		int valor =0;
		switch(num) {
		case "As": valor = 11;
		break;
		case "2": valor = 2;
		break;
		case "3": valor = 3;
		break;
		case "4": valor = 4;
		break;
		case "5": valor = 5;
		break;
		case "6": valor = 6;
		break;
		case "7": valor = 7;
		break;
		case "8": valor = 8;
		break;
		case "9": valor = 9;
		break;
		case "10": valor = 10;
		break;
		case "J": valor = 10;
		break;
		case "Q": valor = 10;
		break;
		case "K": valor = 10;
		break;		
		}
		return valor;
	}
	
}