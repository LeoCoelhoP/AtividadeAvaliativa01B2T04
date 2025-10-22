package fag;

public class ProdutoEstoque {
	private String nome;
	private int quantidade;
	
	public ProdutoEstoque(String nome, int quantidade) {
		setNome(nome);
		setQuantidade(quantidade);
	}
	
	public int adicionarEstoque(int quantidade) {
		if (quantidade > 0) this.quantidade += quantidade;
		return this.quantidade;
	}
	
	public int removerEstoque(int quantidade) {
		if (quantidade > 0 && this.quantidade - quantidade >= 0) {
			this.quantidade -= quantidade;
		}
		return this.quantidade;
	}
	
	public void mostrarEstoque() {
		System.out.printf("Produto: %s\nQuantidade em estoque: %d\n", this.nome, this.quantidade);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome != null && !nome.trim().isEmpty()) {
			this.nome = nome;
		}
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		if (quantidade >= 0) {
			this.quantidade = quantidade;
		}
	}
}
