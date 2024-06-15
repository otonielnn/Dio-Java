package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        this.alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoRemover = null;
        if (!this.alunoSet.isEmpty()) {
            for (Aluno a: this.alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoRemover = a;
                    break;
                }
            }
            this.alunoSet.remove(alunoRemover);
        } else {
            System.out.println("O conjunto está vázio.");
        }

        if (alunoRemover == null) {
            System.out.println("Número de matricula não encontrado no conjunto.w");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(this.alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(this.alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(this.alunoSet);
    }
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("otoniel", 1, 6.5);
        gerenciadorAlunos.adicionarAluno("jorge", 2, 7);
        gerenciadorAlunos.adicionarAluno("jorge", 1, 6.5);

        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
