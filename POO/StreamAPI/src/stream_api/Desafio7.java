package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
        .distinct()
        .sorted((a, b) -> Integer.compare(b, a))
        .skip(1)
        .findFirst();

        System.out.println("O Segundo maior número é: " + segundoMaior.get());
    }
}
