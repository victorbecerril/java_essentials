package src4;

public class EjemploDelTriangulo {

	public static void main(String[] args) {
		Triangulo t = new Triangulo(5,3);
		
		System.out.println("El area del tri�ngulo es: " + t.sacarArea());
		System.out.println("El perimetro del tri�ngulo es: " + t.sacarPerimetro());
		
	}

}
