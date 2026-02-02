package Atividade_2.Q_08;

import java.util.ArrayList;

class Funcionario{
    private double salarioBase;

    public Funcionario(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
class FuncionarioCLT extends Funcionario{



    public FuncionarioCLT(double salarioBase){
        super(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * 0.11);
    }

    public String toString() {
        return "Funcionário CLT";
    }
}

class FuncionarioPJ extends Funcionario{
    public FuncionarioPJ(double salarioBase){
        super(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase()*0.11);
    }

    public String toString() {
        return "Funcionário PJ";
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        double salarioBase = 1500;
        funcionarios.add(new FuncionarioCLT(salarioBase));
        funcionarios.add(new FuncionarioPJ(salarioBase));
        for(Funcionario funcionario:funcionarios){
            System.out.println(funcionario.toString()+": "+funcionario.calcularSalario());
        }
    }
}
