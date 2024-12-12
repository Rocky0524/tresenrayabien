package paquete3enraya;

import java.util.Scanner;
import java.util.Random;

public class tresenrayabien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Random random = new Random();		

int jugadores = 2;
//pregunta los nombres de los dos jugadores
	
			
		String [] nomjugadores = new String[2];
		for(int i =0; i < jugadores; i++) {
			System.out.println("jugador " + (i +1) + " cual es tu nombre?" );
			nomjugadores[i] = s.next();
			System.out.println("Nombre del jugador " + (i + 1) + ": " + nomjugadores[i]);
		}
System.out.println(nomjugadores[0]+" seras cara, "+nomjugadores[1] +" seras cruz");

//Aqui se decide si la moneda sale cara o cruz
			System.out.println("\n Ahora se tirara la moneda");
			
		String Cruz ="cruz";
		String Cara ="cara";
			int moneda= random.nextInt(2);
				if(moneda ==1) {
					System.out.println("\n La moneda a salido " + Cruz);
				}else {
					System.out.println("\n La moneda a salido " + Cara);
				}

				
//matriz declarada para el juego
String matriz[][]= {{".", ".", "."},
					{".", ".", "."},
					{".", ".", "."}};	


while(true) {
	
for (int turno = 0; turno < jugadores; turno++) {
	System.out.println("\nTurno del jugador " + (turno + 1));	
	}

for(int i = 0; i < matriz.length; i++) { //primero recore las filas
for(int j = 0; j <matriz[i].length; j++) { // segundo recorre las columnas
	System.out.print("|"+matriz[i][j]+"|");
}
System.out.println("");
}






break;
}
		
	}

}
