
package com.mycompany.tallermecanico.logica;

import java.io.Serializable;
import javax.persistence.*;
@Entity
public class Modelo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_modelo;
    private String nombre;
    @OneToOne
    private Marca marca;
    //private LinkedList<Vehiculo> listaVehiculos;

    public Modelo() {
    }

    public Modelo(int id_modelo, String nombre, Marca marca) {
        this.id_modelo = id_modelo;
        this.nombre = nombre;
        this.marca = marca;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    
}
