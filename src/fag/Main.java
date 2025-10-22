package fag;

public class Main {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Leonardo Padilha", 1313);
		conta.depositar(200);
		conta.mostrarSaldo();
		conta.sacar(100);
		conta.mostrarSaldo();
		
		System.out.println();
		Filme primeiroFilme = new Filme("Jackass 3", 5.0);
		primeiroFilme.exibir();
		Filme segundoFilme = new Filme("Jackass 2", 4.5);
		segundoFilme.exibir();
		
		System.out.println();
		Funcionario funcionario = new Funcionario("Leonardo", 1500);
		funcionario.mostrarSalario();
		funcionario.aumentarSalario(10);
		funcionario.mostrarSalario();
		
		System.out.println();
		Retangulo retangulo = new Retangulo(10, 10);
		System.out.printf("Area: %f\n", retangulo.area());
		System.out.printf("Perimetro: %f\n", retangulo.perimetro());
		
		System.out.println();
		Musica primeiraMusica = new Musica("Lepo Lepo", 400);
		System.out.printf("Música: %s | Duração: %s\n", primeiraMusica.getTitulo(), primeiraMusica.formatarDuracao());
		Musica segundaMusica = new Musica("Olha a onda!", 300);
		System.out.printf("Música: %s | Duração: %s\n", segundaMusica.getTitulo(), segundaMusica.formatarDuracao());
	
		System.out.println();
		Pessoa pessoa = new Pessoa("Leonardo", 75, 1.80);
		System.out.printf("IMC: %.2f\n", pessoa.calcularIMC());
		System.out.printf("Classificação: %s\n", pessoa.classificacaoIMC());

		System.out.println();
		ContaLuz contaLuz = new ContaLuz(250, 0.85);
		System.out.printf("Valor total da conta de luz: %.2f reais\n", contaLuz.calcularValorTotal());
		
		System.out.println();
		BicicletaAlugada aluguel = new BicicletaAlugada(3, 12.5);
		aluguel.exibirValorFinal();
		
		System.out.println();
		ProdutoEstoque produto = new ProdutoEstoque("Monitor Mancer", 10);
		produto.mostrarEstoque();
		produto.adicionarEstoque(5);
		produto.removerEstoque(3);
		produto.mostrarEstoque();
		
		System.out.println();
		Temperatura temp = new Temperatura(25);
        temp.mostrarTemperaturas();
	}
}
