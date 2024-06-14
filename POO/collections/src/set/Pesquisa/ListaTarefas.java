package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!this.listaTarefas.isEmpty()) {
            for (Tarefa t: this.listaTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            this.listaTarefas.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vázio");
        }

        if (tarefaParaRemover == null) {
            System.out.println("A Tarefa não foi encontrada no array!");
        }
    }

    public void exibirTarefas() {
        System.out.println(this.listaTarefas);
    }

    public int contarTarefas() {
        return this.listaTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t: this.listaTarefas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t: this.listaTarefas) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t: this.listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t: this.listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaPendente = t;
                break;
            }
        }

        if (tarefaPendente != null) {
            if (tarefaPendente.isConcluida()) {
                tarefaPendente.setConcluida(false);
            }
        } else {
            System.out.println("A tarefa não foi encontrada na lista.");
        }
    }

    public void limparListaTarefas() {
        if (this.listaTarefas.isEmpty()) {
            System.out.println("A lista já está vázia");
        } else {
            this.listaTarefas.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer caminhada");
        listaTarefas.adicionarTarefa("Ler Livro");

        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Fazer caminhada");
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("Fazer caminhada");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
