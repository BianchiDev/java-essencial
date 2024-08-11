package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com um número: ");
        int valor = sc.nextInt();
        
        System.out.println("Entre com outro valor: ");
        int outroValor = sc.nextInt();
        
        int resultado = valor + outroValor;
        
        if (resultado >= 8 && outroValor >= 5) {
            System.out.println("O segundo valor é um número maior ou igual a 5");
        } else if (resultado <= 8 && outroValor < 5) {
            System.out.println("O segundo valor é um número menor que 5");
        } else if (valor == outroValor) {
            System.out.println("Os seus valores são iguais!");
        } else {
            System.out.println("Nenhuma das condições foi satisfeita.");
        }
        
        sc.close();
    }
}
