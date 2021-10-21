/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hormigon;

/**
 *
 * @author JesusAhmedEmilio
 * @version 3.0
 * @since 1.0
 * @see "https://docs.google.com/document/d/1njV5Acx4sy2kfyQmp9s5olTuEOoYMIBt8LL3l-xLSr0/edit?usp=sharing"
 */
public abstract class Equipo {
    
    /**
     * El identificador de cada pieza del Equipo de Hormigón
     */
    int id;
    
    /**
     * La capacidad de cada pieza del Equipo
     */
    int capacidad;
    
    public Equipo(){
        
    }

    public Equipo(int equipo, int id) {
        this.capacidad = equipo;
        this.id=id;
    }
    
    @Override
    public String toString(){
        return "id: " + id + " capacidad: " + capacidad;
    }
    
    /*
    *Una comparación
    *Realiza una comparación con otro objeto recibido como parametro y devuelve true si son iguales segun el criterio de la función.
    *@param {Equipo} other - Un objeto de tipo equipo para ser comparado.
    *@version 2.0
    *@since 2.0
    *@throws nullPointerException if id is null.
    */
    public boolean equals(Equipo other){
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    
    public void setCapacidad(Equipo other){
        this.capacidad=capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
