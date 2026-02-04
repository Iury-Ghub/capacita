package Atividade_3.Q_06;

import java.util.ArrayList;

abstract class Veiculo{
    private String modelo;
    private int ano;

    public abstract void mover();
}

class Bicicleta extends Veiculo{
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo");
    }
}

class Carro extends Veiculo{

    @Override
    public void mover() {
        System.out.println("O carro está se movendo");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Bicicleta());
        veiculos.add(new Carro());
        for(Veiculo veiculo:veiculos){
            veiculo.mover();
        }
    }
}
