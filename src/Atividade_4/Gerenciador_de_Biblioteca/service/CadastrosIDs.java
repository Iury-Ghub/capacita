package Atividade_4.Gerenciador_de_Biblioteca.service;

import Atividade_4.Gerenciador_de_Biblioteca.exceptions.IDNaoEncontradoExeption;
import Atividade_4.Gerenciador_de_Biblioteca.model.ID;

import java.util.ArrayList;

public class CadastrosIDs {
    private ArrayList<ID> IDs;

    public CadastrosIDs() {
        this.IDs = new ArrayList<>();
    }

    public ID IDNovo(){
        return IDNovo("L");
    }

    public ID IDNovo(String classificacao){
       int numeroID = 1;
       while (true){
           boolean existe = false;
           for(ID idExistente:this.IDs){
               if(idExistente.toString().equals((String)(classificacao+numeroID))){
                   existe = true;
                   break;
               }
           }
           if(!existe){
               break;
           }
           numeroID++;
       }
       ID novo = new ID(classificacao,numeroID);
       this.IDs.add(novo);
       return novo;
    }

    public ID encontrarID(String id)throws IDNaoEncontradoExeption {
        String classificacao = id.substring(0, 1);
        String apenasNumero = id.substring(1).replace(" ", "");
        int numero = Integer.parseInt(apenasNumero);
        boolean encontrou = false;

        for (ID idEscolhido : this.IDs) {
            if (classificacao.equals(idEscolhido.getClassificacao()) && idEscolhido.getNumero() == numero) {
                return idEscolhido;
            }
    }if(!encontrou) {
            throw new IDNaoEncontradoExeption("O ID não foi encontrado");
        }
        return null;
    }

    public void removerID(ID id){
        IDs.remove(id);
    }
}
