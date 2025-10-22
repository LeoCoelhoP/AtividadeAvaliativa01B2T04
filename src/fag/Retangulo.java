package fag;

public class Retangulo {
	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		setLargura(largura);
		setAltura(altura);
	}
	public double area() {
		return this.getAltura() * this.getLargura();
	}
	public double perimetro() {
		return 2 * (this.getLargura() + this.getAltura());
	}
	public double getLargura() {
		return largura;
	}
	
	public void setLargura(double largura) {
		if(largura > 0) this.largura = largura;
	}
	
	public double getAltura() {
		return largura;
	}
	
	public void setAltura(double altura) {
		if(altura > 0) this.altura = altura;
	}
}
