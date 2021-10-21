/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hormigon;

import Materiales.Material;
import interfaces.Cargar;

/**
 *
 * @author Ahmed
 */
public class Bañera extends Equipo implements Cargar{
    
    
    public Bañera(){
        
    }
    
    public Bañera(int id, int capacidad){
        super(capacidad, id);
    }

    @Override
    public void cargar(Material mat) {
        System.out.println("Cargando: " + mat.getClass().getSimpleName());
    }
}
