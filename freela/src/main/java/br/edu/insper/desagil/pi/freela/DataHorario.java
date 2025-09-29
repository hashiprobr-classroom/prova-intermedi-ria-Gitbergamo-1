package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento{
    private int hora;
    private int minuto;
    private Data data;

    public DataHorario(int hora, int minuto, Data data){
        this.hora = 0;
        this.minuto = 0;
        this.data = data;

    }
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
        int minutos = 0;
        int minutosEmAno = (24*60)*365;
        int minuto = getMinuto();
        int hora = getHora();
        Data data = getData();
        int ano = data.getAno();
        int mes = data.getMes();
        int dia = data.getDia();

        data.atualiza(ano, mes, dia);
        atualiza(hora, minuto);

        int deltaAno = ano - 1970;
        minutos += (deltaAno*minutosEmAno);


        int i = 1;
        while(i < mes){
            minutos += (data.limite.get(i)*24*60);
            i+=1;
        }

        minutos += (dia-1)*24*60;
        minutos += hora * 60 + minuto;







        return minutos;
    }
}
