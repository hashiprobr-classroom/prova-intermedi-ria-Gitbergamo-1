package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento{
    private int hora;
    private int minuto;
    private Data data;

    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }

    public void atualiza(int hora, int minuto){
        if(hora>=0 && hora <=23){
            this.hora = hora;
        }
        else{
            this.hora = ajusta(hora,0,23);
        }
        if(minuto>=0 && minuto<=59){
            this.minuto = minuto;
        }
        else{
            this.minuto = ajusta(minuto,0,59);
        }

    }



    @Override
    public int minutos(){
        return 0;
    }
}
