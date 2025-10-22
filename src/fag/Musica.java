package fag;

public class Musica {
	private String titulo;
	private int duracaoSegundos;
	
	public Musica(String titulo, int duracaoSegundos) {
		setTitulo(titulo);
		setDuracaoSegundos(duracaoSegundos);
	}
	
	public String formatarDuracao() {
		int minutos = getDuracaoSegundos() / 60;
		int segundos = getDuracaoSegundos() % 60;
		return String.format("%02d:%02d", minutos, segundos);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}
	}
	
	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}
	
	public void setDuracaoSegundos(int duracaoSegundos) {
		if (duracaoSegundos > 0) {
			this.duracaoSegundos = duracaoSegundos;
		}
	}
}
