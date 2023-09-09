
package com.mycompany.tallermecanico.logica;

import java.io.Serializable;
import javax.persistence.*;
@Entity
public class Marca implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_marca;
    private String nombre;
    
    //private LinkedList<Modelo> listaModelos;
    //private LinkedList<Vehiculo> listaVehiculos;

    public Marca(int id_marca, String nombre) {
        this.id_marca = id_marca;
        this.nombre = nombre;
    }

    public Marca() {
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
