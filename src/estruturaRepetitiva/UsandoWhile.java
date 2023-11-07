package estruturaRepetitiva;

import java.util.Scanner;

public class UsandoWhile {
	public static void main(String[] args) {
		
		Scanner test =  new Scanner(System.in);
		
		System.out.println("Digite um valor que seja diferente de zero para ser somado.");
		int entrada = test.nextInt();
		System.out.println("Digite outro número  para ser somado ao final");
		
		int soma  = 0;
		
		// Faça enquanto a condição não for atendida. 
		while (entrada != 0) {
			
			//soma = soma + entrada;
			
			soma += entrada;
			
			entrada = test.nextInt();
			
			System.out.println("Digite outro número  para ser somado ao final");
		
		}
		System.out.println("O valor da sonma é: " + soma);
		
		test.close();
	}

}
