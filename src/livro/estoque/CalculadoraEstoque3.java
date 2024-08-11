package livro.estoque;


public class CalculadoraEstoque3 {

	public static void main(String[] args) {
		double soma = 0;
		
		for (double i = 0; i < 35; i++) {
			soma += 59.90;
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
