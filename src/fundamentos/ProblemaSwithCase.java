package fundamentos;

import java.util.Scanner;

public class ProblemaSwithCase {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite um valor de 1 a 7");
			int x = sc.nextInt();
			String dia;

			switch (x) {

				case 1:
					dia = "Domingo";
					break;

				case 2:
					dia = "Segunda";
					break;

				case 3:
					dia = "Terça";
					break;
				case 4:
					dia = "Quarta";
					break;

				case 5:

					dia = "Quinta";
					break;

				case 6:
					dia = "Sexta";
					break;

				case 7:
					dia = "Sábado";
					break;

				default:
					dia = "Valor inválido";
					break;
			}
			System.out.println("O dia da semana é:  " + dia);
		}
	}
}
