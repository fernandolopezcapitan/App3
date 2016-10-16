package com.flc.app3.pojo;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Fernando López on 09/10/2016.
 */

@IgnoreExtraProperties
public class Jornada {

    public String nombre;
    public String img;
    public String ptsEncabezado;

    public String jugLocal1;
    public String jugVisi1;
    public String jugLocal2;
    public String jugVisi2;
    public String descansa;
    public boolean jugada;
    public String commentJugada;

    //Enfrentamiento 1
    public String ejerLocal1;
    public String ejerVisi1;
    public String mapa1;
    public String vencedor1;
    public int ptsLocal1;
    public int ptsVisi1;
    public int dif1;
    public String fecha1;
    public String youtube1;
    public String comment1;

    //Enfrentamiento 2
    public String ejerLocal2;
    public String ejerVisi2;
    public String mapa2;
    public String vencedor2;
    public int ptsLocal2;
    public int ptsVisi2;
    public int dif2;
    public String fecha2;
    public String youtube2;
    public String comment2;

    public Jornada() {
    }

    public Jornada(String nombre, String img, String ptsEncabezado, String jugLocal1, String jugVisi1, String jugLocal2, String jugVisi2, String descansa, boolean jugada, String commentJugada, String ejerLocal1, String ejerVisi1, String mapa1, String vencedor1, int ptsLocal1, int ptsVisi1, int dif1, String fecha1, String youtube1, String comment1, String ejerLocal2, String ejerVisi2, String mapa2, String vencedor2, int ptsLocal2, int ptsVisi2, int dif2, String fecha2, String youtube2, String comment2) {
        this.nombre = nombre;
        this.img = img;
        this.ptsEncabezado = ptsEncabezado;
        this.jugLocal1 = jugLocal1;
        this.jugVisi1 = jugVisi1;
        this.jugLocal2 = jugLocal2;
        this.jugVisi2 = jugVisi2;
        this.descansa = descansa;
        this.jugada = jugada;
        this.commentJugada = commentJugada;
        this.ejerLocal1 = ejerLocal1;
        this.ejerVisi1 = ejerVisi1;
        this.mapa1 = mapa1;
        this.vencedor1 = vencedor1;
        this.ptsLocal1 = ptsLocal1;
        this.ptsVisi1 = ptsVisi1;
        this.dif1 = dif1;
        this.fecha1 = fecha1;
        this.youtube1 = youtube1;
        this.comment1 = comment1;
        this.ejerLocal2 = ejerLocal2;
        this.ejerVisi2 = ejerVisi2;
        this.mapa2 = mapa2;
        this.vencedor2 = vencedor2;
        this.ptsLocal2 = ptsLocal2;
        this.ptsVisi2 = ptsVisi2;
        this.dif2 = dif2;
        this.fecha2 = fecha2;
        this.youtube2 = youtube2;
        this.comment2 = comment2;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("nombre", nombre);
        result.put("img", img);
        result.put("ptsEncabezado", ptsEncabezado);
        result.put("jugLocal1", jugLocal1);
        result.put("jugVisi1", jugVisi1);
        result.put("jugLocal2", jugLocal2);
        result.put("jugVisi2", jugVisi2);
        result.put("descansa", descansa);
        result.put("jugada", jugada);
        result.put("commentJugada",commentJugada);
        result.put("ejerLocal1", ejerLocal1);
        result.put("ejerVisi1", ejerVisi1);
        result.put("mapa1", mapa1);
        result.put("vencedor1", vencedor1);
        result.put("ptsLocal1", ptsLocal1);
        result.put("ptsVisi1", ptsVisi1);
        result.put("dif1", dif1);
        result.put("fecha1", fecha1);
        result.put("youtube1", youtube1);
        result.put("comment1", comment1);
        result.put("ejerLocal2", ejerLocal2);
        result.put("ejerVisi2", ejerVisi2);
        result.put("mapa2", mapa2);
        result.put("vencedor2", vencedor2);
        result.put("ptsLocal2", ptsLocal2);
        result.put("ptsVisi2", ptsVisi2);
        result.put("dif2", dif2);
        result.put("fecha2", fecha2);
        result.put("youtube2", youtube2);
        result.put("comment2", comment2);
        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPtsEncabezado() {
        return ptsEncabezado;
    }

    public void setPtsEncabezado(String ptsEncabezado) {
        this.ptsEncabezado = ptsEncabezado;
    }

    public String getJugLocal1() {
        return jugLocal1;
    }

    public void setJugLocal1(String jugLocal1) {
        this.jugLocal1 = jugLocal1;
    }

    public String getJugVisi1() {
        return jugVisi1;
    }

    public void setJugVisi1(String jugVisi1) {
        this.jugVisi1 = jugVisi1;
    }

    public String getJugLocal2() {
        return jugLocal2;
    }

    public void setJugLocal2(String jugLocal2) {
        this.jugLocal2 = jugLocal2;
    }

    public String getJugVisi2() {
        return jugVisi2;
    }

    public void setJugVisi2(String jugVisi2) {
        this.jugVisi2 = jugVisi2;
    }

    public String getDescansa() {
        return descansa;
    }

    public void setDescansa(String descansa) {
        this.descansa = descansa;
    }

    public boolean isJugada() {
        return jugada;
    }

    public void setJugada(boolean jugada) {
        this.jugada = jugada;
    }

    public String getCommentJugada() {
        return commentJugada;
    }

    public void setCommentJugada(String commentJugada) {
        this.commentJugada = commentJugada;
    }

    public String getEjerLocal1() {
        return ejerLocal1;
    }

    public void setEjerLocal1(String ejerLocal1) {
        this.ejerLocal1 = ejerLocal1;
    }

    public String getEjerVisi1() {
        return ejerVisi1;
    }

    public void setEjerVisi1(String ejerVisi1) {
        this.ejerVisi1 = ejerVisi1;
    }

    public String getMapa1() {
        return mapa1;
    }

    public void setMapa1(String mapa1) {
        this.mapa1 = mapa1;
    }

    public String getVencedor1() {
        return vencedor1;
    }

    public void setVencedor1(String vencedor1) {
        this.vencedor1 = vencedor1;
    }

    public int getPtsLocal1() {
        return ptsLocal1;
    }

    public void setPtsLocal1(int ptsLocal1) {
        this.ptsLocal1 = ptsLocal1;
    }

    public int getPtsVisi1() {
        return ptsVisi1;
    }

    public void setPtsVisi1(int ptsVisi1) {
        this.ptsVisi1 = ptsVisi1;
    }

    public int getDif1() {
        return dif1;
    }

    public void setDif1(int dif1) {
        this.dif1 = dif1;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getYoutube1() {
        return youtube1;
    }

    public void setYoutube1(String youtube1) {
        this.youtube1 = youtube1;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getEjerLocal2() {
        return ejerLocal2;
    }

    public void setEjerLocal2(String ejerLocal2) {
        this.ejerLocal2 = ejerLocal2;
    }

    public String getEjerVisi2() {
        return ejerVisi2;
    }

    public void setEjerVisi2(String ejerVisi2) {
        this.ejerVisi2 = ejerVisi2;
    }

    public String getMapa2() {
        return mapa2;
    }

    public void setMapa2(String mapa2) {
        this.mapa2 = mapa2;
    }

    public String getVencedor2() {
        return vencedor2;
    }

    public void setVencedor2(String vencedor2) {
        this.vencedor2 = vencedor2;
    }

    public int getPtsLocal2() {
        return ptsLocal2;
    }

    public void setPtsLocal2(int ptsLocal2) {
        this.ptsLocal2 = ptsLocal2;
    }

    public int getPtsVisi2() {
        return ptsVisi2;
    }

    public void setPtsVisi2(int ptsVisi2) {
        this.ptsVisi2 = ptsVisi2;
    }

    public int getDif2() {
        return dif2;
    }

    public void setDif2(int dif2) {
        this.dif2 = dif2;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public String getYoutube2() {
        return youtube2;
    }

    public void setYoutube2(String youtube2) {
        this.youtube2 = youtube2;
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }
}
