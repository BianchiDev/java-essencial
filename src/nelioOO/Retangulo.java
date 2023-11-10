package nelioOO;

import java.util.Scanner;

import entities.retangulo;

public class Retangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a largura do retângulo: ");
		double largura = scanner.nextDouble();

		System.out.println("Digite a altura do retângulo: ");
		double altura = scanner.nextDouble();

		retangulo retangulo1 = new retangulo(largura, altura);

		System.out.println("A área do retângulo é: " + retangulo1.getArea());
		System.out.println("O perímetro do retângulo é: " + retangulo1.getPerimetro());
		System.out.println("A diagonal do retângulo é: " + retangulo1.getDiagonal());

		scanner.close();
	}

}
