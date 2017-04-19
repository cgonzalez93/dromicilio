/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrmonterrosa.dromicilio.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mr. Robot
 */
public class CargarArchivo {
    public static String load_file(String path){
        FileReader fileReader = null;
        String aux = "";
        try {
            String cadena;
            fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((cadena = bufferedReader.readLine())!=null) {
                aux += cadena+"\n";
            }   
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CargarArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CargarArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(CargarArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return aux;
    }
}
