package Atividade_3.Q_02;

class Departamento{
    private String nome=null;

    public Departamento() {}

    public Departamento(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
class Professor{
    private String nome;
    private Departamento nomeDepartamento;

    public Professor(String nome,Departamento nomeDepartamento) {
        this.nome = nome;
        this.nomeDepartamento = nomeDepartamento;
    }
    public String departamento(){
        if(this.nomeDepartamento.getNome() == null){
            return "Professor sem departamento";
        }else {
            return this.nomeDepartamento.getNome() + ": " + getNome();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(Departamento nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }
}

public class Main {
    public static void main(String[] args) {
        Departamento dpA = new Departamento();
        Professor professor = new Professor("Augusto",dpA);

        System.out.println(professor.departamento());

    }
}
