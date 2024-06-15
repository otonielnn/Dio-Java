package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!this.dicionarioMap.isEmpty()) {
            this.dicionarioMap.remove(palavra);
        } else {
            System.out.println("O dicionário está vázio.");
        }
    }

    public void exibirPalavra() {
        System.out.println(this.dicionarioMap);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("paz", "relação tranquila entre cidadãos; ausência de problemas, de violência");
        dicionario.adicionarPalavra("cachorro", "filhote de lobo, onça, leão, hiena");
        dicionario.adicionarPalavra("gato", "pequeno mamífero carnívoro, doméstico, da fam. dos felídeos");

        dicionario.exibirPalavra();

        dicionario.removerPalavra("cachorro");

        dicionario.exibirPalavra();
    }
}
