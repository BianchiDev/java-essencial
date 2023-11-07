package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class OperadorAtribuicao {
    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
        Scanner valor = new Scanner(System.in);

        int minuto;
        double conta;
        System.out.println("Digite a quantidade de minutos: ");
        
        // Verifica se o valor digitado é um número inteiro
        if (valor.hasNextInt()) {
            minuto = valor.nextInt();
            
            if (minuto <= 100) {
                conta = 50.00;
                System.out.println("O valor a pagar é " + conta);
            } else if (minuto > 100) {
                conta = 50.00 + (minuto - 100) * 2;
                System.out.println("O valor a pagar é: " + conta);
            }
        } else {
            System.out.println("Esse caracter não é válido, digite novamente.");
        }
        
        valor.close();
    }
}
