package br.edu.insper.desagil.pi.freela;

public class Tarefa {
    private int id;
    private String descricao;
    private Momento inicio;
    private Momento fim;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Momento getInicio() {
        return inicio;
    }
    public Momento getFim() {
        return fim;
    }

    public void atualiza(Momento inicio, Momento fim){

    }




}
