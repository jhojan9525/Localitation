package com.senasoft_2.localitation.Pojo;

public class PojoAdaptador {


    String fecha, coordenadas;

    public PojoAdaptador(String fecha, String coordenadas) {

        this.fecha = fecha;
        this.coordenadas = coordenadas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
}
