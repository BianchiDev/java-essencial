package livro.livro;

public class Livro {

	String nome;
	String descricao;
	String isbn;
	private double valor;
	Autor autor;
	// String nomeDoAltor;
	// String emailDoAltor;
	// String cpfDoAltor;
	String mensagem = "Mostrar detalhe do livro.";

	public Livro() {
		System.out.println("Novo Livro criado!");
	}

	boolean temAutor() {
		return this.autor != null;
	}

	void getValor(double valor) {
		this.valor = valor;
	}

	double setValor() {
		return this.valor;
	}

	void mostrarDetalhes() {
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("ISBN:  " + isbn);
		System.out.println("Valor: " + valor);

		if (this.temAutor()) { // acessa o método temAutor e se sim, mostraDetalhes.
			autor.mostrarDetalhes();
		}

		System.out.println("--");
	}

	public boolean aplicandoDesconctoDe(double porcentagem) {

		if (porcentagem > 0.3) {
			System.out.println("Desconto não pode ser maior que 30%");
			return true;
		}
		this.valor -= this.valor * porcentagem;
		return false;
	}

}
