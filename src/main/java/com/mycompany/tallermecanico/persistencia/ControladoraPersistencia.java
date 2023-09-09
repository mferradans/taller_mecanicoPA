
package com.mycompany.tallermecanico.persistencia;

import com.mycompany.tallermecanico.logica.Cliente;
import com.mycompany.tallermecanico.logica.Marca;
import com.mycompany.tallermecanico.logica.Modelo;
import com.mycompany.tallermecanico.logica.Tecnico;
import com.mycompany.tallermecanico.logica.Vehiculo;
import com.mycompany.tallermecanico.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    ClienteJpaController  clienteJpa = new ClienteJpaController();
    VehiculoJpaController vehiculoJpa = new VehiculoJpaController();
    MarcaJpaController marcaJpa = new MarcaJpaController();
    ModeloJpaController modeloJpa = new ModeloJpaController();
    TecnicoJpaController tecJpa = new TecnicoJpaController();

    public void guardarCliente(Cliente cliente) {
        clienteJpa.create(cliente);
    }

   public ArrayList<Cliente> listarClientes() {
        List<Cliente> listita= clienteJpa.findClienteEntities();
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente> (listita);
        return listaClientes;
    }

    public void guardarVehiculo(Vehiculo vehiculo) {
        vehiculoJpa.create(vehiculo);
    }

    public List<Cliente> traerClientes() {
    return clienteJpa.findClienteEntities();
    }

    public void borrarCliente(int num_cliente) {
        try {
            clienteJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente traerCliente(int num_cliente) {
        return clienteJpa.findCliente(num_cliente);
    }

    public void modificarCliente(Cliente cliente) {
        try {
            clienteJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Vehiculo> traerVehiculos() {
        return vehiculoJpa.findVehiculoEntities();
    }

    public Vehiculo traerVehiculo(int num_veh) {
        return vehiculoJpa.findVehiculo(num_veh);
    }

    public void modificarVehiculo(Vehiculo vehiculo) {
        try {
            vehiculoJpa.edit(vehiculo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarVehiculo(int num_veh) {
        try {
            vehiculoJpa.destroy(num_veh);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Modelo> traerModelos() {
        return modeloJpa.findModeloEntities();
                
    }

    public List<Marca> traerMarcas() {
        return marcaJpa.findMarcaEntities();

    }

    public Marca traerMarca(int num) {
        return marcaJpa.findMarca(num);
    }

    public Modelo traerModelo(int idModelo) {
        return modeloJpa.findModelo(idModelo);
    }

    public void agregarMarca(Marca marca) {
        marcaJpa.create(marca);
    }

    public void agregarModelo(Modelo modelo) {
        modeloJpa.create(modelo);
    }

    public void modificarMarca(Marca marca) {
        try {
            marcaJpa.edit(marca);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarMarca(int num_marca) {
        try {
            marcaJpa.destroy(num_marca);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarModelo(int num_modelo) {
        try {
            modeloJpa.destroy(num_modelo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarModelo(Modelo modelo) {
        try {
            modeloJpa.edit(modelo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Tecnico> traerTecnicos() {
        return tecJpa.findTecnicoEntities();
    }

    public void agregarTecnico(Tecnico tec) {
        tecJpa.create(tec);
    }

    public void borrarTecnico(int num_tec) {
        try {
            tecJpa.destroy(num_tec);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Tecnico traerTecnico(int num_tec) {
        return tecJpa.findTecnico(num_tec);
    }

    public void modificarTecnico(Tecnico tecnico) {
        try {
            tecJpa.edit(tecnico);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
    
}
