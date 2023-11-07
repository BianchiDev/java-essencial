package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Introducao {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Com o locale, não precisa usar virgula, apenas ponto.
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		
		System.out.println("Você digitou: " + x);
		
		int y;
		
		y = sc.nextInt();
		
		System.out.println("Voce digitou o número inteiro: " + y );
		
		 double z;
		 z = sc.nextDouble();// Como esta configurada como portugues do brasil, usa-se virgula 
		 
		 System.out.println("Você digitou o número flutuante: " + z);
		 
		 char b;
		 
		 b = sc.next().charAt(0); // Pega o priméiro caracter

		 System.out.println("Voce digitou o número inteiro: " + b );
		 
		sc.close();
	}
}
