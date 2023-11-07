package livro.estoque;

public class CalculadoraEstoque {

	public static void main(String[] args) {

		double LivroTDD = 59.99;
		double livroJava8 = 59.99;

		double soma = LivroTDD + livroJava8;

		System.out.println("O total de livro em estoque é: " + soma);

		if (soma < 150) {// exprressão boolena

			System.out.println("Seu estoque esta baixo!");
		} else if (soma >= 200) {
			System.out.println("Seu estoque esta muito bom!");
		} else {
			System.out.println("Seu estou esta bom!");
		}

		int numero = 4;
		int outroNumero = numero;

		numero = numero + 5;

		System.out.println(outroNumero);

		String texto = "Eu sou uma String";

		System.out.println(texto);

	}

}
