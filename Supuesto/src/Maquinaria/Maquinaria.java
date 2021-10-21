/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maquinaria;

/**
 *
 * @author Ahmed
 */
public abstract class Maquinaria {
    
    int id;
    
    public Maquinaria() {
    }

    public Maquinaria(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "id: " + id;
    }
    
    public boolean equals(Maquinaria other){
        if (this.id != other.id) {
            return  false;
        }
        return true;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
}
