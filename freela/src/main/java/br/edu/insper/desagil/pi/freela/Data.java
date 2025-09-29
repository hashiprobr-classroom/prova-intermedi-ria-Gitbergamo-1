package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    Map<Integer, Integer> limite;

    public Data(int ano, int mes, int dia){
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        Map<Integer, Integer> limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;
    }



    public int getAno() {
        return ano;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }

    public void atualiza(int ano, int mes, int dia){
        if(ano>=1970 && ano<=2070){
            this.ano = ano;
        }
        else{
            this.ano = ajusta(ano, 1970, 2070);

        }
        if(mes>=1 && mes<=12){
            this.mes = mes;
        }
        else{
            this.mes = ajusta(mes, 1, 12);
        }
        if (dia>=1 && dia<=31){
            this.dia = dia;
        }
        else{
            this.dia = ajusta(dia, 1, 12);
        }
    }

    @Override
    public int minutos(){
        int minutos = 0;
        int minutosEmAno = (24*60)*365;
        int ano = getAno();
        int mes = getMes();
        int dia = getDia();
        atualiza(ano, mes, dia);

        int deltaAno = ano - 1970;
        minutos += (deltaAno*minutosEmAno);


        int i = 1;
        while(i < mes){
            minutos += (this.limite.get(i)*24*60);
            i+=1;
        }

        minutos += dia*24*60;





        return minutos;
    }

}
