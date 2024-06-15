package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        this.produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(this.produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPrecProdutos = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPrecProdutos.addAll(this.produtoSet);
        return produtosPorPrecProdutos;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "produto 2", 1, 5);
        cadastroProdutos.adicionarProduto(2, "produto 1", 2, 3);
        cadastroProdutos.adicionarProduto(1, "produto 3", 1, 6);
        cadastroProdutos.adicionarProduto(4, "produto 4", 4, 2);


        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

