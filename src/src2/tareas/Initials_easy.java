//Implemente un programa que, dado el nombre de una persona, imprima las iniciales de la personas, como se muestra abajo.
//
//$ ./iniciales_facil
//Regulus Arcturus Black
//RAB


package src2.tareas;

import libs.Input;

public class Initials_easy {

	public static void main(String[] args) {
		String originalString = Input.get_string();
		String[] splittedText = originalString.split(" ");
		
		for(int i=0 ; i < splittedText.length ; i++) {
			System.out.print(splittedText[i].charAt(0));
		}

	}

}
