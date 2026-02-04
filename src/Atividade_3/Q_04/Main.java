package Atividade_3.Q_04;

import java.util.ArrayList;

class Aluno{
    private String nome;
    private int idade;
    private int semeste;

    public Aluno(String nome, int idade, int semeste) {
        this.nome = nome;
        this.idade = idade;
        this.semeste = semeste;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSemeste() {
        return semeste;
    }

    public void setSemeste(int semeste) {
        this.semeste = semeste;
    }
}
class Curso{
    private String nome;
    private final ArrayList<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionar(Aluno aluno){
        alunos.add(aluno);
    }

    public void remover(Aluno aluno){
        if (alunos.remove(aluno)){
            System.out.println("aluno removido");
        }else {
            System.out.println("Nenhum aluno encontrado");
        }
    }
    public void listar(){
        for(Aluno aluno:alunos){
            System.out.println(aluno.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João",19,4);
        Aluno aluno2 = new Aluno("Rafael",21,6);
        Aluno aluno3 = new Aluno("Pedro",18,2);
        Curso curso = new Curso("Engenharia de Software");
        curso.adicionar(aluno1);
        curso.adicionar(aluno2);
        curso.adicionar(aluno3);
        curso.remover(aluno1);
        curso.listar();
    }
}
