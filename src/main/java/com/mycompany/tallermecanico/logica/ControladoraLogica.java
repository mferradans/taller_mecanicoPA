
package com.mycompany.tallermecanico.logica;

import com.mycompany.tallermecanico.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarCliente(String nombre, String email, String direccion, String tel, LinkedList<Vehiculo> listaVehiculos) {
        Cliente cliente=new Cliente();
        cliente.setDireccion(direccion);
        cliente.setEmail(email);
        cliente.setNombre(nombre);
        cliente.setTelefono(tel);
        cliente.setListaVehiculo(listaVehiculos);
        controlPersis.guardarCliente(cliente);
    }
    public ArrayList<Cliente> listarClientes(){
        return controlPersis.listarClientes();
    }

    public void agregarVehiculo(String anio, String km, String patente, Marca marca, Modelo modelo, String estado, Cliente cli) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setAnio(anio);
        vehiculo.setKilometraje(km);
        vehiculo.setPatente(patente);
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setEstado(estado);
        vehiculo.setCliente(cli);
        controlPersis.guardarVehiculo(vehiculo);
    }

    public List<Cliente> traerClientes() {
        return controlPersis.traerClientes();

    }

    public void borrarCliente(int num_cliente) {
        controlPersis.borrarCliente(num_cliente);
    }

    public Cliente traerCliente(int num_cliente) {
        return controlPersis.traerCliente(num_cliente);
    }

    public void modificarCliente(Cliente cliente, String nombre,
            String email, String direccion, String tel,
            LinkedList<Vehiculo> listaVehiculos) {
        cliente.setNombre(nombre);
        cliente.setEmail(email);
        cliente.setDireccion(direccion);
        cliente.setTelefono(tel);
        controlPersis.modificarCliente(cliente);
    }
    public void modificarClienteListaVehiculos(Cliente cliente, Vehiculo v) {
        cliente.addVehiculoLista(v);
        controlPersis.modificarCliente(cliente);
    }

    public List<Vehiculo> traerVehiculos() {
        return controlPersis.traerVehiculos();
    }
    public Vehiculo traerVehiculo(int num_veh) {
        return controlPersis.traerVehiculo(num_veh);
    }

    public void modificarVehiculo(Vehiculo vehiculo, String anio, String km,
            String patente, Cliente claseCliente, Marca marca, Modelo modelo, String estado) {
        vehiculo.setAnio(anio);
        vehiculo.setKilometraje(km);
        vehiculo.setPatente(patente);
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setEstado(estado);
        vehiculo.setCliente(claseCliente);
        controlPersis.modificarVehiculo(vehiculo);
    }

    public void borrarVehiculo(int num_veh) {
        controlPersis.borrarVehiculo(num_veh);
    }

    public List<Modelo> traerModelos() {
        return controlPersis.traerModelos();
    }

    public List<Marca> traerMarcas() {
        return controlPersis.traerMarcas();
    }
    public Marca traerMarca(int num) {
        return controlPersis.traerMarca(num);
    }

    public Modelo traerModelo(int idModelo) {
       return controlPersis.traerModelo(idModelo);

    }

    public void agregarMarca(String nombreMarca) {
        Marca marca = new Marca();
        marca.setNombre(nombreMarca);
        controlPersis.agregarMarca(marca);
        
    }

    public void agregarModelo(String nombreModelo, Marca claseMarca) {
        Modelo modelo = new Modelo();
        modelo.setNombre(nombreModelo);
        modelo.setMarca(claseMarca);
        controlPersis.agregarModelo(modelo);
    }

    public void modificarMarca(Marca marca, String nombre) {
        marca.setNombre(nombre);
        controlPersis.modificarMarca(marca);
    }

    public void borrarMarca(int num_marca) {
        controlPersis.borrarMarca(num_marca);
    }

    public void borrarModelo(int num_modelo) {
        controlPersis.borrarModelo(num_modelo);
    }

    public void modificarModelo(Modelo modelo, String nombre, Marca claseMarca) {
        modelo.setNombre(nombre);
        modelo.setMarca(claseMarca);
        controlPersis.modificarModelo(modelo);
    }

    public List<Tecnico> traerTecnicos() {
        return controlPersis.traerTecnicos();
    }

    public void agregarTecnico(String nombre, String email, String direccion, String tel, String legajo) {
        Tecnico tec = new Tecnico();
        tec.setNombre(nombre);
        tec.setEmail(email);
        tec.setDireccion(direccion);
        tec.setTelefono(tel);
        tec.setLegajo(legajo);
        controlPersis.agregarTecnico(tec);
    }

    public void borrarTecnico(int num_tec) {
        controlPersis.borrarTecnico(num_tec);
    }

    public Tecnico traerTecnico(int num_tec) {
        return controlPersis.traerTecnico(num_tec);
    }

    public void modificarTecnico(Tecnico tecnico, String nombre, String email, String direccion, String tel, String legajo) {
        tecnico.setDireccion(direccion);
        tecnico.setNombre(nombre);
        tecnico.setEmail(email);
        tecnico.setTelefono(legajo);
        tecnico.setLegajo(legajo);
        controlPersis.modificarTecnico(tecnico);
    }
}
