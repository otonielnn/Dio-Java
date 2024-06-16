package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long distintos= numeros.stream()
        .distinct().count();

        if (distintos == numeros.size()) {
            System.out.println("Todos números são distintos.");
        } else {
            System.out.println("Existem número iguais.");
        }
    }
}
