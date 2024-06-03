package list.pesquisas;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numerosList = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public int calcularSoma() {
        int total = 0;

        for (int n: numerosList) {
            total += n;
        }
        return total;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        
        if (!numerosList.isEmpty()) {
            for (int n: numerosList) {
                if (n > maior) {
                    maior = n;
                }
            }
            return maior;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;

        if (!numerosList.isEmpty()) {
            for (int n: numerosList) {
                if (n < menor) {
                    menor = n;
                }
            }
            return menor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Numeros Adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());

        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    }
}
