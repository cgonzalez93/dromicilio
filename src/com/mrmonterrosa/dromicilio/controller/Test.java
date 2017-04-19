/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrmonterrosa.dromicilio.controller;

import java.util.Scanner;

/**
 *
 * @author Mr. Robot
 */
public class Test {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE NUMERO DE FILAS");
        int filas = entrada.nextInt();
        System.out.println("DIGITE NUMERO DE COLUMNAS");
        int columnas = entrada.nextInt();
        int matriz[][] = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i % 2 != 0) {
                    matriz[i][j] = 1;
                }
                if (j % 2 != 0) {
                    matriz[i][j] = 1;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
