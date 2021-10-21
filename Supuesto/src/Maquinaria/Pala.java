/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maquinaria;

import Materiales.Material;
import interfaces.Recoger;

/**
 *
 * @author Ahmed
 */
public class Pala extends Maquinaria implements Recoger{

    public Pala() {
    }
    
    public Pala(int id){
        super(id);
    }

    @Override
    public void recoger(Material mat) {
        System.out.println("Recogiendo: " + mat.getClass().getSimpleName());
    }
    
   
}
