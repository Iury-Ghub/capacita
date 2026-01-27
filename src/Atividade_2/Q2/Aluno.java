package Atividade_2.Q2;

public class Aluno {
    private String nome;
    private int nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {

        return nota;
    }

    public void setNota(int nota) {
        if ((nota <= 10) && (nota > 0)) {
            this.nota = nota;
        }else{
            System.out.println("Sua nota não pode ser alterada");
        }
    }
}
