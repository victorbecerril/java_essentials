package src4;

public class Mansion extends Vivienda{
	private String salaDeJuegos;
	
	public Mansion() {
		super();
		super.numHabitaciones = 23;
		super.numCajonesEstacionamiento = 10;
		super.numBanios = 14;
		super.antiguedad = 2;
		super.jardin = true;
		super.cocinaIntegral = true;
	}
	
	public void pagarServicios() {
		System.out.println("Pagar una fortuna en Servicios");
	}
	
	public void partyHard() {
		System.out.println("Fiesteando con ganas!\n");
	}

	public String getSalaDeJuegos() {
		return salaDeJuegos;
	}

	public void setSalaDeJuegos(String salaDeJuegos) {
		this.salaDeJuegos = salaDeJuegos;
	}

}
