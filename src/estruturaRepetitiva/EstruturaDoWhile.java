package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {
	public static void main(String[] args) {
		/*
		 * Usando a estrutuura "do whlie" para mudar de celso para fahrenheite
		 */

		Locale.setDefault(Locale.US);
		try (Scanner sr = new Scanner(System.in)) {
			char resp;
			do {
				System.out.print("Digite a temperatura em celsius");

				double c = sr.nextDouble();

				double f = (9.0 * c) / 5.0 + 32.0;

				System.out.printf("equivalente a Fahrenheite: %.2f%n", f);
				System.out.println("Deseja repetir(s/n)?");
				resp = sr.next().charAt(0);
			} while (resp != 'n');
		}

		System.out.println("Saiu do programa!");
	}

}
