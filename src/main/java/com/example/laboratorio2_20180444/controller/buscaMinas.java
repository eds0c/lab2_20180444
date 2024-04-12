package com.example.laboratorio2_20180444.controller;

public class buscaMinas {
    private int numFilas;
    private int numColumnas;
    private int numIntentos;
    private int numBombas;
    private String posicion;

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public void setNumIntentos(int numIntentos) {
        this.numIntentos = numIntentos;
    }

    public int getNumBombas() {
        return numBombas;
    }

    public void setNumBombas(int numBombas) {
        this.numBombas = numBombas;
    }
}
