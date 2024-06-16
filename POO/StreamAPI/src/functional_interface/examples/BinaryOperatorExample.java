package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;

        int resultado = numeros.stream().reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("A soma dos números da lista é: " + resultado);
    }
}
