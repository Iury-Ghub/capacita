package Atividade_3.Q_03;

import java.util.ArrayList;

class Comodo{
    private String nome;
    private double tamanho;

    public Comodo(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
class Casa{
    ArrayList<Comodo> comodos;

    public Casa() {
        this.comodos = new ArrayList<>();
    }

    public void adicionar(Comodo comodo){
        comodos.add(comodo);
    }

    public void listar(){
        for(Comodo comodo:comodos){
            System.out.println(comodo.getNome());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        Comodo comodo = new Comodo("Cadeira", 60);
        casa.adicionar(comodo);
        casa.listar();
    }
}
