package Atividade_2.Q9;

abstract class Veiculo{
    public abstract void mover();
}

class Carro extends Veiculo{
    @Override
    public void mover() {
        System.out.println("O carro está se movendo");
    }
}

class Biciclta extends Veiculo{
    @Override
    public void mover(){
        System.out.println("A bicicleta está de movendo");
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Biciclta();

        carro.mover();
        bicicleta.mover();
    }
}
