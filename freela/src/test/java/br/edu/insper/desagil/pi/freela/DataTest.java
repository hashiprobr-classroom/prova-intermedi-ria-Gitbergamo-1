package br.edu.insper.desagil.pi.freela;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;

import java.util.Map;
;


public class DataTest {

    @Test
    public void constroi(){
        Data data = new Data(225, 4, 8);
        int dia = data.getDia();
        int ano = data.getAno();
        int mes = data.getMes();
        int minutos = data.minutos();
        AssertTrue(dia == 1 && mes ==1 && ano ==1970 && minutos ==0);
    }

}
