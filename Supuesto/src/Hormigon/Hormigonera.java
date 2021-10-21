/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hormigon;

import Materiales.Material;
import interfaces.Mezclar;

/**
 *
 * @author Ahmed
 */
public class Hormigonera extends Equipo implements Mezclar{
    
    int ejes;
    
    public Hormigonera(){
        
    }
    
    public Hormigonera(int id, int capacidad, int ejes){
        super(id,capacidad);
        this.ejes=ejes;
    }

    @Override
    public String toString(){
        return super.toString() + " ejes: " + ejes;
    }
    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    @Override
    public void mezclar() {
        System.out.println("Mezclando 1 parte de cemento, 2 partes de arena, 3 partes de grava y Agua");
    }
    
    
}
