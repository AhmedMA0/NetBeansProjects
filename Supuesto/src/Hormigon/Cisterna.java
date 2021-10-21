/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hormigon;

import Materiales.Material;
import interfaces.Transporte;

/**
 *
 * @author Ahmed
 */
public class Cisterna extends Equipo implements Transporte{
    
    
    public Cisterna(){
        
    }
    
    public Cisterna(int id,int capacidad){
        super(capacidad, id);
    }

    @Override
    public void transportar(Material mat) {
        System.out.println("Transportando: " + mat.getClass().getSimpleName());
    }
}
