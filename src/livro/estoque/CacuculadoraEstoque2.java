package livro.estoque;

/*
 *  Utilizando while
 * 
 */

public class CacuculadoraEstoque2 {
	public static void main(String[] args) {
		double soma = 0;
		int contador = 0;

		while (contador < 35) {
			double valorDoLivro = 59.90;
			// soma = soma + valorDoLivro;
			soma += valorDoLivro; // Operador de atribuição
			contador = contador++; // Operador unário
		}
		System.out.println("O total em estoque é: " + soma);

		if (soma < 150) {

			System.out.println("Seu estoque esta baixo!");
		} else if (soma >= 200) {
			System.out.println("Seu estoque esta muito auto!");
		} else {
			System.out.println("Seu estou esta bom!");
		}
	}

}
