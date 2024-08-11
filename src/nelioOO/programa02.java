package nelioOO;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class programa02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Entre com a data do produto");
		System.out.println("Nome: ");
		product.nome = sc.nextLine();
		System.out.println("preco:  ");
		product.preco = sc.nextDouble();
		System.out.println("Quantidade de estoque: ");
		product.quantidade = sc.nextInt();

		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Insira a quantidade de produtos a serem adicionados em estoque: ");
		int quantidade = sc.nextInt();
		product.adicionarProduto(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		System.out.println();
		System.out.print("Insira o número de produtos a serem retirados do estoque: ");
		quantidade = sc.nextInt();
		product.retirarProduto(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		sc.close();
	}
}
