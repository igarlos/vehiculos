/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sisvehiculos;

/**
 *
 * @author igarlo
 */
public class auto extends vehiculos {
     private String estado;

    public auto(String marca, String modelo, String estado) {
        super(marca, modelo);
        this.estado = estado;
    }
    
    @Override
    
    public void conducir(){
    System.out.println(estado+" un auto de marca "+marca+" y  modelo "+modelo);
    }  
}
