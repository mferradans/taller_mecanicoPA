
package com.mycompany.tallermecanico.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Tecnico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_tecnico;
    private String nombre;
    private String legajo;
    private String direccion;
    private String telefono;
    private String email;

    public Tecnico() {
    }

    public Tecnico(int id_tecnico, String nombre, String legajo, String direccion, String telefono, String email) {
        this.id_tecnico = id_tecnico;
        this.nombre = nombre;
        this.legajo = legajo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
