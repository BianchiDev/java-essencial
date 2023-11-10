package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	 Scanner sc = new  Scanner(System.in);
	 System.out.println("Entre com um número: ");
	 int valor = sc.nextInt();
	 System.out.println("Entre com outro valor: ");
	 int outroValor = sc.nextInt();
	 
	  int resultado = valor  + outroValor;
	   
	  if(resultado >= 8 && valor < 4) {
		  System.out.println("O segundo valor é um númeoro maior ou igual a 5 ");
	  }else if(resultado <= 8 && valor >= 5 || valor <= 6) {
		  System.out.println("O segundo valor é um número menor que 5");
	  }else {
		  System.out.println("Os seus valores sáo iguais!");
	  }
	 
	}

}
