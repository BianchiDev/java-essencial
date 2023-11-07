package livro.produto_pessoa;
public class Produto {
	String nome;
	float preco;
	float desconto;

	void aumentarPreco(float valor) {
		this.preco = this.preco + valor;
	}
}
