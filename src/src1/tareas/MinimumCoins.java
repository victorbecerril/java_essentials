//Implementa un programa que muestre el numero minimo de monedas necesarias para darle el cambio a un usuario.
//
//$ ./minimo_monedas
//Hola!  Cuanto cambio te debo?O hai!
//0.41
//4

//Coins:
//	25c
//	10c
//	5c
//	1c



package src1.tareas;

import libs.Input;

public class MinimumCoins {

	public static void main(String[] args) {
		giveChange();
	}

	private static void giveChange() {
		System.out.println("Hola!  Cuanto cambio te debo?O hai!");
		float change = Input.get_float();
		int countCoins=0;
		
//		System.out.println(countCoins + (change/0.25));
//		System.out.println(countCoins + (change%0.25));
//		System.out.println(Math.round(countCoins + (change/0.25)*100)/100.0);
//		System.out.println(Math.round(countCoins + (change%0.25)*100)/100.0);
//		
//		System.out.println("\n\n" + change/0.25);
//		System.out.println(change%0.25);
//		System.out.println(Math.round((change/0.25)*100)/100.0);
//		System.out.println(Math.round((change%0.25)*100)/100.0);
		
		if(((Math.round((change/0.25)*100)/100.0)>0)||((Math.round((change%0.25)*100)/100.0)>0)){
			countCoins+=(int) ((Math.round((change/0.25)*100)/100.0));
			change=(float) ((Math.round((change%0.25)*100)/100.0));
			if (change>0) {
				if (((Math.round((change/0.1)*100)/100.0)>0)||((Math.round((change%0.1)*100)/100.0)>0)) {
					countCoins+=(int) ((Math.round((change/0.1)*100)/100.0));
					change=(float) ((Math.round((change%0.1)*100)/100.0));
					if(change>0) {
						if (((Math.round((change/0.05)*100)/100.0)>0)||((Math.round((change%0.05)*100)/100.0)>0)) {
							countCoins+=(int) ((Math.round((change/0.05)*100)/100.0));
							change=(float) ((Math.round((change%0.05)*100)/100.0));
							if(change>0) {
								if (((Math.round((change/0.01)*100)/100.0)>0)||((Math.round((change%0.01)*100)/100.0)>0)) {
									countCoins+=(int) ((Math.round((change/0.01)*100)/100.0));
									change=(float) ((Math.round((change%0.01)*100)/100.0));
								}
							}
						}	
					}
				}
			}
		}
		
		System.out.println(+countCoins);
	}

}
