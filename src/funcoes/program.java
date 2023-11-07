package funcoes;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		 
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int s01 = sr.nextInt();
		
		System.out.println("Digite outro número");
		int s02 = sr.nextInt();
		
		System.out.println("Digite outro número");
		int s03 = sr.nextInt();
		
		int higher = max(s01, s02, s03);
		
		showResult(higher);
		sr.close();
	}
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Highter = " + value);
	}
	
}
