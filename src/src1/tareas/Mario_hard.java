//Implementa un programa que muestre una piramide doble como la que se muestra abajo.
//
//$ ./mario
//Altura: 4
//   #  #
//  ##  ##
// ###  ###
//####  ####


package src1.tareas;

import libs.Input;

public class Mario_hard {

	public static void main(String[] args) {
		createPyramid();
	}
	
	public static void createPyramid() {
		System.out.print("Altura: ");
		int height = Input.get_int();
		for(int i=height;i>0;i--) {
			for(int j=0,k=height*2;j<height*2;j++,k--) {
				if(j<i-1){
					System.out.print(" ");
				}else if (j>=i&&k>=i) {
					System.out.print("#");
					if(j==k) {
						System.out.print("  #");
					}
				}
			}
			System.out.println("");
		}
	}
}
