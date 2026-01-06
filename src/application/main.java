package application;

import model.Aluno;
import model.Pessoa;
import model.Professor;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){


        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Professor("Pedro", 3L, 44, 2000.0));
        pessoas.add(new Aluno(2L, "Joao", 14, 15613));

        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa.descricao());
        }

    }
}
