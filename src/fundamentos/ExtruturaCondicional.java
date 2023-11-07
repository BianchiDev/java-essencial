package fundamentos;

import java.util.Scanner;

public class ExtruturaCondicional {
	public static void main(String[] args) {
		Scanner teste = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Digite a hora: ");
		hora = teste.nextInt();
		
		if(hora <= 12 && hora > 0) {
			System.out.println("Bom dia!");
		
		}else if(hora > 12 && hora <= 18) {
				 System.out.println("Boa tarde!");
				}
				else {
					System.out.println("Boa noite!");
				}
		
			
		teste.close();
		
	}

}

/*
 * Usando o encadeamento, ou seja, dentro de uma estrutura que utiliza mais de
 * uma condicional if else, criamos ela dentro do else, como o exemplo a seguir.
 */
