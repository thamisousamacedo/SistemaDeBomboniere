package dobackaofront;

public class Item {
    //atributos: nome, id, quantidade, preço, categoria
    private String nome;
    private int id;
    private int quantidade;
    private double preco;
    private Categoria categoria;

    public Item() {
        this.nome = "";
        this.id = 0;
        this.quantidade = 0;
        this.preco = 0;
        this.categoria = null;
    }

    public Item(String nome) {
        this.nome = nome;
        this.id = 0;
        this.quantidade = 0;
        this.preco = 0;
        this.categoria = null;
    }

    public Item(String nome, int id, int quantidade, double preco, Categoria categoria) {
        this.nome = nome;
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }
    //metdos get e set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", categoria=" + categoria.getDescricao() +
                '}';
    }
}
