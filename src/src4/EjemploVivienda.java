package src4;

public class EjemploVivienda {

	public static void main(String[] args) {
		int numHabitaciones = 12;
		System.out.println("\n\nVivienda: ");
		Vivienda vivienda = new Vivienda();
		vivienda.setNumHabitaciones(1);
		vivienda.setNumCajonesEstacionamiento(0);
		vivienda.setNumBanios(1);
		vivienda.setAntiguedad(15);
		vivienda.setJardin(false);
		vivienda.setCocinaIntegral(true);
		System.out.println("Esta vivienda cuenta con: "+vivienda.getNumHabitaciones()+" habitaciones, "+vivienda.getNumCajonesEstacionamiento()+" cajones de estacionamiento y "+vivienda.getNumBanios()+" ba�os");
		vivienda.pagarServicios();
		
		System.out.println("\n\nMansion X: ");
		Mansion mansion = new Mansion();
		mansion.setNumHabitaciones(5);
		mansion.setNumCajonesEstacionamiento(15);
		mansion.setNumBanios(5);
		mansion.setAntiguedad(18);
		mansion.setJardin(true);
		mansion.setCocinaIntegral(true);
		System.out.println("Esta mansi�n cuenta con: "+mansion.getNumHabitaciones()+" habitaciones, "+mansion.getNumCajonesEstacionamiento()+" cajones de estacionamiento y "+mansion.getNumBanios()+" ba�os");
		mansion.pagarServicios();
		mansion.partyHard();
		
		System.out.println("\n\nCasa del Infonavit: ");
		CasaInfonavit casaInf = new CasaInfonavit();
		System.out.println("Esta casa del Infonavit cuenta con: "+casaInf.getNumHabitaciones()+" habitaciones, "+casaInf.getNumCajonesEstacionamiento()+" cajones de estacionamiento y "+casaInf.getNumBanios()+" ba�os");
		casaInf.pagarServicios();

	}

}
