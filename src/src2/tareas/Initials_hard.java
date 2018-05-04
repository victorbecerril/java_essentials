//Implemente un programa que, dado el nombre de una persona, imprima las iniciales de la personas, como se muestra abajo.
//
//Tome en cuenta que la persona podria introducir palabras con iniciales en minuscular, o espacios extra entre palabras, como se muestra abajo.
//
//$ ./iniciales_dificil
//regulus Arcturus black
//RAB
//
//$ ./iniciales_dificil
//     thomas     gordon black



package src2.tareas;

import libs.Input;

public class Initials_hard {
	
	public static void main(String[] args) {
		String originalString = Input.get_string().trim().toUpperCase();

		String[] processedString = originalString.split("\\s+");
		
		for(int i=0 ; i<processedString.length ; i++) {
			System.out.print(processedString[i].charAt(0));
		}
	}
}
