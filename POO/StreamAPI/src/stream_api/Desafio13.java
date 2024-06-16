package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        System.out.print("Limite minimo: ");
        int limiteMinimo = scan.nextInt();
        System.out.print("Limite máximo: ");
        int limiteMaximo = scan.nextInt();
        scan.close();

        numeros.stream()
        .distinct()
        .filter((n) -> n > limiteMinimo && n < limiteMaximo)
        .forEach(System.out::println);
    }
}
