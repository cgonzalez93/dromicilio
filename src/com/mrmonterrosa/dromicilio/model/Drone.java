/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrmonterrosa.dromicilio.model;

import java.awt.Point;

/**
 *
 * @author Mr. Robot
 */
public class Drone {
    
    private int coordenada_x;
    private int coordenada_y;
    private char punto_cardinal;
    private Point ubicacion;

    public int getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    public char getPunto_cardinal() {
        return punto_cardinal;
    }

    public void setPunto_cardinal(char punto_cardinal) {
        this.punto_cardinal = punto_cardinal;
    }
    
    public Point getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Point ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
