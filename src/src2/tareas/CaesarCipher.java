//Implemente el cifrado de Cesar, como se muestra abajo.
//
//$ ./cifrado_cesar 13
//mensaje inicial:  HELLO
//mensaje cifrado: URYYB


package src2.tareas;

import libs.Input;

public class CaesarCipher {

	public static void main(String[] args) {
		System.out.print("mensaje inicial:  ");
		String originalString = new String(Input.get_string());
		System.out.print("mensaje cifrado: ");

		for(int i=0 ; i < originalString.length() ; i++ ) {
			if(originalString.charAt(i)>=65 && originalString.charAt(i)<=77) {
				System.out.print((char) (originalString.charAt(i)+13));
			}else if (originalString.charAt(i)>=78 && originalString.charAt(i)<=90) {
				System.out.print((char) (originalString.charAt(i)-13));
			}
		}
	}
}
