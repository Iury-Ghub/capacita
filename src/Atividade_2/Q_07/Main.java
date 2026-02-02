package Atividade_2.Q_07;

class Animal{
    public void fazerSom(){
        System.out.println("...");
    }
}

class Cachorro extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("Auau");
    }
}

class Gato extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("Miau");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[2];
        animais[0] = new Cachorro();
        animais[1] = new Gato();

        animais[0].fazerSom();
        animais[1].fazerSom();
    }
}
