package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!this.palavrasMap.isEmpty()) {
            if (this.palavrasMap.containsKey(palavra)) {
                this.palavrasMap.remove(palavra);
            }
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(this.palavrasMap);
    }
}
