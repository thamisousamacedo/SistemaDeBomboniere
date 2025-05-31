package dobackaofront;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Laka", 1, 100, 9.90, Categoria.CHOCOLATES);
        Item item2 = new Item("Talento", 2, 100, 7.90, Categoria.CHOCOLATES);
        Item item3 = new Item("Bis", 3, 100, 4.90, Categoria.CHOCOLATES);
        Item item4 = new Item("KitKat", 4, 100, 4.90, Categoria.CHOCOLATES);
        Item item5 = new Item("Cheetos", 5, 200, 3.50, Categoria.PIPOCAS);
        Item item6 = new Item("Salgadinho Coringa", 6, 300, 1.50, Categoria.PIPOCAS);
        Item item7 = new Item("Pipoca Boni", 6, 500, 1.50, Categoria.PIPOCAS);

        //System.out.println(item1.toString());

        Carrinho carrinho = new Carrinho();

        carrinho.adcionar(item1, 3); //total 29,70
        System.out.println("Quantidade atualizada: " + item1.getQuantidade());
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        carrinho.adcionar(item7, 30); //total 45,00
        System.out.println("Quantidade atualizada: " + item7.getQuantidade());
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        carrinho.remover(item7, 15); //total removido -22,50
        System.out.println("Quantidade atualizada: " + item7.getQuantidade());
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        carrinho.apresentarPreco(); //74,70 novo total 52,20
    }
}