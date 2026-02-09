package Atividade_5.FinTrack.model;

public class ID {
    public static int contador=0;
    String tipo;
    int numero;

    public ID(String tipo) {
        this.tipo = tipo;
        this.numero = contador++;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.valueOf(getTipo()+getNumero());
    }
}
