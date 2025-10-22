package fag;

public class Filme {
	private String titulo;
	private double avaliacao;
	
	public Filme(String titulo, double avaliacao) {
		setTitulo(titulo);
		setAvaliacao(avaliacao);
	}
	
	public void exibir() {
		System.out.printf("Filme: %s | Avaliação: %f\n", this.getTitulo(), this.getAvaliacao());
	}
	
	private String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		if(!titulo.trim().isEmpty() || titulo != null) this.titulo = titulo;
	}
	
	public double getAvaliacao() {
		return this.avaliacao;
	}
	
	public void setAvaliacao(double avaliacao) {
		if(avaliacao >= 0 && avaliacao <=5)  this.avaliacao = avaliacao;
	}
	
}
