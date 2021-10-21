/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maquinaria;

import Materiales.Material;
import interfaces.Excavar;

/**
 *
 * @author Ahmed
 */
public class Excavadora extends Maquinaria implements Excavar{
    
    String modelo;

    public Excavadora() {
    }

    public Excavadora(int id, String modelo) {
        super(id);
        this.modelo = modelo;
    }
    
     @Override
    public String toString(){
        return super.toString() + "modelo: " + modelo;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void excavar(Material mat) {
        System.out.println("Excavando: " + mat.getClass().getSimpleName());
    }
    
    
}
