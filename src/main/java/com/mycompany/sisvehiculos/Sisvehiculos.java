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
       vehiculos auto1= new auto("Mercedes-Benz","S-Class (S 580 4MATIC)","conduciendo");
       vehiculos auto2 = new auto("BMW", "i7 xDrive60", "conduciendo");
       vehiculos auto3 = new auto("Audi", "A8 L 60 TFSI e quattro", "conduciendo");
       vehiculos auto4 = new auto("Porsche", "Panamera Turbo E-Hybrid", "conduciendo");
       vehiculos auto5 = new auto("Lexus", "LS 500h", "conduciendo");

       vehiculos moto1 = new moto("Ducati", "Panigale V4 S", "conduciendo");
       vehiculos moto2 = new moto("Yamaha", "MT-09 SP", "conduciendo");
       vehiculos moto3 = new moto("BMW", "R 1250 GS", "conduciendo");
       vehiculos moto4 = new moto("Kawasaki", "Ninja H2", "conduciendo");
       vehiculos moto5 = new moto("Harley-Davidson", "Street Glide Special", "conduciendo");

       
       vehiculos camion1 = new camion("Scania", "S 770 V8", "conduciendo");
       vehiculos camion2 = new camion("Volvo", "FH16 750", "conduciendo");
       vehiculos camion3 = new camion("Mercedes-Benz", "Actros 1863", "conduciendo");
       vehiculos camion4 = new camion("MAN", "TGX 18.640", "conduciendo");
       vehiculos camion5 = new camion("Kenworth", "W990", "conduciendo");
       
       conducirtodos(auto1, auto2, auto3, auto4, auto5, moto1, moto2, moto3, moto4, moto5, camion1, camion2, camion3, camion4, camion5);
        
    }
    public static void conducirtodos(vehiculos...vehiculos) {
        for (vehiculos v : vehiculos) {
            v.conducir(); 
        }
    }
}