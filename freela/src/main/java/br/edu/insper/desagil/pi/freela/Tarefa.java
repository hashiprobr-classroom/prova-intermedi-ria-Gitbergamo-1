package br.edu.insper.desagil.pi.freela;

public class Tarefa {
    private int id;
    private String descricao;
    private Momento inicio;
    private Momento fim;

    public Tarefa(int id, String descricao, Momento inicio, Momento fim){
        this.id = id;
        this.descricao = descricao;
        this.inicio = null;
        this.fim = null;
    }
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
        int minutos1 = inicio.minutos();
        int minutos2 = fim.minutos();
        if(minutos2 > minutos1){
            this.inicio = inicio;
            this.fim = fim;
        }else{
            throw new IllegalStateException("impossivel");
        }

    }




}
