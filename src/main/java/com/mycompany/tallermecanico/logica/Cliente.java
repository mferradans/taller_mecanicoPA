
package com.mycompany.tallermecanico.logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.*;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    
    @OneToMany (mappedBy="cliente")
    private LinkedList<Vehiculo> listaVehiculo;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String direccion, String telefono, String email, LinkedList<Vehiculo> listaVehiculo) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.listaVehiculo = listaVehiculo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public LinkedList<Vehiculo> getListaVehiculo() {
        return listaVehiculo;
    }

    public void setListaVehiculo(LinkedList<Vehiculo> listaVehiculo) {
        this.listaVehiculo = listaVehiculo;
    }
    public void addVehiculoLista(Vehiculo v){
        this.listaVehiculo.add(v);
    }

}
