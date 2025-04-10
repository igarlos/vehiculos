/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sisvehiculos;

/**
 *
 * @author igarlo
 */
public class moto extends vehiculos{
    private String estado;

    public moto(String marca, String modelo, String estado) {
        super(marca, modelo);
        this.estado = estado;
    }
    
    @Override
    
    public void conducir(){
    System.out.println(estado+" un moto de marca "+marca+" y  modelo "+modelo);
    }
    
}
