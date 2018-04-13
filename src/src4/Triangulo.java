package src4;

public class Triangulo {
	//propiedades o campos
	float base;
	float altura;
	
	
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	
	//metodos o comportamiento
	public float sacarArea() {
		float area = (this.base*this.altura)/2;
		return area;
	}
	public float sacarPerimetro() {
		float perimetro = (this.base)*3;
		return perimetro;
	}
	
	public String toString(){
		return "Base: " + this.base + "\n" + "Altura: " + this.altura;
	}

}
