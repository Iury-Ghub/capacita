package Atividade_2.Q5;

import java.time.LocalDate;

class Produto{
    private String nome;
    private double preco;

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
}
class ProdutoAlimenticio extends Produto{
    private LocalDate dataValidade;

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(){
        LocalDate hoje = LocalDate.now();
        return hoje.isAfter(this.dataValidade);
    }
}

public class Main {
    public static void main(String[] args) {
        ProdutoAlimenticio leite = new ProdutoAlimenticio();
        leite.setNome("Leite Integral");
        leite.setPreco(4.5);

        leite.setDataValidade(LocalDate.of(2020,1,1));

        System.out.println("Produto: "+ leite.getNome());

        ProdutoAlimenticio miojo = new ProdutoAlimenticio();

        miojo.setNome("Miojo");
        miojo.setPreco(3.5);

        miojo.setDataValidade(LocalDate.of(2027,1,1));

        System.out.println("Produto: "+ miojo.getNome());

    }
}
