package Atividade_2.Q_06;

enum Departamento{
    RH,ADMINISTRATIVO,GERENCIA
}

class Funcionario{
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

class Gerente extends Funcionario{
    public Gerente(Departamento departamento, String nome, double salario) {
        super(nome, salario);
    }
}

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(Departamento.GERENCIA, "Lucas", 4000.00);
    }

}
