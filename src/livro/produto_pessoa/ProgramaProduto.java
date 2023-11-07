package livro.produto_pessoa;

public class ProgramaProduto {
	public static void main(String[] args) {

		// Declaração de um objeto
		Produto p0;

		// Declarando/ instanciação /Iniciação do objeto
		Produto p1 = new Produto();
		p1.nome = "Notbook";
		p1.preco = 2.397f;
		p1.desconto = 15.0f;

		System.out.println("=================Preço=====================");
		System.out.println(p1.nome);
		System.out.println("R$ " + p1.preco);
		System.out.println(p1.desconto);

	}
}
