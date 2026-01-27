package Atividade_2.Q3;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}

class Main{
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Estojo");
        produto.setPreco(9.50);
        produto.setQuantidadeEstoque(3);

        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: R$ "+produto.getPreco());
        System.out.println("Estoque: "+produto.getQuantidadeEstoque());

    }
}
