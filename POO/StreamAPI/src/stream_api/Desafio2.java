package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int resultado = numeros.stream()
        .filter((n) -> n % 2 == 0)
        .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("A soma dos números da lista é: " + resultado);
    }
}
