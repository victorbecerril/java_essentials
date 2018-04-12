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
		for(int i=0;i<height;i++) {
			for(int j=height;j>=0;j--) {
				if(i<j-1){
					System.out.print(" ");
				}else if (i>=j){
					System.out.print("#");
				}
			}
			System.out.println("#");
		}
		
	}

}
