//Implementa un programa que imprima una media piramide de una altura especificada por el usuario, como abajo:
//
//$ ./mario
//Altura: 5
//    ##

package src1.tareas;

import libs.Input;

public class Mario_easy {

	public static void main(String[] args) {
		createPyramid();
	}

	public static void createPyramid() {
		System.out.print("Altura: ");
		int height = Input.get_int();
		for(int i=0;i<height;i++) {
			System.out.print(" ");
			for(int j=0;j<i;j++) {
				System.out.print("#");
			}
		}
	}

}
