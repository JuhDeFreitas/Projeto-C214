package org.atividade;
import com.google.gson.Gson;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        Aluno aluno = new Aluno("Pedro", 90, 60);

        //coonvertendo o objeto java para JSON
        String Json = gson.toJson(aluno);

        System.out.println("\nObjeto em JSON: " + aluno.getNome());

        Aluno novoAluno = gson.fromJson(Json, Aluno.class);

        System.out.println("\nArquivo JSON em formato java class: " + novoAluno.getNome());

    }
}