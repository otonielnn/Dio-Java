package repeticao;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int soma = 0;
        int maior = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;

            if (numero > maior) maior = numero;
            
            ++contador;
        } while (contador < 5);

        int media = soma / contador;

        System.out.println("Maior: " + maior);
        System.out.println("media: " + media);
    }
}
