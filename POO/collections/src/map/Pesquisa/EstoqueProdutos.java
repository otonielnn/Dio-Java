package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        this.estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(this.estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!this.estoqueProdutosMap.isEmpty()) {
            for (Produto p : this.estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!this.estoqueProdutosMap.isEmpty()) {
            for (Produto p : this.estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!this.estoqueProdutosMap.isEmpty()) {
            for (Produto p : this.estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        double maiorValorTotal = Double.MIN_VALUE;
        Produto produtoMaiorValorTotal = null;
        if (!this.estoqueProdutosMap.isEmpty()) {
            for (Produto p : this.estoqueProdutosMap.values()) {
                if (p.getPreco() * p.getQuantidade() > maiorValorTotal) {
                    maiorValorTotal = p.getPreco() * p.getQuantidade();
                    produtoMaiorValorTotal = p;
                }
            }
        }
        return produtoMaiorValorTotal;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "biscoito", 10, 2);
        estoqueProdutos.adicionarProduto(2, "maça", 6, 2.5);
        estoqueProdutos.adicionarProduto(3, "arroz", 4, 1.5);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

        System.out.println("Produto com maior valor total: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

        estoqueProdutos.exibirProdutos();
    }
}
