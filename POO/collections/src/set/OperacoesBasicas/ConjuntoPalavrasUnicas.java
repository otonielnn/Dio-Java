package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!this.palavrasUnicas.isEmpty()) {
            if (this.palavrasUnicas.contains(palavra)) {
                this.palavrasUnicas.remove(palavra);
            } else {
                System.out.println("Está palavra não existe dentro do conjunto.");
            }
        } else {
            System.out.println("O conjunto está vázio.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return this.palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!this.palavrasUnicas.isEmpty()) {
            System.out.println(this.palavrasUnicas);
        } else {
            System.out.println("O conjutno está vázio.");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("banana");
        conjuntoPalavrasUnicas.adicionarPalavra("banana");
        conjuntoPalavrasUnicas.adicionarPalavra("maça");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("maça");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A fruta 'Abacaxi' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Abacaxi"));
        System.out.println("A fruta 'maça' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("maça"));
    }
}
