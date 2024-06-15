package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatMap;

    public AgendaContatos() {
        this.agendaContatMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        this.agendaContatMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!this.agendaContatMap.isEmpty()) {
            this.agendaContatMap.remove(nome);
        } else {
            System.out.println("A agenda está vázia.");
        }
    }

    public void exibirContato() {
        System.out.println(this.agendaContatMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numero = null;
        if (!this.agendaContatMap.isEmpty()) {
            numero = this.agendaContatMap.get(nome);
        }
        return numero;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("otoniel", 1);
        agendaContatos.adicionarContato("camilla", 2);
        agendaContatos.adicionarContato("jorge", 3);
        agendaContatos.adicionarContato("julio", 4);
        agendaContatos.adicionarContato("pedro", 5);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("jorge"));

        agendaContatos.removerContato("jorge");

        agendaContatos.exibirContato();
    }
}
