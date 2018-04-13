package src4;

public class Vivienda {
	int numHabitaciones;
	int numCajonesEstacionamiento;
	int numBanios;
	int antiguedad;
	boolean jardin;
	boolean cocinaIntegral;
	
	
	
	public void pagarServicios() {
		System.out.println("Hay que pagar los servicios (Agua, Luz y Gas)");
		if(jardin == true) {
			System.out.println("Y hay que pagarle al jardinero! D:");
		}
	}

	
	
	
	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public int getNumCajonesEstacionamiento() {
		return numCajonesEstacionamiento;
	}

	public void setNumCajonesEstacionamiento(int numCajonesEstacionamiento) {
		this.numCajonesEstacionamiento = numCajonesEstacionamiento;
	}

	public int getNumBanios() {
		return numBanios;
	}

	public void setNumBanios(int numBanios) {
		this.numBanios = numBanios;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	public boolean isCocinaIntegral() {
		return cocinaIntegral;
	}

	public void setCocinaIntegral(boolean cocinaIntegral) {
		this.cocinaIntegral = cocinaIntegral;
	}
	
	
	
	
	
	
}
