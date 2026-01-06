package application;

import model.Aluno;
import model.Pessoa;
import model.Professor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args){


        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Professor("Pedro", 3L, 44, 2000.0));
        pessoas.add(new Aluno(2L, "Joao", 14, 15613));

        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa.descricao());
        }

        Map<Long, Pessoa> mapaPessoas = new HashMap<>();
        mapaPessoas.put(1L, new Aluno(1L, "Rafa", 14, 123));
        mapaPessoas.put(2L, new Professor("Carlos", 2L, 44, 5000.0));

        Pessoa pessoa = mapaPessoas.get(2L);
        System.out.println(pessoa);

    }
}
