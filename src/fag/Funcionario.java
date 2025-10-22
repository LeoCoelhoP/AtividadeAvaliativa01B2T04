package fag;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}
	public double aumentarSalario(double percentual) {
		return this.salario += this.salario * percentual / 100;
	}
	public void mostrarSalario() {
		System.out.printf("Sr(a). %s \nO seu salário é de: %f reais\n", this.getNome(), this.getSalario());
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if(!nome.trim().isEmpty() || nome != null) this.nome = nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		if(salario > 0) this.salario = salario;
	}
}
