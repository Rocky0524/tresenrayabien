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


		int moneda = random.nextInt(2);
		System.out.println("Empieza " + nomjugadores[moneda]);


		String simbolo1 = "X";  // Jugador 1
		String simbolo2 = "O";  // Jugador 2
		
		int turno = 0;
		
		while (true) {

			int fila;
			int columna;
			boolean jugadaValida;
			
				System.out.println("\nTurno de " + nomjugadores[turno]);

break;
}
		
				for (int i = 0; i < matriz.length; i++) { // primero recore las filas
					for (int j = 0; j < matriz[i].length; j++) { // segundo recorre las columnas
						System.out.print("|" + matriz[i][j] + "|");
					}
					System.out.println("");
				}
				
				 // El jugador elige una posición
			    jugadaValida = true;
			    while (jugadaValida) {
			        System.out.println("Elige una fila (0, 1, 2): ");
			        fila = s.nextInt();
			        System.out.println("Elige una columna (0, 1, 2): ");
			        columna = s.nextInt();
			        
			     // Verifica si la celda está vacía
			        if (matriz[fila][columna].equals(".")) {
			            if (turno == 0) {
			                matriz[fila][columna] = simbolo1; // Jugador 1 usa "X"
			            } else {
			                matriz[fila][columna] = simbolo2; // Jugador 2 usa "O"
			            }
			            jugadaValida = false; // La jugada es válida, se sale del bucle
			        } else {
			            System.out.println("Esa posición ya está ocupada. Intenta de nuevo.");
			        }
			}
			    
			 // Alternar turno entre los jugadores
	            turno = (turno + 1) % 2; // Cambiar entre 0 y 1 (alternando turnos)
	            
			
	}
	}

}
