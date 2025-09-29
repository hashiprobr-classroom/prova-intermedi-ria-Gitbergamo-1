package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;

public class Lista {
    private ArrayList<Tarefa> tarefas;
    public Lista(ArrayList<Tarefa> tarefas){
        this.tarefas = new ArrayList<Tarefa>();
    }
    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }



    public void adiciona(Tarefa tarefa){
       int idTarefa = tarefa.getId();
       int i =0;
        boolean contem = false;
       while(i < tarefas.size() && contem == false ){

           Tarefa tarefaLocal = tarefas.get(i);
           int tarefaLocalId = tarefaLocal.getId();
           if (tarefaLocalId == idTarefa){
               contem = true;
           } else if (i == tarefas.size()-1) {
               if (tarefaLocalId == idTarefa){
                   contem = true;
               }
               else{
                   tarefas.add(tarefa);
               }


           }

       }

    }

}
//acabei esquecendo de comitar na main