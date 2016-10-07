package com.flc.app3.pojo;

/**
 * Created by Fernando López on 07/10/2016.
 */

public class Jornada {

    String nombre, ej1,ej2,ej3,ej4,e5,pts,comment;
    boolean jugada;

    public Jornada() {
    }

    public Jornada(String nombre, String ej1, String ej2, String ej3, String ej4, String e5, String pts, String comment, boolean jugada) {
        this.nombre = nombre;
        this.ej1 = ej1;
        this.ej2 = ej2;
        this.ej3 = ej3;
        this.ej4 = ej4;
        this.e5 = e5;
        this.pts = pts;
        this.comment = comment;
        this.jugada = jugada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEj1() {
        return ej1;
    }

    public void setEj1(String ej1) {
        this.ej1 = ej1;
    }

    public String getEj2() {
        return ej2;
    }

    public void setEj2(String ej2) {
        this.ej2 = ej2;
    }

    public String getEj3() {
        return ej3;
    }

    public void setEj3(String ej3) {
        this.ej3 = ej3;
    }

    public String getEj4() {
        return ej4;
    }

    public void setEj4(String ej4) {
        this.ej4 = ej4;
    }

    public String getE5() {
        return e5;
    }

    public void setE5(String e5) {
        this.e5 = e5;
    }

    public String getPts() {
        return pts;
    }

    public void setPts(String pts) {
        this.pts = pts;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isJugada() {
        return jugada;
    }

    public void setJugada(boolean jugada) {
        this.jugada = jugada;
    }
}
