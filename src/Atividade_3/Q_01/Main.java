package Atividade_3.Q_01;

class Motor{
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }
    public Motor(Motor outromotor){
        this.potencia = outromotor.potencia;
    }
    public int getPotencia(){
        return potencia;
    }
}

class Carro{
    private String modeloCarro;
    private Motor tipoMotor;

    public Carro(String modeloCarro, Motor tipoMotor) {
        this.modeloCarro = modeloCarro;
        if(tipoMotor != null){
            this.tipoMotor = new Motor(tipoMotor);
        }else{
            this.tipoMotor = null;
        }
    }

    public void ligar(){
        if(this.tipoMotor == null){
            System.out.println("O carro não pode ser ligado");
        }else {
            System.out.println("O carro pode ser ligado");
        }
    }

    public Motor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(Motor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
}

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(200);
        Carro carro = new Carro("Sandeiro",null);
        carro.ligar();
        carro.setTipoMotor(motor);
        carro.ligar();
    }
}
