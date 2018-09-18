package com.senasoft_2.localitation;

import java.util.ArrayList;
import java.util.List;

public class Datos {

String fecha;
String coordenadas;


    Datos(String fecha, String coordenadas){

        this.fecha=fecha;
        this.coordenadas=coordenadas;

    }


    private List<Datos> datolist;

    private void iniciar(){
        datolist = new ArrayList<>();
        datolist.add(new Datos("22/08/2018","1234"));
        datolist.add(new Datos("22/08/2018","123"));
        datolist.add(new Datos("22/08/2018","12"));
    }
}
