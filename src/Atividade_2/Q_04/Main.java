package Atividade_2.Q_04;

class Pessoa{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void Ola(){
        System.out.println("Oi, meu nome é: "+nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
class Funcionario extends Pessoa{
    private boolean contratoAtivo;

    public boolean isContratoAtivo() {
        return contratoAtivo;
    }

    public void contrato(){
        if (contratoAtivo == true){
            System.out.println("Eu estou trabalhando...");
        }else{
            System.out.println("Eu não estou trabalhando...");
        }
    }

    public void setContratoAtivo(boolean contratoAtivo) {
        this.contratoAtivo = contratoAtivo;
    }
}
class Engenheiro extends Funcionario{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void salario(){
        System.out.println("Eu ganho R$"+salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro();
        engenheiro.setNome("Lucas");
        engenheiro.setContratoAtivo(true);
        engenheiro.setSalario(1500.0);

        engenheiro.Ola();
        engenheiro.contrato();
        engenheiro.salario();

    }
}
