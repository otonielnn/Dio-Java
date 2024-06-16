package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
        .limit(3)
        .toList();

        // listaSaudacoes.forEach(s -> System.out.println(s));
        listaSaudacoes.forEach(System.out::println);
    }
}
