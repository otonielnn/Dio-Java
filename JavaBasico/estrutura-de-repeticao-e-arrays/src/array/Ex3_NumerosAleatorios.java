package array;

import java.util.Random;

import javax.swing.BoundedRangeModel;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[5];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Números Aleatórios: ");
        for (int sucessor : numerosAleatorios) {
            System.out.print(++sucessor + " ");
        }

        System.out.print("\nAntecessor dos Números Aleatórios: ");
        for (int antecessor : numerosAleatorios) {
            System.out.print(--antecessor + " ");
        }
    }
}
