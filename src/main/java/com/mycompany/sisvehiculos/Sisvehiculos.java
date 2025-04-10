/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sisvehiculos;

/**
 *
 * @author igarlo
 */
public class Sisvehiculos {

    public static void main(String[] args) {
       vehiculos vehi1= new auto("Mercedes-Benz","S-Class (S 580 4MATIC)","conduciendo");
       vehiculos vehi2= new moto("Ducati","Panigale V4 S","conduciendo");
       vehiculos vehi3= new camion("Scania","S 770 V8","conduciendo");
       
       vehi1.conducir();
       vehi2.conducir();
       vehi3.conducir();
        
    }
}