package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        this.contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c: this.contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c: this.contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Otoniel", 12345);
        agendaContatos.adicionarContato("Otoniel", 0);
        agendaContatos.adicionarContato("Otoniel Júnior", 123);
        agendaContatos.adicionarContato("Otoniel Java", 1234);
        agendaContatos.adicionarContato("Otoniel", 12345);
        agendaContatos.adicionarContato("João Pedro", 12344);

        agendaContatos.exibirContatos();

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("João Pedro", 123456));

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Oto"));
    }
}
