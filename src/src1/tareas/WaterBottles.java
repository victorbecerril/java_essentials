//Implementa un programa que reporte el uso de agua de un usuario que dura x minutos en la ducha expresado en botellas de agua.
//$ ./botellas_agua
//Minutos: 1
//Botellas: 12
//
//$ ./botellas_agua
//Minutos: 10
//Botellas: 120

package src1.tareas;

import libs.Input;

public class WaterBottles {

	public static void main(String[] args) {
		minsToBottles();
	}

	public static void minsToBottles() {
		System.out.print("Minutos: ");
		int mins = Input.get_int();
		System.out.println("Botellas: " + (mins * 12));
	}

}