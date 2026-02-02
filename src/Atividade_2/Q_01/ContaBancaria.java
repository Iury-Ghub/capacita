package Atividade_2.Q_01;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public void depositar(double deposito){
        saldo+=deposito;
    }
    public void sacar(double saque){
        saldo-=saque;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTirular() {
        return titular;
    }

    public void setTirular(String tirular) {
        this.titular = tirular;
    }

    public double getSaldo() {
        return saldo;
    }

}
