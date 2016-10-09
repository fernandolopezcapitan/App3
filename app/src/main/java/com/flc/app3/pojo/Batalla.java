package com.flc.app3.pojo;

/**
 * Created by Fernando López on 09/10/2016.
 */

public class Batalla {

    int diferencia;
    String ejercitoLocal;
    String ejercitoVisi;
    String fecha;
    boolean disputadaScroll;
    String jugadorLocal;
    String jugadorVisi;
    String mapa;
    int ptsLocal;
    int ptsVisi;
    String vencedor;
    String youtube;

    public Batalla() {
    }

    public Batalla(int diferencia, String ejercitoLocal, String ejercitoVisi, String fecha, boolean disputadaScroll, String jugadorLocal, String jugadorVisi, String mapa, int ptsLocal, int ptsVisi, String vencedor, String youtube) {
        this.diferencia = diferencia;
        this.ejercitoLocal = ejercitoLocal;
        this.ejercitoVisi = ejercitoVisi;
        this.fecha = fecha;
        this.disputadaScroll = disputadaScroll;
        this.jugadorLocal = jugadorLocal;
        this.jugadorVisi = jugadorVisi;
        this.mapa = mapa;
        this.ptsLocal = ptsLocal;
        this.ptsVisi = ptsVisi;
        this.vencedor = vencedor;
        this.youtube = youtube;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public String getEjercitoLocal() {
        return ejercitoLocal;
    }

    public void setEjercitoLocal(String ejercitoLocal) {
        this.ejercitoLocal = ejercitoLocal;
    }

    public String getEjercitoVisi() {
        return ejercitoVisi;
    }

    public void setEjercitoVisi(String ejercitoVisi) {
        this.ejercitoVisi = ejercitoVisi;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isDisputadaScroll() {
        return disputadaScroll;
    }

    public void setDisputadaScroll(boolean disputadaScroll) {
        this.disputadaScroll = disputadaScroll;
    }

    public String getJugadorLocal() {
        return jugadorLocal;
    }

    public void setJugadorLocal(String jugadorLocal) {
        this.jugadorLocal = jugadorLocal;
    }

    public String getJugadorVisi() {
        return jugadorVisi;
    }

    public void setJugadorVisi(String jugadorVisi) {
        this.jugadorVisi = jugadorVisi;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public int getPtsLocal() {
        return ptsLocal;
    }

    public void setPtsLocal(int ptsLocal) {
        this.ptsLocal = ptsLocal;
    }

    public int getPtsVisi() {
        return ptsVisi;
    }

    public void setPtsVisi(int ptsVisi) {
        this.ptsVisi = ptsVisi;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }
}