
package com.mycompany.tallermecanico.logica;

import java.io.Serializable;
import javax.persistence.*;
@Entity
public class Vehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_vehiculo;
    
    @OneToOne
    private Marca marca;
    @OneToOne
    private Modelo modelo;
    
    private String anio;
    private String patente;
    private String kilometraje;
    private String estado;
    
    @ManyToOne
    private Cliente cliente;

    public Vehiculo() {
    }

    public Vehiculo(int id_vehiculo, Marca marca, Modelo modelo, String anio, String patente, String kilometraje, String estado, Cliente cliente) {
        this.id_vehiculo = id_vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.patente = patente;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.cliente = cliente;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
