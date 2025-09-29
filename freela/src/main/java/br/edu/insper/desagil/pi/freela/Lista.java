package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;

public class Lista {
    private ArrayList<Tarefa> tarefas;

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public Lista(ArrayList<Tarefa> tarefas){
        this.tarefas = new ArrayList<Tarefa>();
    }

}
