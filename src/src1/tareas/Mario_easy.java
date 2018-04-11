//Implementa un programa que imprima una media piramide de una altura especificada por el usuario, como abajo:
//
//$ ./mario
//Altura: 5
//    ##
//   ###
//  ####
// #####
//######
//
//$ ./mario
//Altura: 3
//  ##
// ###
//####

package src1.tareas;

import libs.Input;

public class Mario_easy {

	public static void main(String[] args) {
		createPyramid();
	}

	public static void createPyramid() {
		System.out.print("Altura: ");
		int height = Input.get_int();
		for(int i=height;i>0;i--) {
			for(int j=0;j<height;j++) {
				if(j<i-1){
					System.out.print(" ");
				}else {
					System.out.print("#");
				}
			}
			System.out.println("#");
		}
		
	}

}
