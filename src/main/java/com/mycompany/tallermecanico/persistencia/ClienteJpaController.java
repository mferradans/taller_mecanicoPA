/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallermecanico.persistencia;

import com.mycompany.tallermecanico.logica.Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.tallermecanico.logica.Vehiculo;
import com.mycompany.tallermecanico.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public ClienteJpaController(){
        emf=Persistence.createEntityManagerFactory("taller_mecanicoPU");
    }   
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) {
        if (cliente.getListaVehiculo() == null) {
            cliente.setListaVehiculo(new LinkedList<Vehiculo>());
        }
        EntityManager em = null;
        
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LinkedList<Vehiculo> attachedListaVehiculo = new LinkedList<Vehiculo>();
            for (Vehiculo listaVehiculoVehiculoToAttach : cliente.getListaVehiculo()) {
                listaVehiculoVehiculoToAttach = em.getReference(listaVehiculoVehiculoToAttach.getClass(), listaVehiculoVehiculoToAttach.getId_vehiculo());
                attachedListaVehiculo.add(listaVehiculoVehiculoToAttach);
            }
            cliente.setListaVehiculo(attachedListaVehiculo);
            em.persist(cliente);
            for (Vehiculo listaVehiculoVehiculo : cliente.getListaVehiculo()) {
                Cliente oldClienteOfListaVehiculoVehiculo = listaVehiculoVehiculo.getCliente();
                listaVehiculoVehiculo.setCliente(cliente);
                listaVehiculoVehiculo = em.merge(listaVehiculoVehiculo);
                if (oldClienteOfListaVehiculoVehiculo != null) {
                    oldClienteOfListaVehiculoVehiculo.getListaVehiculo().remove(listaVehiculoVehiculo);
                    oldClienteOfListaVehiculoVehiculo = em.merge(oldClienteOfListaVehiculoVehiculo);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getId_cliente());
            LinkedList<Vehiculo> listaVehiculoOld = persistentCliente.getListaVehiculo();
            LinkedList<Vehiculo> listaVehiculoNew = cliente.getListaVehiculo();
            LinkedList<Vehiculo> attachedListaVehiculoNew = new LinkedList<Vehiculo>();
            for (Vehiculo listaVehiculoNewVehiculoToAttach : listaVehiculoNew) {
                listaVehiculoNewVehiculoToAttach = em.getReference(listaVehiculoNewVehiculoToAttach.getClass(), listaVehiculoNewVehiculoToAttach.getId_vehiculo());
                attachedListaVehiculoNew.add(listaVehiculoNewVehiculoToAttach);
            }
            listaVehiculoNew = attachedListaVehiculoNew;
            cliente.setListaVehiculo(listaVehiculoNew);
            cliente = em.merge(cliente);
            for (Vehiculo listaVehiculoOldVehiculo : listaVehiculoOld) {
                if (!listaVehiculoNew.contains(listaVehiculoOldVehiculo)) {
                    listaVehiculoOldVehiculo.setCliente(null);
                    listaVehiculoOldVehiculo = em.merge(listaVehiculoOldVehiculo);
                }
            }
            for (Vehiculo listaVehiculoNewVehiculo : listaVehiculoNew) {
                if (!listaVehiculoOld.contains(listaVehiculoNewVehiculo)) {
                    Cliente oldClienteOfListaVehiculoNewVehiculo = listaVehiculoNewVehiculo.getCliente();
                    listaVehiculoNewVehiculo.setCliente(cliente);
                    listaVehiculoNewVehiculo = em.merge(listaVehiculoNewVehiculo);
                    if (oldClienteOfListaVehiculoNewVehiculo != null && !oldClienteOfListaVehiculoNewVehiculo.equals(cliente)) {
                        oldClienteOfListaVehiculoNewVehiculo.getListaVehiculo().remove(listaVehiculoNewVehiculo);
                        oldClienteOfListaVehiculoNewVehiculo = em.merge(oldClienteOfListaVehiculoNewVehiculo);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cliente.getId_cliente();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getId_cliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            LinkedList<Vehiculo> listaVehiculo = cliente.getListaVehiculo();
            for (Vehiculo listaVehiculoVehiculo : listaVehiculo) {
                listaVehiculoVehiculo.setCliente(null);
                listaVehiculoVehiculo = em.merge(listaVehiculoVehiculo);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cliente findCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
