package dobackaofront;

import java.util.ArrayList;

public class Carrinho {
    private double preco;
    private ArrayList<Item> itens;

    public Carrinho() {
        this.preco = 0;
        this.itens = new ArrayList<>();
    }

    public void adcionar(Item item, int quantidade) {
        itens.add(item);

        preco += item.getPreco()*quantidade;  //somar o preço X quantidade
        item.setQuantidade(item.getQuantidade()-quantidade); //diminuir a quantidade de itens

        System.out.println("Item: " + item.getNome() + ", Preço Unitário: R$ " + item.getPreco() + ". Quantidade: " + quantidade + ", Preço da Quantidade: R$ " + item.getPreco()*quantidade);
    }
    //remove o item do carrinho
    public void remover(Item item, int quantidade) {
        itens.remove(item);
        preco -= item.getPreco()*quantidade;
        item.setQuantidade(item.getQuantidade()+quantidade); //adcionar o item na quantidade

        System.out.println("Item Removido: " + item.getNome() + ", Preço Unitário: R$ " + item.getPreco() + ". Quantidade Removida: " + quantidade + ", Preço da Quantidade Removida: R$ " + item.getPreco()*quantidade);
    }

    public void apresentarPreco() {
        System.out.println("Valor a pagar R$ " + preco);
    }
}
