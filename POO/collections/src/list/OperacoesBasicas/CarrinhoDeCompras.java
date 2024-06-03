package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinho;
    
    public CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> ItemsParaRemover = new ArrayList<>();

        if (!carrinho.isEmpty()) {
            for (Item i: carrinho) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    ItemsParaRemover.add(i);
                }
            }
            carrinho.removeAll(ItemsParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    
    public void calcularValorTotal() {
        float total = 0;

        if (!carrinho.isEmpty()) {
            for (Item i: carrinho) {
                total += i.getPreco();
            }
    
            System.out.println("Valor total do carrinho: " + total);
        } else {
            System.out.println("A listá está vazia!");
        }
    }

    public void exibirItens() {
        if (!carrinho.isEmpty()) {
            System.out.println(carrinho);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionarItem("Lápis", 2, 3);
        carrinho.adicionarItem("Lápis", 2, 3);
        carrinho.adicionarItem("Caderno", 35, 3);
        carrinho.adicionarItem("Borracha", 2, 3);

        carrinho.exibirItens();

        carrinho.removerItem("Lápis");

        carrinho.exibirItens();

        carrinho.calcularValorTotal();
    }
}
