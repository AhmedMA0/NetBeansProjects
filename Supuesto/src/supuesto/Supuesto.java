/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supuesto;

import Hormigon.Cisterna;
import Hormigon.Hormigonera;
import Maquinaria.Excavadora;
import Materiales.Arena;
import Materiales.Cemento;
import Materiales.Grava;
import Materiales.Material;

/**
 *
 * @author Ahmed
 */
public class Supuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Excavadora ex1 = new Excavadora(1, "Hyundai");
        Cisterna ci1 = new Cisterna(2, 100);
        Hormigonera ho1 = new Hormigonera(3, 1000, 3);
        
        ex1.excavar(new Arena());        
        ex1.excavar(new Grava());
        ci1.transportar(new Cemento());
        
        System.out.println(ci1.toString());

        ho1.mezclar();
        
                Cisterna ci2 = new Cisterna();
                
               System.out.println(ci2.equals(ci1));

        
    }
    
}
